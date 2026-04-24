#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef __int128 i128;

struct Faker {
    struct Edge {
        ll x, a, b;
        bool operator<(const Edge& e) const {
            bool good1 = a<=b;
            bool good2 = e.a<=e.b;
            if(good1!=good2) return good1<good2;
            if(good1 && a!=e.a) return a>e.a;
            if(!good1 && b!=e.b) return b<e.b;
            return x>e.x;
        }
    };
    int n, root;
    vector<ll> a, b;
    vector<int> par, used, head, tail, nxt;
    Faker(int n, int root) : n(n), root(root), a(n+1), b(n+1), par(n+1), used(n+1), head(n+1), tail(n+1), nxt(n+1) { for(int i=1;i<=n;i++) head[i]=tail[i]=i; }
    int find(int x) { return used[x] ? par[x]=find(par[x]) : x; }
    void link(int p, int x) {
        if(!head[p]) head[p] = head[x];
        else nxt[tail[p]] = head[x];
        tail[p] = tail[x];
    }
    ll res() {
        priority_queue<Edge> pq;
        for(int i=1;i<=n;i++) {
            if(i!=root) pq.push({i, a[i], b[i]});
        }
        for(int i=1;i<n;i++) {
            while(true) {
                auto [x, ca, cb] = pq.top(); pq.pop();
                if(used[x] || ca!=a[x] || cb!=b[x]) continue;
                int p=find(par[x]);
                link(p, x);
                ll plus = max(0LL, a[x]-b[p]);
                a[p]+=plus;
                b[p]+=b[x]-a[x]+plus;
                used[x]=1;
                par[x]=p;
                if(p!=root) pq.push({p, a[p], b[p]});
                break;
            }
        }
        return a[root];
    }
    vector<int> trace() {
        vector<int> ret;
        for(int cur=head[root];cur;cur=nxt[cur]) ret.push_back(cur);
        return ret;
    }
};

int par[100'001];
vector<int> vis;
vector<vector<int>> conn;

void dfs(int cur=1) {
    vis[cur]=true;
    for(int next:conn[cur]) {
        if(!vis[next]) {
            dfs(next);
            par[next]=cur;
        }
    }
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        conn = vector<vector<int>>(n+1);
        vis = vector<int>(n+1);
        Faker f(n, 1);
        for(int i=2;i<=n;i++) {
            ll a, b; cin >> a >> b;
            f.a[i]=a;
            f.b[i]=b;
        }
        for(int i=0;i<n-1;i++) {
            int u, v; cin >> u >> v;
            conn[u].push_back(v);
            conn[v].push_back(u);
        }
        dfs(1);
        for(int i=2;i<=n;i++) f.par[i]=par[i];
        cout << f.res() << '\n';
    }
}