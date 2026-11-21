#include<bits/stdc++.h>
using namespace std;

const int MAX = 100000;

int _size=1;
int arr[MAX*4];
int subTreeCnt[MAX];
int nodeNum[MAX], nodeCnt, groupNum[MAX], groupCnt, depth[MAX], head[MAX], parent[MAX];
vector<vector<int>> conn(MAX), child(MAX);

void dfs1(int cur) {
    subTreeCnt[cur]=1;
    for(int next:conn[cur]) {
        if(!subTreeCnt[next]) {
            dfs1(next);
            subTreeCnt[cur] += subTreeCnt[next];
            child[cur].push_back(next);
            if(subTreeCnt[child[cur].front()] < subTreeCnt[child[cur].back()]) swap(child[cur].front(), child[cur].back());
        }
    }
}

void dfs2(int cur, int curDepth) {
    int u = nodeNum[cur] = nodeCnt++;
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

void construct() {
    for(int i=_size/2-1;i>0;i--) {
        arr[i] = arr[i*2] ^ arr[i*2+1];
    }
}

void update(int i, int val) {
    i = nodeNum[i]+_size/2;
    arr[i] = val;
    while(i>1) {
        i/=2;
        arr[i] = arr[i*2] ^ arr[i*2+1];
    }
}

int segFind(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return segFind(L, R, nodeNum*2, nodeL, mid) ^ segFind(L, R, nodeNum*2+1, mid+1, nodeR);
}

int findTotalE(int u, int v) {
    int ret=0;
    u = nodeNum[u];
    v = nodeNum[v];
    while(groupNum[u]!=groupNum[v]) {
        int uHead = head[groupNum[u]], vHead = head[groupNum[v]];
        if(depth[uHead] > depth[vHead]) {
            ret ^= segFind(uHead, u);
            u = parent[uHead];
        } else {
            ret ^= segFind(vHead, v);
            v = parent[vHead];
        }
    }
    return ret ^ segFind(min(u, v), max(u, v));
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, Q; cin >> N >> Q;
    int e[N];
    for(int i=0;i<N;i++) cin >> e[i];

    for(int i=0;i<N-1;i++) {
        int a, b; cin >> a >> b;
        conn[a-1].push_back(b-1);
        conn[b-1].push_back(a-1);
    }

    dfs1(0);
    fill(head, head+N, -1);
    dfs2(0, 0);

    while(_size<N) _size<<=1;
    _size<<=1;

    for(int i=0;i<N;i++) arr[_size/2+nodeNum[i]]=e[i];
    construct();

    while(Q-->0) {
        int a, b, c; cin >> a >> b >> c;
        if(a==1) update(b-1, c);
        else cout << findTotalE(b-1, c-1) << '\n';
    }
}