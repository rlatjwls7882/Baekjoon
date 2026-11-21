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

int S[100], I[100];
ld M[100], cur[100], nxt[100];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    ld n, p, t; cin >> n >> p >> t;
    for(int i=0;i<n;i++) cin >> S[i] >> I[i] >> M[i];

    cur[0]=p;
    for(int tc=1;tc<t;tc++) {
        for(int i=0;i<n;i++) {
            if(tc>=S[i] && (tc-S[i])%I[i]==0) {
                ld sum=0, cnt=0;
                for(int j=0;j<n;j++) {
                    if(cur[j]) {
                        cnt++;
                        sum+=cur[j];
                    }
                }
                nxt[i] = round(sum/cnt*(1+M[i])*100)/100;
            } else {
                nxt[i]=cur[i];
            }
        }
        memcpy(cur, nxt, sizeof cur);
    }
    for(int i=0;i<n;i++) cout << setprecision(2) << fixed << cur[i] << '\n';
}