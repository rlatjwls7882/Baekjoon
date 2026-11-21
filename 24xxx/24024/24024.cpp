#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const int MAX = 200'001;
const ll LINF = 0x3f3f3f3f3f3f3f3f;

ll n, m, x, vis[MAX];

struct element {
    ll v, w, p;
    bool operator<(const element e) const {
        return w > e.w;
    }
};

vector<vector<element>> conn(MAX);

ll f(ll p) {
    priority_queue<element> pq; pq.push({1, 0});
    fill(vis, vis+n+1, LINF);

    while(!pq.empty()) {
        auto cur = pq.top(); pq.pop();
        if(cur.w>=vis[cur.v]) continue;
        vis[cur.v]=cur.w;
        for(auto next:conn[cur.v]) {
            ll nw = cur.w+next.w + (next.p==1 ? p : next.p==2 ? (x-p) : 0);
            if(nw<vis[next.v]) pq.push({next.v, nw});
        }
    }
    return vis[n];
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    cin >> n >> m >> x;
    while(m--) {
        ll u, v, w, p; cin >> u >> v >> w >> p;
        conn[u].push_back({v, w, p});
        conn[v].push_back({u, w, p});
    }

    ll l=0, r=x;
    while(l+2<r) {
        int p = (l*2+r)/3;
        int q = (l+r*2)/3;
        if(f(p)>=f(q)) r=q;
        else l=p;
    }

    ll res=0;
    while(l<=r) res = max(res, f(l++));
    cout << res;
}