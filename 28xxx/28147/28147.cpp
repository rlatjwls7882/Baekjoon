#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef long double ld;

struct Faker {
    struct Edge {
        int x;
        ld a, b;
        bool operator<(const Edge& e) const {
            ld l = b*e.a;
            ld r = e.b*a;
            if(l!=r) return l<r;
            return x>e.x;
        }
    };
    int n, root;
    vector<ld> a, b;
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
        ll ret=0;
        for(int i=1;i<=n;i++) {
            ret+=a[i]*b[i];
            if(i!=root) pq.push({i, a[i], b[i]});
        }
        for(int i=0;i<n;i++) {
            while(true) {
                auto [x, ca, cb] = pq.top(); pq.pop();
                if(used[x] || ca!=a[x] || cb!=b[x]) continue;
                int p=find(par[x]);
                link(p, x);
                ret+=b[x]*a[p];
                used[x]=1;
                par[x]=p;
                a[p]+=a[x]*(1-b[p]);
                b[p]+=b[x]*(1-b[p]);
                if(p!=root) pq.push({p, a[p], b[p]});
                break;
            }
        }
        return ret;
    }
    vector<int> trace() {
        vector<int> ret;
        for(int cur=head[root];cur;cur=nxt[cur]) ret.push_back(cur);
        return ret;
    }
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    Faker faker(n, 0);
    for(int i=1;i<=n;i++) {
        ll c, d; ld p; cin >> c >> p >> d;
        faker.par[i]=d;
        faker.a[i]=c;
        faker.b[i]=1-p;
    }
    faker.res();
    auto ret = faker.trace();
    for(auto e:ret) cout << e << '\n';
}