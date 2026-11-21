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
template <typename T> using ordered_set = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;
template <typename K, typename V> using ordered_map = tree<K, V, less<K>, rb_tree_tag, tree_order_statistics_node_update>;
template <typename T> T sq(T x) { return x*x; }

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int t; cin >> t;
    while(t--) {
        int m, n; cin >> m >> n;
        cout << "1\n";
        if(m%2==0) {
            for(int i=0;i<m;i++) {
                if(i%2) {
                    for(int j=0;j<n;j++) {
                        cout << "(" << i << "," << j << ")\n";
                    }
                } else {
                    for(int j=n-1;j>=0;j--) {
                        cout << "(" << i << "," << j << ")\n";
                    }
                }
            }
        } else if(n%2==0) {
            for(int j=0;j<n;j++) {
                if(j%2) {
                    for(int i=0;i<m;i++) {
                        cout << "(" << i << "," << j << ")\n";
                    }
                } else {
                    for(int i=m-1;i>=0;i--) {
                        cout << "(" << i << "," << j << ")\n";
                    }
                }
            }
        } else {
            for(int i=0;i<m;i++) cout << "(" << i << "," << n-1 << ")\n";
            for(int i=m-1;i>=0;i--) {
                if(i%2) {
                    for(int j=n-2;j>=0;j--) {
                        cout << "(" << i << "," << j << ")\n";
                    }
                } else {
                    for(int j=0;j<=n-2;j++) {
                        cout << "(" << i << "," << j << ")\n";
                    }
                }
            }
        }
    }
}