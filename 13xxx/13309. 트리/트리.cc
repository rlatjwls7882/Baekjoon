#include<bits/stdc++.h>
using namespace std;

const int MAX = 200000;

int _size=1;
bool arr[MAX*4];
int parent[MAX];
int subTreeCnt[MAX];
int nodeNum[MAX], nodeCnt, groupNum[MAX], groupCnt, depth[MAX], head[MAX];
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

void update(int i) {
    i = nodeNum[i]+_size/2;
    arr[i]=false;
    while(i>1) {
        i/=2;
        arr[i] = arr[i*2]&arr[i*2+1];
    }
}

bool segFind(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    if(R<nodeL || nodeR<L) return true;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return segFind(L, R, nodeNum*2, nodeL, mid)&segFind(L, R, nodeNum*2+1, mid+1, nodeR);
}

bool chk(int u, int v) {
    bool ret=true;
    u = nodeNum[u];
    v = nodeNum[v];
    while(groupNum[u]!=groupNum[v]) {
        int uHead = head[groupNum[u]], vHead = head[groupNum[v]];
        if(depth[uHead] > depth[vHead]) {
            ret &= segFind(uHead, u);
            u = parent[uHead];
        } else {
            ret &= segFind(vHead, v);
            v = parent[vHead];
        }
    }
    return ret&segFind(min(u, v)+1, max(u, v));
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, q; cin >> n >> q;
    for(int i=1;i<n;i++) {
        int a; cin >> a;
        child[a-1].push_back(i);
    }
    dfs1(0);
    fill(head, head+n, -1);
    dfs2(0, 0);

    while(_size<n) _size<<=1;
    _size <<=1;
    fill(arr, arr+_size, true);

    while(q-->0) {
        int b, c, d; cin >> b >> c >> d;
        bool ret = chk(b-1, c-1);
        if(ret) {
            cout << "YES\n";
            if(d) update(b-1);
        } else {
            cout << "NO\n";
            if(d) update(c-1);
        }
    }
}