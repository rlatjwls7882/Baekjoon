#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define ff first
#define ss second

typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

ll sq(ll x) { return x*x; }
ld sq(ld x) { return x*x; }

const int MAX = 2001;
vector<vector<int>> conn(MAX);
int vis1[MAX], vis2[MAX];

void bfs1(int s) {
    memset(vis1, -1, sizeof vis1);
    vis1[s]=0;
    queue<int> q; q.push(s);
    while(!q.empty()) {
        int cur = q.front(); q.pop();
        for(int next:conn[cur]) {
            if(vis1[next]==-1) {
                vis1[next]=vis1[cur]+1;
                q.push(next);
            }
        }
    }
}

void bfs2(int s) {
    memset(vis2, -1, sizeof vis2);
    vis2[s]=0;
    queue<int> q; q.push(s);
    while(!q.empty()) {
        int cur = q.front(); q.pop();
        for(int next:conn[cur]) {
            if(vis2[next]==-1) {
                vis2[next]=vis2[cur]+1;
                q.push(next);
            }
        }
    }
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m, q; cin >> n >> m >> q;
    while(m--) {
        int u, v; cin >> u >> v;
        conn[v].push_back(u);
    }

    while(q--) {
        int u, v; cin >> u >> v;
        bfs1(u); bfs2(v);

        int mn=INF;
        for(int i=1;i<=n;i++) {
            if(vis1[i]!=-1 && vis2[i]!=-1) mn=min(mn, max(vis1[i], vis2[i]));
        }
        cout << (mn==INF ? -1 : mn) << '\n';
    }
}