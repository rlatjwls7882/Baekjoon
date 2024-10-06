#include<bits/stdc++.h>
using namespace std;

const long long INF = 1000000000000000;
const int MAX = 100000;

long long _size=1, arr[MAX*4], lazy[MAX*4];
int subTreeCnt[MAX];
int nodeNum[MAX], nodeCnt, groupNum[MAX], groupCnt, head[MAX], parent[MAX], depth[MAX];
vector<vector<int>> child(MAX);

void dfs1(int cur) {
    subTreeCnt[cur]=1;
    for(int &next:child[cur]) {
        dfs1(next);
        subTreeCnt[cur] += subTreeCnt[next];
        if(subTreeCnt[child[cur][0]] < subTreeCnt[next]) {
            swap(child[cur][0], next);
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
        arr[nodeNum] += lazy[nodeNum];
        if(nodeL!=nodeR) {
            lazy[nodeNum*2] += lazy[nodeNum];
            lazy[nodeNum*2+1] += lazy[nodeNum];
        }
        lazy[nodeNum]=0;
    }
}

void updateRange(int L, int R, long long val, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
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

void updateQuery(int u, long long val) {
    u = nodeNum[u];
    while(groupNum[u] != 0) {
        int uHead = head[groupNum[u]];
        updateRange(uHead, u, val);
        u = parent[uHead];
    }
    updateRange(0, u, val);
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    for(int i=1;i<n;i++) {
        int p; cin >> p;
        child[p-1].push_back(i);
    }
    long long A[n], C[n];
    for(int i=0;i<n;i++) cin >> A[i];
    for(int i=0;i<n;i++) cin >> C[i];

    dfs1(0);
    fill(head, head+n, -1);
    dfs2(0, 0);

    while(_size<n) _size<<=1;
    _size<<=1;
    fill(arr+_size/2+n, arr+MAX*4, INF);
    for(int i=0;i<n;i++) updateQuery(i, A[i]-C[i]);

    int q; cin >> q;
    while(q-->-1) {
        if(lazy[1]+arr[1]>=0) cout << "Yes\n";
        else cout << "No\n";
        if(q==-1) break;

        int t, v, x; cin >> t >> v >> x;
        if(t==1) {
            updateQuery(v-1, x-A[v-1]);
            A[v-1]=x;
        } else {
            updateQuery(v-1, C[v-1]-x);
            C[v-1]=x;
        }
    }
}