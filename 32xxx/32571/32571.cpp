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

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n;cin>>n;
    vector<int> v(n);
    for(int i=0;i<n;i++) {
        string s; cin >> s;
        if(s.find("rest")!=string::npos) v[i]=0;
        else if(s.find("leg")!=string::npos) v[i]=1;
        else v[i]=2;
    }

    int idx=0;
    for(int i=0;i<31;i++) {
        if(i%7==0)cout<<'\n'<<i/7+1<<' ';
        if(v[idx%n]==0)cout<<"\U0001F60E";
        else if(v[idx%n]==1)cout<<"\U0001F9B5";
        else cout<<"\U0001F4AA";
        idx++;
    }
}
