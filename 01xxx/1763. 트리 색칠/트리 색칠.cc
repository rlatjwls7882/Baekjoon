#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef __int128 i128;

struct Faker {
    struct E {
        int x;
        ll a, b;
        bool operator<(const E& e) const {
            i128 l = (i128)b*e.a;
            i128 r = (i128)e.b*a;
            if(l!=r) return l<r;
            return x>e.x;
        }
    };
    int n, root;
    vector<ll> a, b;
    vector<int> par, del;
    Faker(int n, int root) : n(n), root(root), a(n+1), b(n+1), par(n+1), del(n+1) {}
    int find(int x) { return del[x] ? par[x]=find(par[x]) : x; }
    ll res() {
        priority_queue<E> pq;
        ll ret=0;
        for(int i=1;i<=n;i++) {
            ret+=a[i]*b[i];
            if(i!=root) pq.push({i, a[i], b[i]});
        }
        for(int i=1;i<n;i++) {
            while(true) {
                auto [x, ca, cb] = pq.top(); pq.pop();
                if(del[x] || ca!=a[x] || cb!=b[x]) continue;
                int p=find(par[x]);
                ret+=b[x]*a[p];
                del[x]=1;
                par[x]=p;
                a[p]+=a[x];
                b[p]+=b[x];
                if(p!=root) pq.push({p, a[p], b[p]});
                break;
            }
        }
        return ret;
    }
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, r; cin >> n >> r;
    Faker faker(n, r);
    for(int i=1;i<=n;i++) {
        ll c; cin >> c;
        faker.a[i]=1;
        faker.b[i]=c;
    }
    for(int i=1;i<=n;i++) {
        int u, v; cin >> u >> v;
        faker.par[v]=u;
    }
    cout << faker.res();
}