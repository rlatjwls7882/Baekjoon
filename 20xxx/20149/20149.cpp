#include<bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
#include <ext/pb_ds/tree_policy.hpp>
#include <ext/rope>
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
typedef pair<int, int> pii;
typedef pair<ll, ll> pll;
typedef vector<int> vi;
typedef vector<vi> vvi;
typedef vector<ll> vll;
typedef vector<vll> vvll;
template <typename T> using ordered_set = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;
template <typename T> T sq(T x) { return x*x; }

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);
const ld EPS = 1e-10;

mt19937 rd((unsigned)chrono::steady_clock::now().time_since_epoch().count());
uniform_int_distribution<int> rnd_int(0, 0); // rnd_int(rd)
uniform_real_distribution<double> rnd_real(0, 1); // rnd_real(rd)

pll p[4];

ll ccw(pll a, pll b, pll c) {
    pll vec1 = {b.x-a.x, b.y-a.y};
    pll vec2 = {c.x-a.x, c.y-a.y};
    ll ret=vec1.x*vec2.y-vec2.x*vec1.y;
    if(ret>0) return 1;
    if(ret) return -1;
    return 0;
}

void chk() {
    int AtoB1 = ccw(p[0], p[1], p[2]);
    int AtoB2 = ccw(p[0], p[1], p[3]);
    int BtoA1 = ccw(p[2], p[3], p[0]);
    int BtoA2 = ccw(p[2], p[3], p[1]);
    if(AtoB1*AtoB2==0 && BtoA1*BtoA2==0) {
        if((min(p[0].x, p[1].x)<=p[2].x && p[2].x<=max(p[0].x, p[1].x) || min(p[0].x, p[1].x)<=p[3].x && p[3].x<=max(p[0].x, p[1].x) || min(p[2].x, p[3].x)<=p[0].x && p[0].x<=max(p[2].x, p[3].x) || min(p[2].x, p[3].x)<=p[1].x && p[1].x<=max(p[2].x, p[3].x))
        && (min(p[0].y, p[1].y)<=p[2].y && p[2].y<=max(p[0].y, p[1].y) || min(p[0].y, p[1].y)<=p[3].y && p[3].y<=max(p[0].y, p[1].y) || min(p[2].y, p[3].y)<=p[0].y && p[0].y<=max(p[2].y, p[3].y) || min(p[2].y, p[3].y)<=p[1].y && p[1].y<=max(p[2].y, p[3].y))) {
            cout << "1\n";
            if((p[1].x-p[0].x)*(p[3].y-p[2].y)!=(p[3].x-p[2].x)*(p[1].y-p[0].y)) {
                if(p[0]==p[1] || p[0]==p[2] || p[0]==p[3]) cout << p[0].x << ' ' << p[0].y;
                else if(p[1]==p[2] || p[1]==p[3]) cout << p[1].x << ' ' << p[1].y;
                else cout << p[2].x << ' ' << p[2].y;
            } else if(max(p[0].x, p[1].x)==p[2].x && max(p[0].x, p[1].x)<p[3].x || max(p[0].y, p[1].y)==p[2].y && max(p[0].y, p[1].y)<p[3].y) {
                cout << p[2].x << ' ' << p[2].y;
            } else if(max(p[0].x, p[1].x)==p[3].x && max(p[0].x, p[1].x)<p[2].x || max(p[0].y, p[1].y)==p[3].y && max(p[0].y, p[1].y)<p[2].y) {
                cout << p[3].x << ' ' << p[3].y;
            } else if(max(p[2].x, p[3].x)==p[0].x && max(p[2].x, p[3].x)<p[1].x || max(p[2].y, p[3].y)==p[0].y && max(p[2].y, p[3].y)<p[1].y) {
                cout << p[0].x << ' ' << p[0].y;
            } else if(max(p[2].x, p[3].x)==p[1].x && max(p[2].x, p[3].x)<p[0].x || max(p[2].y, p[3].y)==p[1].y && max(p[2].y, p[3].y)<p[0].y) {
                cout << p[1].x << ' ' << p[1].y;
            }
        } else {
            cout << 0;
        }
        return;
    }
    int ret = AtoB1*AtoB2<=0 && BtoA1*BtoA2<=0;
    cout << ret << '\n';
    if(!ret) return;

    ld a1 = -(p[1].y-p[0].y);
    ld a2 = -(p[3].y-p[2].y);
    ld b1 = p[1].x-p[0].x;
    ld b2 = p[3].x-p[2].x;
    ld c1 = a1*p[0].x+b1*p[0].y;
    ld c2 = a2*p[2].x+b2*p[2].y;

    ld x = (b2*c1-b1*c2)/(a1*b2-a2*b1);
    ld y = (a1*c2-a2*c1)/(a1*b2-a2*b1);
    cout << setprecision(10) << fixed << x << ' ' << y;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    for(int i=0;i<4;i++) cin >> p[i].x >> p[i].y;
    chk();
}