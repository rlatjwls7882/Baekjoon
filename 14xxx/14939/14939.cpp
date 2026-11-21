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

vector<bitset<10>> bits(11);
int dx[] = {0, 0, 1, -1};
int dy[] = {1, -1, 0, 0};

void toggle(int x, int y) {
    bits[x][y].flip();
    for(int i=0;i<4;i++) {
        int nx=x+dx[i];
        int ny=y+dy[i];
        if(nx<0 || nx>10 || ny<0 || ny>10) continue;
        bits[nx][ny].flip();
    }
}

int back(int depth=1, int cnt=0) {
    if(depth==11) {
        for(int i=0;i<10;i++) {
            if(bits[depth-1][i]) return INF;
        }
        return cnt;
    }
    vector<int> push;
    for(int i=0;i<10;i++) {
        if(bits[depth-1][i]) {
            cnt++;
            push.push_back(i);
            toggle(depth, i);
        }
    }
    int ret = back(depth+1, cnt);
    for(auto i:push) toggle(depth, i);
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    for(int i=1;i<=10;i++) {
        string s; cin >> s;
        for(int j=0;j<10;j++) {
            bits[i][j]=s[j]=='O';
        }
    }
    int res=INF;
    for(int i=0;i<(1<<10);i++) {
        bits[0]=i;
        res = min(res, back());
    }
    cout << (res==INF ? -1 : res);
}