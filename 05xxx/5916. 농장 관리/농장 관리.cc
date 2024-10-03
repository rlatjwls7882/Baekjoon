#include<bits/stdc++.h>
using namespace std;

const int MAX = 100000;

int _size=1;
long long lazy[MAX*4], arr[MAX*4];
int subTreeCnt[MAX];
int nodeNum[MAX], nodeCnt, groupNum[MAX], groupCnt, parent[MAX], depth[MAX], head[MAX];
vector<vector<int>> conn(MAX), child(MAX);

void dfs1(int cur) {
    subTreeCnt[cur]=1;
    for(int next:conn[cur]) {
        if(!subTreeCnt[next]) {
            dfs1(next);
            subTreeCnt[cur] += subTreeCnt[next];
            child[cur].push_back(next);
            if(subTreeCnt[child[cur].front()] < subTreeCnt[child[cur].back()]) {
                swap(child[cur].front(), child[cur].back());
            }
        }
    }
}

void dfs2(int cur, int curDepth) {
    int u = nodeNum[cur] = nodeCnt++;
    groupNum[u] = groupCnt;
    depth[u] = curDepth;
    if(head[groupCnt]==-1) head[groupCnt]=u;

    if(child[cur].empty()) {
        groupCnt++;
        return;
    }

    for(int next:child[cur]) {
        dfs2(next, curDepth+1);
        parent[nodeNum[next]]=u;
    }
}

void updateLazy(int nodeL, int nodeR, int nodeNum) {
    if(lazy[nodeNum]) {
        arr[nodeNum] += (nodeR-nodeL+1)*lazy[nodeNum];
        if(nodeL!=nodeR) {
            lazy[nodeNum*2] += lazy[nodeNum];
            lazy[nodeNum*2+1] += lazy[nodeNum];
        }
        lazy[nodeNum]=0;
    }
}

long long segFind(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    updateLazy(nodeL, nodeR, nodeNum);
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return segFind(L, R, nodeNum*2, nodeL, mid)+segFind(L, R, nodeNum*2+1, mid+1, nodeR);
}

void updateRange(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    updateLazy(nodeL, nodeR, nodeNum);
    if(R<nodeL || nodeR<L) return;
    if(L<=nodeL && nodeR<=R) {
        lazy[nodeNum]++;
        updateLazy(nodeL, nodeR, nodeNum);
        return;
    }
    int mid = (nodeL+nodeR)/2;
    updateRange(L, R, nodeNum*2, nodeL, mid);
    updateRange(L, R, nodeNum*2+1, mid+1, nodeR);
    arr[nodeNum] = arr[nodeNum*2]+arr[nodeNum*2+1];
}

void update(int u, int v) {
    while(groupNum[u]!=groupNum[v]) {
        int uHead = head[groupNum[u]], vHead = head[groupNum[v]];
        if(depth[uHead] > depth[vHead]) {
            updateRange(uHead, u);
            u = parent[uHead];
        } else {
            updateRange(vHead, v);
            v = parent[vHead];
        }
    }
    updateRange(min(u, v)+1, max(u, v));
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<n-1;i++) {
        int u, v; cin >> u >> v;
        conn[u-1].push_back(v-1);
        conn[v-1].push_back(u-1);
    }
    dfs1(0);
    fill(head, head+n, -1);
    dfs2(0, 0);

    while(_size<n) _size<<=1;
    _size<<=1;

    while(m-->0) {
        char w; int u, v; cin >> w >> u >> v;
        u = nodeNum[u-1];
        v = nodeNum[v-1];
        if(w=='P') {
            update(u, v);
        } else {
            cout << segFind(max(u, v), max(u, v)) << '\n';
        }
    }
}