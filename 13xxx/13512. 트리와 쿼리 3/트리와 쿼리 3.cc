#include<bits/stdc++.h>
using namespace std;

const int MAX = 100000;
int _size=1;
int arr[MAX*4];
int subTreeCnt[MAX], parent[MAX];
int nodeCnt, groupCnt, nodeNum[MAX], groupNum[MAX], head[MAX], depth[MAX];
int nodeNumToi[MAX];
vector<vector<int>> conn(MAX), child(MAX);

void dfs1(int cur) {
    subTreeCnt[cur]=1;
    for(int next:conn[cur]) {
        if(!subTreeCnt[next]) {
            dfs1(next);
            child[cur].push_back(next);
            subTreeCnt[cur] += subTreeCnt[next];
            if(subTreeCnt[child[cur][0]]<subTreeCnt[child[cur].back()]) {
                swap(child[cur][0], child[cur].back());
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

void update(int i) {
    i = nodeNum[i]+_size/2;
    if(arr[i]==MAX) arr[i]=i-_size/2;
    else arr[i]=MAX;
    while(i>1) {
        i/=2;
        arr[i] = min(arr[i*2], arr[i*2+1]);
    }
}

int segFind(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    if(R<nodeL || nodeR<L) return MAX;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return min(segFind(L, R, nodeNum*2, nodeL, mid), segFind(L, R, nodeNum*2+1, mid+1, nodeR));
}

int findMin(int v) {
    int ret = MAX;
    v = nodeNum[v];
    while(groupNum[v]!=0) {
        int vHead = head[groupNum[v]];
        ret = min(ret, segFind(vHead, v));
        v = parent[vHead];
    }
    ret = min(ret, segFind(0, v));
    return ret==MAX?-1:nodeNumToi[ret]+1;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    for(int i=0;i<n-1;i++) {
        int u, v; cin >> u >> v;
        conn[u-1].push_back(v-1);
        conn[v-1].push_back(u-1);
    }
    dfs1(0);
    fill(head, head+MAX, -1);
    dfs2(0, 0);
    for(int i=0;i<n;i++) nodeNumToi[nodeNum[i]]=i;

    while(_size<n) _size<<=1;
    _size<<=1;
    fill(arr, arr+_size, MAX);

    int M; cin >> M;
    while(M-->0) {
        int x; cin >> x;
        if(x==1) {
            int i; cin >> i;
            update(i-1);
        } else {
            int v; cin >> v;
            int ret = findMin(v-1);
            cout << ret << '\n';
        }
    }
}