#include<bits/stdc++.h>
using namespace std;

const int MAX = 100000;

int _size=1, lazy[MAX*4], arr[MAX*4];
int subTreeCnt[MAX];
int nodeNum[MAX], nodeCnt, groupNum[MAX], groupCnt, head[MAX], parent[MAX], depth[MAX];
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
    if(lazy[nodeNum]!=-1) {
        arr[nodeNum] = lazy[nodeNum];
        if(nodeL!=nodeR) {
            lazy[nodeNum*2] = lazy[nodeNum];
            lazy[nodeNum*2+1] = lazy[nodeNum];
        }
        lazy[nodeNum]=-1;
    }
}

void updateRange(int L, int R, int val, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    updateLazy(nodeL, nodeR, nodeNum);
    if(R<nodeL || nodeR<L) return;
    if(L<=nodeL && nodeR<=R) {
        lazy[nodeNum]=val;
        updateLazy(nodeL, nodeR, nodeNum);
        return;
    }
    int mid = (nodeL+nodeR)/2;
    updateRange(L, R, val, nodeNum*2, nodeL, mid);
    updateRange(L, R, val, nodeNum*2+1, mid+1, nodeR);
    arr[nodeNum] = arr[nodeNum*2]+arr[nodeNum*2+1];
}

int segFind(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    updateLazy(nodeL, nodeR, nodeNum);
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return segFind(L, R, nodeNum*2, nodeL, mid) + segFind(L, R, nodeNum*2+1, mid+1, nodeR);
}

void updateQuery(int u, int v, int val) {
    u = nodeNum[u];
    v = nodeNum[v];
    while(groupNum[u] != groupNum[v]) {
        int uHead = head[groupNum[u]], vHead = head[groupNum[v]];
        if(depth[uHead] > depth[vHead]) {
            updateRange(uHead, u, val);
            u = parent[uHead];
        } else {
            updateRange(vHead, v, val);
            v = parent[vHead];
        }
    }
    updateRange(min(u, v)+1, max(u, v), val);
}

void findQuery(int u, int v) {
    int res=0;
    u = nodeNum[u];
    v = nodeNum[v];
    while(groupNum[u] != groupNum[v]) {
        int uHead = head[groupNum[u]], vHead = head[groupNum[v]];
        if(depth[uHead] > depth[vHead]) {
            res += segFind(uHead, u);
            u = parent[uHead];
        } else {
            res += segFind(vHead, v);
            v = parent[vHead];
        }
    }
    if(res + segFind(min(u, v)+1, max(u, v))) cout << "NO\n";
    else cout << "YES\n";
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, q; cin >> n >> q;
    for(int i=0;i<n-1;i++) {
        int u, v; cin >> u >> v;
        conn[u-1].push_back(v-1);
        conn[v-1].push_back(u-1);
    }
    dfs1(0);
    fill(head, head+MAX, -1);
    dfs2(0, 0);

    while(_size<n) _size<<=1;
    _size<<=1;
    fill(lazy, lazy+MAX*4, -1);

    while(q-->0) {
        int a, b, c, d; cin >> a >> b >> c >> d;
        updateQuery(a-1, b-1, 1);
        findQuery(c-1, d-1);
        updateQuery(a-1, b-1, 0);
    }
}