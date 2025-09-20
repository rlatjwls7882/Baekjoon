#include<bits/stdc++.h>
using namespace std;

const int MAX = 222'222;

int subTreeCnt[MAX];
vector<vector<int>> conn(MAX), child(MAX);

int nodeCnt, nodeInverseNum[MAX], nodeNum[MAX], groupCnt, groupNum[MAX], head[MAX], parent[MAX], depth[MAX];

int _size=1, arr[MAX*4], lazy[MAX*4];

int parentForDSU[MAX];

int _find(int x) {
    if(x==parentForDSU[x]) return x;
    return parentForDSU[x] = _find(parentForDSU[x]);
}

void _union(int x, int y) {
    x = parentForDSU[x];
    y = parentForDSU[y];
    if(x>y) parentForDSU[x]=y;
    else parentForDSU[y]=x;
}

int dfs1(int cur) {
    subTreeCnt[cur]=1;
    for(int next:conn[cur]) {
        if(!subTreeCnt[next]) {
            subTreeCnt[cur] += dfs1(next);
            child[cur].push_back(next);
            if(subTreeCnt[child[cur].front()] < subTreeCnt[child[cur].back()]) swap(child[cur].front(), child[cur].back());
        }
    }
    return subTreeCnt[cur];
}

void dfs2(int cur, int curDepth) {
    int u = nodeNum[cur] = nodeCnt++;
    nodeInverseNum[u] = cur;
    depth[u] = curDepth;

    groupNum[u] = groupCnt;
    if(head[groupCnt]==-1) head[groupCnt]=u;

    if(child[cur].empty()) {
        groupCnt++;
        return;
    }

    for(int next:child[cur]) {
        dfs2(next, curDepth+1);
        parent[nodeNum[next]] = u;
    }
}

void updateLazy(int nodeNum) {
    if(lazy[nodeNum]) {
        if(nodeNum<_size/2) {
            lazy[nodeNum*2] += lazy[nodeNum];
            lazy[nodeNum*2+1] += lazy[nodeNum];
        } else {
            arr[nodeNum] += lazy[nodeNum];
        }
    }
}

void updateRange(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    if(R<nodeL || nodeR<L) return;
    if(L<=nodeL && nodeR<=R) {
        lazy[nodeNum]++;
    } else {
        int mid = (nodeL+nodeR)/2;
        updateRange(L, R, nodeNum*2, nodeL, mid);
        updateRange(L, R, nodeNum*2+1, mid+1, nodeR);
    }
}

void query(int u, int v) {
    u = nodeNum[u-1];
    v = nodeNum[v-1];
    while(groupNum[u]!=groupNum[v]) {
        int uHead = head[groupNum[u]], vHead = head[groupNum[v]];
        if(depth[uHead]>depth[vHead]) {
            updateRange(uHead, u);
            u = parent[uHead];
        } else {
            updateRange(vHead, v);
            v = parent[vHead];
        }
    }
    updateRange(min(u, v)+1, max(u, v));
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, q; cin >> n >> q;
    for(int i=0;i<n-1;i++) {
        int u, v; cin >> u >> v;
        conn[u-1].push_back(v-1);
        conn[v-1].push_back(u-1);
    }
    dfs1(0);
    memset(head, -1, sizeof head);
    dfs2(0, 0);

    while(_size<n) _size<<=1;
    _size<<=1;

    while(q--) {
        int u, v; cin >> u >> v;
        query(u, v);
    }

    int c=0;
    for(int i=1;i<_size/2+n;i++) {
        updateLazy(i);
        if(i>=_size/2) c = max(arr[i], c);
    }

    for(int i=0;i<n;i++) parentForDSU[i]=i;
    for(int i=_size/2;i<_size/2+n;i++) {
        if(c==arr[i]) _union(nodeInverseNum[i-_size/2], nodeInverseNum[parent[i-_size/2]]);
    }

    for(int i=0;i<n;i++) {
        if(parentForDSU[i]!=i) {
            cout << parentForDSU[i]+1 << ' ' << i+1 << ' ' << c;
            return 0;
        }
    }
}