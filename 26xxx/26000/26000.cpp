#include<bits/stdc++.h>
using namespace std;

typedef long double ld;
map<pair<string, string>, ld> res;
map<string, vector<pair<string, ld>>> conn;

set<string> vis;
string root;

void dfs(string cur, ld w) {
    res[{root, cur}]=w;
    for(auto next : conn[cur]) {
        if(!vis.count(next.first)) {
            vis.insert(next.first);
            dfs(next.first, w*next.second);
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, q; cin >> n >> q;
    while(n--) {
        ld a, b; string sa, sb; cin >> a >> sa >> sb >> b >> sb;
        conn[sa].push_back({sb, b});
        conn[sb].push_back({sa, 1/b});
    }
    for(auto c : conn) {
        root = c.first;
        vis = {};
        dfs(c.first, 1);
    }

    while(q--) {
        ld a; string sa, sb; cin >> a >> sa >> sb >> sb;
        if(!res.count({sa, sb})) cout << "impossible\n";
        else cout << setprecision(15) << res[{sa, sb}]*a << '\n';
    }
}