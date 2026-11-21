#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acos(-1);

struct HopcroftKarp { // O(EV^(1/2))
    const int aSZ, bSZ;
    vector<unsigned char> used;
    vector<int> a, b, level;
    vector<vector<int>> conn;

    HopcroftKarp(int _sz1, int _sz2):aSZ(_sz1), bSZ(_sz2) {
        used = vector<unsigned char>(aSZ);
        level = vector<int>(aSZ);
        a = vector<int>(aSZ, -1);
        b = vector<int>(bSZ, -1);
        conn = vector<vector<int>>(aSZ);
    }

    void edge(int u, int v) {
        conn[u].push_back(v);
    }

    void bfs() {
        queue<int> q;
        for(int i=0;i<aSZ;i++) {
            if(!used[i]) {
                level[i]=0;
                q.push(i);
            } else {
                level[i]=INF;
            }
        }
        while(!q.empty()) {
            int cur = q.front(); q.pop();
            for(int next:conn[cur]) {
                if(b[next]!=-1 && level[b[next]]==INF) {
                    level[b[next]]=level[cur]+1;
                    q.push(b[next]);
                }
            }
        }
    }

    bool dfs(int cur) {
        for(int next:conn[cur]) {
            if(b[next]==-1 || level[b[next]]==level[cur]+1 && dfs(b[next])) {
                used[cur]=true;
                b[next]=cur;
                a[cur]=next;
                return true;
            }
        }
        return false;
    }

    int res() {
        int ret=0;
        while(true) {
            bfs();
            int flow=0;
            for(int i=0;i<aSZ;i++) flow+=!used[i] && dfs(i);
            if(!flow) break;
            ret+=flow;
        }
        return ret;
    }

    vector<vector<int>> cover() {
        auto visA = vector<unsigned char>(aSZ);
        auto visB = vector<unsigned char>(bSZ);

        queue<int> q;
        for(int i=0;i<aSZ;i++) {
            if(a[i]==-1) {
                q.push(i);
                visA[i]=true;
            }
        }
        while(!q.empty()) {
            int cur = q.front(); q.pop();
            for(int next:conn[cur]) {
                if(!visB[next] && b[next]!=-1 && !visA[b[next]]) {
                    visB[next]=true;
                    visA[b[next]]=true;
                    q.push(b[next]);
                }
            }
        }
        vector<vector<int>> ret(2);
        for(int i=0;i<aSZ;i++) if(!visA[i]) ret[0].push_back(i);
        for(int i=0;i<bSZ;i++) if(visB[i]) ret[1].push_back(i);
        return ret;
    }
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;
    HopcroftKarp hk(n, m);

    for(int i=0;i<n;i++) {
        int k; cin >> k;
        while(k--) {
            int j; cin >> j;
            hk.edge(i, j-1);
        }
    }
    cout << hk.res() << '\n';

    auto res = hk.cover();
    for(auto &e:res) {
        cout << e.size();
        for(int ee:e) cout << ' ' << ee+1;
        cout << '\n';
    }
}