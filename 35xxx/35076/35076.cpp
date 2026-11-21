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

ll comb[34][34];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n;string s;cin>>n>>s;
    for(int i=0;i<=33;i++)comb[i][0]=1;
    for(int i=1;i<=33;i++){
        for(int j=1;j<=i;j++){
            comb[i][j]=comb[i][j-1]*(i-j+1)/j;
        }
    }

    int r=0,g=0,b=0;
    for(auto e:s){
        if(e=='r')r++;
        else if(e=='g')g++;
        else b++;
    }

    if(g<b)swap(g,b);
    if(r<g)swap(r,g);
    if(g<b)swap(g,b);

    ld res=3*b/2.0;
    for(int i=0;i<=b;i++){
        res+=3*min(r+i,g+b-i)*comb[b][i]/powl(2,b);
    }
    cout<<setprecision(7)<<fixed<<res;
}
