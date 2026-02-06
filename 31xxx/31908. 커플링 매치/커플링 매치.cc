#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define ff first
#define ss second

typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

ll sq(ll x) { return x*x; }
ld sq(ld x) { return x*x; }

map<string, vector<string>> chk;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    while(n--) {
        string a, b; cin >> a >> b;
        if(b=="-") continue;
        chk[b].push_back(a);
    }

    vector<pair<string, string>> res;
    for(auto [a, b]:chk) {
        if(b.size()==2) res.push_back({b[0], b[1]});
    }
    cout << res.size() << '\n';
    for(auto e:res) cout << e.ff << ' ' << e.ss << '\n';
}