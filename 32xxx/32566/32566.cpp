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

struct Hashing {
    const ll P=3'037'000'493, Q=998'244'353, M=1'343'457'632;
    vector<ll> p, q;
    vector<vector<ll>> h, pq;
    Hashing(const vector<string> &s) : h(sz(s)+1,vector<ll>(sz(s[0])+1)), p(sz(s)+1), q(sz(s[0])+1), pq(sz(s)+1, vector<ll>(sz(s[0])+1)) {
        int n=sz(s), m=sz(s[0]);
        p[0]=q[0]=pq[0][0]=1;
        for(int i=1;i<=n;i++) p[i]=p[i-1]*P%M;
        for(int i=1;i<=m;i++) q[i]=q[i-1]*Q%M;
        for(int i=1;i<=n;i++)pq[i][0]=pq[i-1][0]*P%M;
        for(int i=1;i<=m;i++)pq[0][i]=pq[0][i-1]*Q%M;
        for(int i=1;i<=n;i++)for(int j=1;j<=m;j++)pq[i][j]=pq[i-1][j]*P%M;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=m;j++) {
                h[i][j]=(h[i-1][j]*P+h[i][j-1]*Q-h[i-1][j-1]*P%M*Q+M+s[i-1][j-1])%M;
            }
        }
    }
    ll get(int x1, int y1, int x2, int y2) {
        return (h[x2][y2]-h[x1-1][y2]*p[x2-x1+1]%M-h[x2][y1-1]*q[y2-y1+1]%M+h[x1-1][y1-1]*p[x2-x1+1]%M*q[y2-y1+1]+M*Q)%M;
    }
};

vector<string> a,b;
string res[2000];
int chk[2001][2001];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int r,c;cin>>r>>c;
    a=vector<string>(r);
    for(int i=0;i<r;i++)cin>>a[i];

    int n,m;cin>>n>>m;
    b=vector<string>(n);
    for(int i=0;i<n;i++)cin>>b[i];
    for(int i=0;i<n;i++)res[i]=string(m,'.');

    Hashing ha(a),hb(b);
    for(int i=0;i+r<=n;i++){
        for(int j=0;j+c<=m;j++){
            if(ha.get(1,1,r,c)==hb.get(i+1, j+1, i+r, j+c)) {
                chk[i][j]++;
                chk[i+r][j+c]++;
                chk[i+r][j]--;
                chk[i][j+c]--;
            }
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            chk[i][j+1]+=chk[i][j];
        }
    }
    for(int j=0;j<m;j++){
        for(int i=0;i<n;i++){
            chk[i+1][j]+=chk[i][j];
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(chk[i][j])cout<<b[i][j];
            else cout<<'.';
        }
        cout<<'\n';
    }
}
