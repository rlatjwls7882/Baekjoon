#include<bits/stdc++.h>
using namespace std;

const int INF = 100000000;
const int MAX = 100000;

int dsuPar[MAX];
long long _size=1, arr[MAX*4], bridge[MAX*4];
int subTreeCnt[MAX];
int nodeNum[MAX], nodeCnt, groupNum[MAX], groupCnt, head[MAX], parent[MAX], depth[MAX];
vector<vector<int>> conn(MAX), child(MAX);

int _find(int x) {
    if(dsuPar[x]==x) return x;
    return dsuPar[x] = _find(dsuPar[x]);
}

bool _union(int a, int b) {
    a = _find(a);
    b =  _find(b);
    if(a==b) return false;
    if(a>b) dsuPar[a]=b;
    else dsuPar[b]=a;
    return true;
}

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
    for(int i=_size/2-1;i>0;i--) {
        arr[i] = arr[i*2]+arr[i*2+1];
        bridge[i] = bridge[i*2]+bridge[i*2+1];
    }
}

void updateBridge(int i) {
    i += _size/2;
    bridge[i] = INF;
    while(i>1) {
        i/=2;
        bridge[i] = bridge[i*2]+bridge[i*2+1];
    }
}

void updateArr(int i, int val) {
    i += _size/2;
    arr[i] = val;
    while(i>1) {
        i/=2;
        arr[i] = arr[i*2]+arr[i*2+1];
    }
}

long long segFindArr(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return arr[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return segFindArr(L, R, nodeNum*2, nodeL, mid) + segFindArr(L, R, nodeNum*2+1, mid+1, nodeR);
}

long long segFindBridge(int L, int R, int nodeNum=1, int nodeL=0, int nodeR=_size/2-1) {
    if(R<nodeL || nodeR<L) return 0;
    if(L<=nodeL && nodeR<=R) return bridge[nodeNum];
    int mid = (nodeL+nodeR)/2;
    return segFindBridge(L, R, nodeNum*2, nodeL, mid) + segFindBridge(L, R, nodeNum*2+1, mid+1, nodeR);
}

long long query(int u, int v) {
    long long res=0;
    while(groupNum[u] != groupNum[v]) {
        int uHead = head[groupNum[u]], vHead = head[groupNum[v]];
        if(depth[uHead] > depth[vHead]) {
            res += segFindArr(uHead, u) + segFindBridge(uHead, u);
            u = parent[uHead];
        } else {
            res += segFindArr(vHead, v) + segFindBridge(vHead, v);
            v = parent[vHead];
        }
    }
    return res + segFindArr(min(u, v), max(u, v)) + segFindBridge(min(u, v)+1, max(u, v));
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int cnt[n];
    for(int i=0;i<n;i++) cin >> cnt[i];
    for(int i=0;i<n;i++) dsuPar[i]=i;

    vector<tuple<string, int, int>> v;
    int q; cin >> q;
    while(q-->0) {
        string s; int a, b; cin >> s >> a >> b;
        if(s[0]=='b') {
            if(_union(a-1, b-1)) {
                conn[a-1].push_back(b-1);
                conn[b-1].push_back(a-1);
                v.push_back({"yes", a-1, b-1});
            } else {
                v.push_back({"no", 0, 0});
            }
        } else if(s[0]=='p') {
            v.push_back({s, a-1, cnt[a-1]});
            cnt[a-1]=b;
        } else {
            v.push_back({s, a-1, b-1});
        }
    }

    // 다리 연결 확인
    vector<int> disconnected;
    for(int i=1;i<n;i++) {
        if(dsuPar[i]==i) {
            conn[0].push_back(i);
            disconnected.push_back(i);
        }
    }
    if(dsuPar[1]!=0) {
        conn[0].push_back(1);
        disconnected.push_back(1);
    }

    // hld
    dfs1(0);
    fill(head, head+n, -1);
    dfs2(0, 0);

    // segTree
    while(_size<n) _size<<=1;
    _size<<=1;
    for(int i:disconnected) bridge[nodeNum[i]+_size/2]=INF;
    for(int i=0;i<n;i++) arr[nodeNum[i]+_size/2]=cnt[i];
    construct();

    // Offline Query
    vector<string> res;
    for(int i=v.size()-1;i>=0;i--) {
        string s = get<0>(v[i]);
        int a = get<1>(v[i]), b = get<2>(v[i]);
        if(s[0]=='y') {
            updateBridge(max(nodeNum[a], nodeNum[b]));
            res.push_back(s);
        } else if(s[0]=='n') {
            res.push_back(s);
        } else if(s[0]=='p') {
            updateArr(nodeNum[a], b);
        } else {
            long long ret = query(nodeNum[a], nodeNum[b]);
            if(ret>=INF) res.push_back("impossible");
            else res.push_back(to_string(ret));
        }
    }
    for(int i=res.size()-1;i>=0;i--) cout << res[i] << '\n';
}