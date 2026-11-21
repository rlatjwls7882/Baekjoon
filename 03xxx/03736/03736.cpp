#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acos(-1);

struct HopcroftKarp {
    const int SZ;
    vector<unsigned char> used;
    vector<int> a, b, level;
    vector<vector<int>> conn;
    HopcroftKarp(int aSZ, int bSZ=0):SZ(aSZ) {
        used=vector<unsigned char>(SZ);
        a=level=vector<int>(SZ);
        b=vector<int>(max(bSZ, SZ), -1);
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

int main() {
    cin.tie(0)->sync_with_stdio(0);
    while(true) {
        int n; cin >> n;
        if(cin.fail()) break;

        HopcroftKarp hk(n, 2*n);
        for(int i=0;i<n;i++) {
            string s; cin >> s >> s;
            int k = stoi(s.substr(1, s.length()-2));
            while(k--) {
                int next; cin >> next;
                hk.edge(i, next-n);
            }
        }
        cout << hk.res() << '\n';
    }
}