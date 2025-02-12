#include<bits/stdc++.h>
using namespace std;

set<string> winner;

struct team {
    string univ_name, team_name;
    int solve, penalty;
    bool operator<(const team a) const {
        if(solve==a.solve) return penalty < a.penalty;
        return solve > a.solve;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; cin >> n >> k;
    vector<team> v(n);
    for(int i=0;i<n;i++) cin >> v[i].univ_name >> v[i].team_name >> v[i].solve >> v[i].penalty;
    sort(v.begin(), v.end());

    vector<string> list;
    for(int i=0;i<n && list.size()<k;i++) {
        if(!winner.count(v[i].univ_name)) {
            winner.insert(v[i].univ_name);
            list.push_back(v[i].team_name);
        }
    }

    for(string res:list) cout << res << '\n';
}