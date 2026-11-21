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

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;

    map<string, int> li;
    while(n--) {
        int s, t; cin >> s >> t;
        while(t--) {
            string a; cin >> a;
            li[a]++;
        }
    }

    int len=0; string res="-1";
    for(auto e:li) {
        if(e.y>len) {
            res=e.x;
            len=e.y;
        } else if(e.y==len) {
            res="-1";
        }
    }
    cout << res;
}