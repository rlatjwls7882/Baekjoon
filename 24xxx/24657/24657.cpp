#include<bits/stdc++.h>
using namespace std;

const int MAX = 200000;

struct Node { int a, b, c; };

int n, m, res[MAX], resCnt=1;
int _size=1; bool arr[MAX*4], lazy[MAX*4];
int subTreeCnt[MAX];
int nodeNum[MAX], nodeNumToI[MAX], nodeCnt, groupNum[MAX], groupCnt, head[MAX], depth[MAX], parent[MAX];
vector<vector<pair<int, int>>> conn(MAX);
vector<vector<int>> child(MAX);
int IToRoadIdx[MAX];
vector<Node> v;

void dfs1(int cur) {
    subTreeCnt[cur]=1;
    for(auto next:conn[cur]) {
        if(!subTreeCnt[next.first]) {
            dfs1(next.first);
            subTreeCnt[cur] += subTreeCnt[next.first];
            child[cur].push_back(next.first);
            IToRoadIdx[next.first]=next.second;
            if(subTreeCnt[child[cur].front()] < subTreeCnt[child[cur].back()]) {
                swap(child[cur].front(), child[cur].back());
            }
        }
    }
}

void dfs2(int cur, int curDepth) {
    int u = nodeNum[cur] = nodeCnt++;
    nodeNumToI[u]=cur;
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
    if(!lazy[nodeNum]) {
        arr[nodeNum] = false;
        if(nodeL!=nodeR) {
            lazy[nodeNum*2] = false;
            lazy[nodeNum*2+1] = false;
        }
        lazy[nodeNum]=true;
    }
}

void updateRange(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    if(R<nodeL || nodeR<L) return;
    updateLazy(nodeL, nodeR, nodeNum);
    if(L<=nodeL && nodeR<=R) {
        lazy[nodeNum]=false;
        return;
    }
    int mid = (nodeL+nodeR)/2;
    updateRange(L, R, nodeNum*2, nodeL, mid);
    updateRange(L, R, nodeNum*2+1, mid+1, nodeR);
    arr[nodeNum] = arr[nodeNum*2] | arr[nodeNum*2+1];
}

bool segFind(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    if(R<nodeL || nodeR<L) return false;
    updateLazy(nodeL, nodeR, nodeNum);
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return segFind(L, R, nodeNum*2, nodeL, mid) | segFind(L, R, nodeNum*2+1, mid+1, nodeR);
}

int findQuery(int u, int v) {
    int sum=false;
    u = nodeNum[u];
    v = nodeNum[v];
    while(groupNum[u]!=groupNum[v]) {
        int uHead = head[groupNum[u]], vHead = head[groupNum[v]];
        if(depth[uHead] > depth[vHead]) {
            sum |= segFind(uHead, u);
            u = parent[uHead];
        } else {
            sum |= segFind(vHead, v);
            v = parent[vHead];
        }
    }
    return sum | segFind(min(u, v)+1, max(u, v));
}

void updateQuery(int u, int v) {
    u = nodeNum[u];
    v = nodeNum[v];
    vector<int> change;
    while(groupNum[u]!=groupNum[v]) {
        int uHead = head[groupNum[u]], vHead = head[groupNum[v]];
        if(depth[uHead] > depth[vHead]) {
            updateRange(uHead, u);
            for(int i=uHead;i<=u;i++) change.push_back(IToRoadIdx[nodeNumToI[i]]);
            u = parent[uHead];
        } else {
            updateRange(vHead, v);
            for(int i=vHead;i<=v;i++) change.push_back(IToRoadIdx[nodeNumToI[i]]);
            v = parent[vHead];
        }
    }
    updateRange(min(u, v)+1, max(u, v));
    for(int i=min(u, v)+1;i<=max(u, v);i++) change.push_back(IToRoadIdx[nodeNumToI[i]]);

    sort(change.begin(), change.end());
    for(int changeList:change) {
        if(!res[changeList]) res[changeList]=resCnt++;
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> n >> m;
    for(int i=0;i<m;i++) {
        int a, b, c; cin >> a >> b >> c;
        v.push_back({a-1, b-1, c});
        if(c==1) {
            conn[a-1].push_back({b-1, i});
            conn[b-1].push_back({a-1, i});
        }
    }
    dfs1(0);
    fill(head, head+n, -1);
    dfs2(0, 0);

    while(_size<n) _size<<=1;
    _size<<=1;
    for(int i=1;i<_size/2+n;i++) arr[i]=true;
    fill(lazy, lazy+_size, true);

    for(int i=0;i<m;i++) {
        if(!res[i] && findQuery(v[i].a, v[i].b)) {
            updateQuery(v[i].a, v[i].b);
        }
        if(!res[i]) res[i]=resCnt++;
    }
    for(int i=0;i<m;i++) cout << res[i] << ' ';
}