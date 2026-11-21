#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define f first
#define s second
#define all(x) x.begin(), x.end()
#define compress(x) sort(all(x)), x.erase(unique(all(x)), x.end())

typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;
typedef pair<ll, ll> pll;
typedef vector<int> vi;
typedef vector<vi> vvi;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

ll sq(ll x) { return x*x; }
ld sq(ld x) { return x*x; }

int mx[2000][2], a[2000][2000];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, k; cin >> n >> k;
    for(int i=0;i<n;i++) {
        for(int j=0;j<k;j++) {
            cin >> a[i][j];
            if(mx[j][0]<a[i][j]) {
                mx[j][1]=mx[j][0];
                mx[j][0]=a[i][j];
            } else if(mx[j][1]<a[i][j]) {
                mx[j][1]=a[i][j];
            }
        }
    }

    int res=0;
    for(int i=0;i<n;i++) {
        bool chk=false;
        for(int j=0;j<k;j++) {
            if(mx[j][1]<mx[j][0] && mx[j][0]==a[i][j]) {
                chk=true;
            }
        }
        if(chk) res++;
    }
    cout << res;
}