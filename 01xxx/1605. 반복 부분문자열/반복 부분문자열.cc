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

const int MOD = 10001;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; string s; cin >> n >> s;

    int l=0, r=n;
    while(l<r) {
        int m=l+r+1>>1;

        bool chk=false;
        vvi hash(MOD);
        int cur=0, mult=1;
        for(int i=0;i<m;i++) {
            cur = (cur+s[i]*mult)%MOD;
            if(i<m-1) mult=mult*2%MOD;
        }
        for(int i=0;i+m-1<n;i++) {
            if(i) {
                cur = cur-s[i-1]+MOD;
                if(cur%2) cur+=MOD;
                cur = (cur/2+s[i+m-1]*mult)%MOD;
            }
            if(hash[cur].size()) {
                for(int e:hash[cur]) {
                    bool match=true;
                    for(int j=0;j<m;j++) {
                        if(s[i+j]!=s[e+j]) {
                            match=false;
                            break;
                        }
                    }
                    if(match) {
                        chk=true;
                        break;
                    }
                }
            }
            if(chk) break;
            hash[cur].push_back(i);
        }
        if(chk) l=m;
        else r=m-1;
    }
    cout << l;
}