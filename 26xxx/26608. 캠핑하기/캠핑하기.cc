#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define f first
#define s second
#define all(x) x.begin(), x.end()
#define compress(x) sort(all(x)), x.erase(unique(all(x)), x.end())

typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;
typedef pair<ll, ll> pll;
typedef vector<int> vi;
typedef vector<vi> vvi;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

ll sq(ll x) { return x*x; }
ld sq(ld x) { return x*x; }

struct LiChao {
    struct Line {
        ll a=1, b=-INF, k=0;
        pll get(ll x) {
            ll ra = b-k*x;
            ll rb = a+k*x;
            ll g = gcd(ra, rb);
            return {ra/g, rb/g};
        }
    };
    struct Node {
        ll s, e;
        Line line;
        int l=-1, r=-1;
    };
    vector<Node> arr;
    LiChao(ll s, ll e) {
        arr.push_back({s, e});
    }

    void update(Line l, int nodeNum=0) {
        ll s=arr[nodeNum].s, e=arr[nodeNum].e;
        Line low = arr[nodeNum].line, high = l;

        auto a = low.get(s), b = high.get(s);
        if(a.f*b.s > b.f*a.s) swap(low, high);

        a = low.get(e), b = high.get(e);
        if(a.f*b.s<=b.f*a.s) {
            arr[nodeNum].line=high;
            return;
        }

        ll m = s+e>>1;
        a = low.get(m), b = high.get(m);
        if(a.f*b.s<b.f*a.s) {
            arr[nodeNum].line=high;
            if(arr[nodeNum].r==-1) {
                arr[nodeNum].r=arr.size();
                arr.push_back({m+1, e});
            }
            update(low, arr[nodeNum].r);
        } else {
            arr[nodeNum].line=low;
            if(arr[nodeNum].l==-1) {
                arr[nodeNum].l=arr.size();
                arr.push_back({s, m});
            }
            update(high, arr[nodeNum].l);
        }
    }

    pll query(ll x, int nodeNum=0) {
        if(nodeNum==-1) return {-INF, 0};
        ll s=arr[nodeNum].s, e=arr[nodeNum].e;
        ll m = s+e>>1;
        auto a = arr[nodeNum].line.get(x);
        if(x<=m) {
            auto b = query(x, arr[nodeNum].l);
            if(a.f*b.s>b.f*a.s) return a;
            return b;
        }
        auto b = query(x, arr[nodeNum].r);
        if(a.f*b.s>b.f*a.s) return a;
        return b;
    }
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m, k; cin >> n >> m >> k;

    LiChao lichao(1, 1e9);
    while(n--) {
        ll a, b; cin >> a >> b;
        lichao.update({a, b, k});
    }

    for(int i=1;i<=m;i++) {
        auto e = lichao.query(i);
        if(e.f==0) cout << "0/0\n";
        else cout << e.f << '/' << e.s << '\n';
    }
}