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
#define all(x) x.begin(), x.end()
#define compress(x) sort(all(x)), x.erase(unique(all(x)), x.end())

typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;
typedef pair<ll, ll> pll;
typedef vector<int> vi;
typedef vector<vi> vvi;
typedef tree<int, null_type, less<int>, rb_tree_tag, tree_order_statistics_node_update> ordered_set;
typedef tree<int, int, less<int>, rb_tree_tag, tree_order_statistics_node_update> ordered_map;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

ll sq(ll x) { return x*x; }
ld sq(ld x) { return x*x; }

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int t; cin >> t;

    int d=0;
    vector<crope> rp(1);
    while(t--) {
        int a, v, p, c; cin >> a;
        if(a==1) {
            string s; cin >> p >> s;
            rp.push_back(rp.back());
            rp.back().insert(p-d, s.c_str());
        } else if(a==2) {
            cin >> p >> c;
            rp.push_back(rp.back());
            rp.back().erase(p-d-1, c-d);
        } else {
            cin >> v >> p >> c;
            crope tmp = rp[v-d].substr(p-d-1, c-d);
            for(char e:tmp) {
                cout << e;
                if(e=='c') d++;
            }
            cout << '\n';
        }
    }
}