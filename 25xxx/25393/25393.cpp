#include<bits/stdc++.h>
using namespace std;

int start[1000001], finish[1000001];
set<pair<int, int>> s;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    memset(finish, 0x3f3f3f3f, sizeof finish);
    int n; cin >> n;
    while(n--) {
        int l, r; cin >> l >> r;
        s.insert({l, r});
        start[l] = max(start[l], r);
        finish[r] = min(finish[r], l);
    }

    int m; cin >> m;
    while(m--) {
        int l, r; cin >> l >> r;
        if(s.count({l, r})) cout << "1\n";
        else if(start[l]>=r && finish[r]<=l) cout << "2\n";
        else cout << "-1\n";
    }
}