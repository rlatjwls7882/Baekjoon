#include<bits/stdc++.h>
#include<ext/pb_ds/assoc_container.hpp>
#include<ext/pb_ds/tree_policy.hpp>
#include<ext/rope>
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
typedef __int128 i128;
typedef pair<int, int> pii;
typedef pair<ll, ll> pll;
typedef vector<int> vi;
typedef vector<ll> vll;
template<typename T> using ordered_set = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;
template<typename T> T sq(T x) { return x*x; }

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);
const ld EPS = 1e-10;

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

string s[10000];
int a[10000][100], d[10000];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n,l,k;cin>>n>>l>>k;
    for(int i=0;i<n;i++){
        cin>>s[i];
        for(int j=0;j<l;j++)cin>>a[i][j];
    }
    fill(d, d+n, INF);

    int idx=0,mx=-1;
    for(int i=0;i<n;i++){
        int cur=0;
        for(int j=0;j<l;j++)cur+=abs(a[i][j]-a[0][j]);
        if(mx<cur){
            mx=cur;
            idx=i;
        }
    }
    d[idx]=-1;
    cout<<s[idx]<<'\n';

    while(k-->1){
        int mx=-1, ii=0;
        for(int i=0;i<n;i++){
            if(idx==i)continue;
            int cur=0;
            for(int j=0;j<l;j++)cur+=abs(a[i][j]-a[idx][j]);
            d[i]=min(d[i],cur);
            if(mx<d[i]){
                mx=d[i];
                ii=i;
            }
        }
        idx=ii;
        d[idx]=-1;
        cout<<s[idx]<<'\n';
    }
}
