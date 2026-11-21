#include<bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
#include <ext/pb_ds/tree_policy.hpp>
#include <ext/rope>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;
using namespace __gnu_pbds;
using namespace __gnu_cxx;

#define x first
#define y second
#define sz(x) (int)(x).size()
#define all(x) x.begin(), x.end()
#define compress(x) sort(all(x)), x.erase(unique(all(x)), x.end())

typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;
typedef pair<ll, ll> pll;
typedef vector<int> vi;
typedef vector<vi> vvi;
typedef vector<ll> vll;
typedef vector<vll> vvll;
template <typename T> using ordered_set = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;
template <typename T> T sq(T x) { return x*x; }

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);
const ld EPS = 1e-10;

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

vector<vector<string>> li(32);
map<string, int> name;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    while(n--) {
        string s; int d; cin >> s >> d;
        li[d].push_back(s);
    }

    int m; cin >> m;
    while(m--) {
        string s; int t; cin >> s >> t;
        name[s]=t;
    }

    int t, q; cin >> q;
    while(q--) {
        string a, b, c; cin >> a >> b >> c;
        if(b=="-") {
            cout << "hai!\n";
            t = name[a];
        } else {
            vector<string> mx1, mx2;
            int diff=0;
            while(mx1.empty()) {
                if(t-diff>=1) for(auto e:li[t-diff]) mx1.push_back(e);
                if(diff && t+diff<=30) for(auto e:li[t+diff]) mx1.push_back(e);
                diff++;
            }
            sort(all(mx1));
            if(sz(mx1)>1) mx2.push_back(mx1[1]);
            while(mx2.empty()) {
                if(t-diff>=1) for(auto e:li[t-diff]) mx2.push_back(e);
                if(t+diff<=30) for(auto e:li[t+diff]) mx2.push_back(e);
                diff++;
            }
            sort(all(mx2));
            cout << mx2[0] << " yori mo " << mx1[0] << '\n';
        }
    }
}