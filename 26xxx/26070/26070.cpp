#include<bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
#include <ext/pb_ds/tree_policy.hpp>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;
using namespace __gnu_pbds;

#define x first
#define y second
#define all(x) x.begin(), x.end()
#define compress(x) sort(all(x)), x.erase(unique(all(x)), x.end())

typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;
typedef pair<ll, ll> pll;
typedef vector<int> vi;
typedef vector<vi> vvi;
typedef tree<int, null_type, less<int>, rb_tree_tag, tree_order_statistics_node_update> ordered_set;
typedef tree<int, int, less<int>, rb_tree_tag, tree_order_statistics_node_update> ordered_map;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

ll sq(ll x) { return x*x; }
ld sq(ld x) { return x*x; }

ll sol(ll &a, ll &x) {
    ll cnt=min(a, x);
    a-=cnt;
    x-=cnt;
    return cnt;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    ll a, b, c, x, y, z; cin >> a >> b >> c >> x >> y >> z;

    ll cnt=sol(a, x)+sol(b, y)+sol(c, z);

    y+=x/3;
    cnt+=sol(b, y);

    z+=y/3;
    cnt+=sol(c, z);

    x+=z/3;
    cnt+=sol(a, x);

    y+=x/3;
    cnt+=sol(b, y);

    cout << cnt;
}