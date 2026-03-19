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

    crope rp;
    int c=0;
    while(t--) {
        string s; cin >> s;
        if(s=="Prev") c--;
        else if(s=="Next") c++;
        else if(s=="Move") {
            int k; cin >> k;
            c=k;
        } else if(s=="Get") {
            int n; cin >> n;
            cout << rp.substr(c, n) << '\n';
        } else if(s=="Delete") {
            int n; cin >> n;
            rp.erase(c, n);
        } else {
            int n; cin >> n;
            cin.ignore();
            int curIdx=0;
            while(curIdx<n) {
                string s; getline(cin, s);
                rp.insert(c+curIdx, s.c_str());
                curIdx+=s.length();
            }
        }
    }
}