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

ll par[100'001],a[100'001];

int find(int x){
    if(par[x]==x)return x;
    return par[x]=find(par[x]);
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    ll n,m,k;cin>>n>>m>>k;

    for(int i=0;i<k;i++){
        cin>>a[i];
        if(a[i]&1){
            k--;
            i--;
        }
    }
    sort(a,a+k);

    for(int i=0;i<k;i++){
        par[i]=i;
        if(i&&a[i-1]+2==a[i])par[i]=find(par[i-1]);
    }

    ll cur=0;
    while(m--){
        if(!m){
            if(n==1)cur=0;
            else cur+=2*n-1;
            break;
        }

        int idx=lower_bound(a,a+k,cur+2*n)-a;
        if(a[idx]==cur+2*n){
            ll nxt=a[par[idx]]-2;
            if(nxt<=cur){
                cur+=2*n;
                break;
            }
            cur=nxt;
        }
        else cur+=2*n;
    }
    cout<<cur;
}
