#include<bits/stdc++.h>
using namespace std;

const int MAX = 100000;

struct Node {
    int v, w, i;
};

int _size=1;
int arr[MAX*4];
int subTreeCnt[MAX];
int nodeCnt, groupCnt;
int nodeNum[MAX], groupNum[MAX], depth[MAX], chainHead[MAX], chainTail[MAX], parent[MAX], edgeNum[MAX];
vector<vector<Node>> conn(MAX);
vector<vector<int>> child(MAX);

void dfs1(int cur) {
    subTreeCnt[cur]=1;
    for(auto &next:conn[cur]) {
        if(subTreeCnt[next.v]==0) {
            dfs1(next.v);
            subTreeCnt[cur] += subTreeCnt[next.v];
            child[cur].push_back(next.v);
            if(subTreeCnt[next.v]>subTreeCnt[conn[cur][0].v]) swap(next, conn[cur][0]);
        }
    }
}

void dfs2(int cur, int prev, int curDepth) {
    // 라벨링
    int u = nodeNum[cur] = nodeCnt++;
    groupNum[u] = groupCnt;
    depth[u] = curDepth;

    // 체인의 가장 위쪽값, 가장 아랫쪽 값 설정
    if(chainHead[groupCnt]==-1) chainHead[groupCnt]=u;
    chainTail[groupCnt]=u;

    // 이번 그룹 종료
    if(child[cur].empty()) {
        groupCnt++;
        return;
    }

    // 그룹 이어붙이기
    for(int next:child[cur]) {
        dfs2(next, cur, curDepth+1);
        parent[nodeNum[next]]=u;
    }
}

void construct() {
    for(int i=_size/2-1;i>0;i--) arr[i] = max(arr[i*2], arr[i*2+1]);
}

void update(int i, int val) {
    i = edgeNum[i]+_size/2;
    arr[i]=val;
    while(i>1) {
        i/=2;
        arr[i] = max(arr[i*2], arr[i*2+1]);
    }
}

int segFind(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return max(segFind(L, R, nodeNum*2, nodeL, mid), segFind(L, R, nodeNum*2+1, mid+1, nodeR));
}

int findMax(int u, int v) {
    int ret=0;
    u = nodeNum[u];
    v = nodeNum[v];
    if(groupNum[u]!=groupNum[v]) {
        while(true) {
            int uHead = chainHead[groupNum[u]], vHead = chainHead[groupNum[v]];
            if(depth[uHead] > depth[vHead]) {
                ret = max(ret, segFind(uHead, u));
                u = parent[uHead];
            } else {
                ret = max(ret, segFind(vHead, v));
                v = parent[vHead];
            }
            if(groupNum[u] == groupNum[v]) break;
        }
    }
    return max(ret, segFind(min(u, v)+1, max(u, v)));
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;

    // 간선 연결
    for(int i=0;i<n-1;i++) {
        int u, v, w; cin >> u >> v >> w;
        conn[u-1].push_back({v-1, w, i});
        conn[v-1].push_back({u-1, w, i});
    }

    // 각 정점마다의 서브트리의 수 계산
    dfs1(0);

    // 그룹 분할
    fill(chainHead, chainHead+MAX, -1);
    fill(chainTail, chainTail+MAX, -1);
    parent[0]=-1;
    dfs2(0, -1, 0);

    // 세그먼트 트리 생성
    while(_size<n) _size<<=1;
    _size<<=1;
    for(int cur=0;cur<n;cur++) {
        int u = nodeNum[cur];
        for(auto next:conn[cur]) {
            int v = nodeNum[next.v];
            if(depth[u] < depth[v]) {
                edgeNum[next.i] = v;
                arr[_size/2+v]=next.w;
            }
        }
    }
    construct();

    // 쿼리
    int m; cin >> m;
    while(m-->0) {
        int x; cin >> x;
        if(x==1) {
            int i, c; cin >> i >> c;
            update(i-1, c);
        } else {
            int u, v; cin >> u >> v;
            cout << findMax(u-1, v-1) << '\n';
        }
    }
}