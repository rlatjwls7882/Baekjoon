#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define x first
#define y second
#define all(x) x.begin(), x.end()
#define compress(x) sort(all(x)), x.erase(unique(all(x)), x.end())

typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

ll sq(ll x) { return x*x; }
ld sq(ld x) { return x*x; }

int a[200'001], change[200'002];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;
    for(int i=1;i<=n;i++) cin >> a[i];
    while(m--) {
        int i, j; cin >> i >> j;
        change[i]++;
        change[j+1]--;
    }

    ld res=0;
    for(int i=1;i<=n;i++) {
        change[i+1]+=change[i];
        if(change[i]) {
            ld curSum=0, cnt=0;
            int tmp=a[i];
            for(int j=2;j*j<=tmp;j++) {
                if(tmp%j==0) {
                    cnt++;
                    curSum+=j;
                    while(tmp%j==0) tmp/=j;
                }
            }
            if(tmp>1) curSum+=tmp, cnt++;
            res+=curSum/cnt;
        } else {
            res+=a[i];
        }
    }
    cout << setprecision(10) << fixed << res;
}
