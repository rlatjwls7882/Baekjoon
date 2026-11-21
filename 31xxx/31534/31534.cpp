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

const ld EPS = 1e-12;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    ld a, b, h; cin >> a >> b >> h;
    if(a==b) return !(cout << -1);
    if(a>b) swap(a, b);

    ld c = sqrtl(sq(h)+sq(b-a));
    ld y=(a*c)/(b-a);

    cout << setprecision(6) << fixed << (sq(y+c)-sq(y))*PI + EPS;
}