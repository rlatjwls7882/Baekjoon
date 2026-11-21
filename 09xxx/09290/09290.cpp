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

char ch;
string s[3];

void solve() {
    for(int i=0;i<3;i++) {
        int a=0, b=0;
        for(int j=0;j<3;j++) {
            if(s[i][j]==ch) a++;
            else if(s[i][j]=='-') b++;
        }
        if(a==2 && b==1) {
            s[i][0]=s[i][1]=s[i][2]=ch;
            return;
        }
        a=b=0;
        for(int j=0;j<3;j++) {
            if(s[j][i]==ch) a++;
            else if(s[j][i]=='-') b++;
        }
        if(a==2 && b==1) {
            s[0][i]=s[1][i]=s[2][i]=ch;
            return;
        }
    }
    int a = (s[0][0]==ch) + (s[1][1]==ch) + (s[2][2]==ch), b = (s[0][0]=='-') + (s[1][1]=='-') + (s[2][2]=='-');
    if(a==2 && b==1) s[0][0]=s[1][1]=s[2][2]=ch;
    else s[0][2]=s[1][1]=s[2][0]=ch;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int t; cin >> t;
    for(int tc=1;tc<=t;tc++) {
        for(int i=0;i<3;i++) cin >> s[i];
        cin >> ch;
        solve();
        cout << "Case " << tc << ":\n";
        for(int i=0;i<3;i++) cout << s[i] << '\n';
    }
}