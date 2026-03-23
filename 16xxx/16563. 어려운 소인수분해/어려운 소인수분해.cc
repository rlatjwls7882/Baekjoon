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
template <typename T> T sq(T x) { return x*x; }

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);
const ld EPS = 1e-10;

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

const int MAX = 5'000'001;

int notSosu[MAX];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    for(int i=2;i*i<MAX;i++) {
        if(!notSosu[i]) {
            for(int j=i*i;j<MAX;j+=i) {
                if(!notSosu[j]) notSosu[j]=i;
            }
        }
    }

    int n; cin >> n;
    while(n--) {
        int k; cin >> k;
        if(notSosu[k]) {
            for(int i=notSosu[k];i*i<=k;i++) {
                while(k%i==0) {
                    k/=i;
                    cout << i << ' ';
                }
            }
        }
        if(k!=1) cout << k;
        cout << '\n';
    }
}