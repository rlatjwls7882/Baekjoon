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

int diff[] = {2, 1, 2, 2, 1, 2, 2};
int a[10000];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    for(int i=0;i<10000;i++) cin >> a[i];

    for(char i='A';i<='G';i++) {
        int cur=i-'A';
        bool chk=true;
        for(int j=0;j<n;j++) {
            int mv=a[j];
            while(mv) {
                if(mv>0 && diff[cur]<=mv) {
                    mv-=diff[cur];
                    cur = (cur+1)%7;
                } else if(mv<0 && diff[(cur+6)%7]>=mv) {
                    cur = (cur+6)%7;
                    mv+=diff[cur];
                } else {
                    chk=false;
                    break;
                }
            }
        }
        if(chk) cout << i << ' ' << char(cur+'A') << '\n';
    }
}