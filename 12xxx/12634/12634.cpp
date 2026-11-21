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
    const int SZ;
    vector<unsigned char> used;
    vector<int> a, b, level;
    vector<vector<int>> conn;

    HopcroftKarp(int aSZ, int bSZ=0):SZ(aSZ) {
        used = vector<unsigned char>(SZ);
        a = level = vector<int>(SZ);
        b = vector<int>(max(bSZ, SZ), -1);
        conn = vector<vector<int>>(SZ);
    }

    void edge(int u, int v) {
        conn[u].push_back(v);
    }

    void bfs() {
        queue<int> q;
        for(int i=0;i<SZ;i++) {
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
            for(int i=0;i<SZ;i++) flow+=!used[i] && dfs(i);
            if(!flow) break;
            ret+=flow;
        }
        return ret;
    }
};

int p[100][25];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int t; cin >> t;
    for(int tc=1;tc<=t;tc++) {
        int n, k; cin >> n >> k;
        HopcroftKarp hk(n);
        for(int i=0;i<n;i++) for(int j=0;j<k;j++) cin >> p[i][j];

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                bool cross=true;
                for(int kk=0;kk<k;kk++) {
                    if(p[i][kk]<=p[j][kk]) {
                        cross=false;
                        break;
                    }
                }
                if(cross) hk.edge(i, j);
            }
        }
        cout << "Case #" << tc << ": " << n-hk.res() << '\n';
    }
}