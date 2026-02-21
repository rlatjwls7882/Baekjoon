#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define x first
#define y second
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
        ll a=0, b=-LINF, i=-1;
        pll get(ll x) { return {i, a*x+b}; }
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
        if(low.get(s).second > high.get(s).second) swap(low, high);

        if(low.get(e).second<=high.get(e).second) {
            arr[nodeNum].line=high;
            return;
        }

        ll m = s+e>>1;
        if(low.get(m).second<high.get(m).second) {
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
        if(nodeNum==-1) return {-1, -LINF};
        ll s=arr[nodeNum].s, e=arr[nodeNum].e;
        ll m = s+e>>1;
        auto a = arr[nodeNum].line.get(x);
        if(x<=m) {
            auto b = query(x, arr[nodeNum].l);
            if(a.second>=b.second) return a;
            return b;
        }
        auto b = query(x, arr[nodeNum].r);
        if(a.second>b.second) return a;
        return b;
    }
};

ll a[300'000], b[300'000];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, q; cin >> n >> q;

    LiChao lichao(1, 1e12);
    for(int i=0;i<n;i++) {
        cin >> a[i] >> b[i];
        lichao.update({a[i], b[i], i});
    }

    while(q--) {
        ll x, y; cin >> x >> y;

        ll cnt=0;
        while(x<y) {
            auto nx = lichao.query(x);
            if(nx.second<=x) {
                cnt=-1;
                break;
            }

            if(a[nx.first]==1) {
                ll l=nx.second, r=y;
                while(l<r) {
                    ll m = l+r+1>>1;
                    if(lichao.query(m).first==nx.first) l=m;
                    else r=m-1;
                }
                ll diff = b[nx.first];
                cnt += (l-x+diff-1)/diff;
                x = l;
            } else {
                x=nx.second;
                cnt++;
            }
        }
        cout << cnt << '\n';
    }
}