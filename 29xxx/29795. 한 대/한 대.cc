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
        ll a=0, b=-LINF;
        ll get(ll x) { return a*x+b; }
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
        if(low.get(s) > high.get(s)) swap(low, high);

        if(low.get(e)<=high.get(e)) {
            arr[nodeNum].line=high;
            return;
        }

        ll m = s+e>>1;
        if(low.get(m)<high.get(m)) {
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

    ll query(ll x, int nodeNum=0) {
        if(nodeNum==-1) return -LINF;
        ll s=arr[nodeNum].s, e=arr[nodeNum].e;
        ll m = s+e>>1;
        if(x<=m) return max(arr[nodeNum].line.get(x), query(x, arr[nodeNum].l));
        return max(arr[nodeNum].line.get(x), query(x, arr[nodeNum].r));
    }
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, q; cin >> n >> q;

    ll plus=0;
    LiChao lichao(1, 1e12);
    for(int i=0;i<n;i++) {
        ll a, b; cin >> a >> b;
        if(a==1) plus = max(plus, b);
        else lichao.update({a, b});
    }

    while(q--) {
        ll x, y; cin >> x >> y;

        ll cnt=0;
        while(x<y) {
            auto nx = lichao.query(x);
            if(nx<=x && plus<=0) {
                cnt=-1;
                break;
            }

            if(x+plus<nx) {
                x=nx;
                cnt++;
            } else {
                ll l=x, r=y-1;
                while(l<r) {
                    ll m=l+r+1>>1;
                    if(m+plus>=lichao.query(m)) l=m;
                    else r=m-1;
                }
                ll cur = (l-x)/plus+1;
                cnt+=cur;
                x+=cur*plus;
            }
        }
        cout << cnt << '\n';
    }
}