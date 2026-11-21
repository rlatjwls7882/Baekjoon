#include<bits/stdc++.h>
using namespace std;

const int INF = 1000000000;
const int MAX = 100000;

int _size=1, arr[MAX*4], lazy[MAX*4];
int subTreeCnt[MAX];
int nodeNum[MAX], nodeCnt, groupNum[MAX], groupCnt, head[MAX], parent[MAX], depth[MAX];
vector<vector<int>> conn(MAX), child(MAX);

void dfs1(int cur) {
    subTreeCnt[cur]=1;
    for(int next:conn[cur]) {
        if(!subTreeCnt[next]) {
            dfs1(next);
            child[cur].push_back(next);
            subTreeCnt[cur] += subTreeCnt[next];
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

void construct() {
    for(int i=_size/2-1;i>0;i--) arr[i] = min(arr[i*2], arr[i*2+1]);
}

void updateLazy(int nodeL, int nodeR, int nodeNum) {
    if(lazy[nodeNum]) {
        arr[nodeNum] += lazy[nodeNum];
        if(nodeL!=nodeR) {
            lazy[nodeNum*2] += lazy[nodeNum];
            lazy[nodeNum*2+1] += lazy[nodeNum];
        }
        lazy[nodeNum]=0;
    }
}

void updateRange(int L, int R, int val, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    updateLazy(nodeL, nodeR, nodeNum);
    if(R<nodeL || nodeR<L) return;
    if(L<=nodeL && nodeR<=R) {
        lazy[nodeNum] += val;
        updateLazy(nodeL, nodeR, nodeNum);
        return;
    }
    int mid = (nodeL+nodeR)/2;
    updateRange(L, R, val, nodeNum*2, nodeL, mid);
    updateRange(L, R, val, nodeNum*2+1, mid+1, nodeR);
    arr[nodeNum] = min(arr[nodeNum*2], arr[nodeNum*2+1]);
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
    updateRange(min(u, v), max(u, v), val);
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
    fill(arr+_size/2+n, arr+MAX*4, INF);
    for(int i=_size/2;i<_size/2+n;i++) cin >> arr[nodeNum[i-_size/2]+_size/2];
    construct();

    int cnt=0;
    while(m-->0) {
        int x, y, w; cin >> x >> y >> w;
        updateQuery(x-1, y-1, -w);
        if(arr[1]+lazy[1]>=0) cnt++;
        else break;
    }
    cout << cnt;
}