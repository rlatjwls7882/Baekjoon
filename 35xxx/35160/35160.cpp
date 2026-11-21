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

ll s[1'000'000];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, q, c; cin >> n >> q >> c;
    for(int i=0;i<n;i++) cin >> s[i];

    deque<pll> deq1, deq2;
    for(int i=0;i<n;i++) {
        if(i<c) {
            while(!deq1.empty() && deq1.back().x<=s[i]-i) deq1.pop_back();
            deq1.push_back({s[i]-i, i});
        } else {
            while(!deq2.empty() && deq2.back().x<=s[i]) deq2.pop_back();
            deq2.push_back({s[i], i});
        }
    }

    ll res=0;
    for(int i=0;i<q;i++) {
        res+=max(deq1.front().x+c+i-1, sz(deq2) ? deq2.front().x : 0);
        while(!deq1.empty() && deq1.front().y<=i) deq1.pop_front();
        while(!deq2.empty() && deq2.front().y<=i+c) deq2.pop_front();
        if(c<n) {
            while(!deq1.empty() && deq1.back().x<=s[(i+c)%n]-(i+c)) deq1.pop_back();
            deq1.push_back({s[(i+c)%n]-(i+c), i+c});
            while(!deq2.empty() && deq2.back().x<=s[i%n]) deq2.pop_back();
            deq2.push_back({s[i%n], i+n});
        } else {
            while(!deq1.empty() && deq1.back().x<=s[i%n]-(i+n)) deq1.pop_back();
            deq1.push_back({s[i%n]-(i+n), i+n});
        }
    }
    cout << res;
}