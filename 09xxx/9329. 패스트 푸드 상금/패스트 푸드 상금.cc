#include<bits/stdc++.h>
using namespace std;

int price[10], cnt[31];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n, m; cin >> n >> m;
        vector<vector<int>> need;
        for(int i=0;i<n;i++) {
            int cnt; cin >> cnt;
            need.push_back(vector<int>(cnt));
            for(int j=0;j<cnt;j++) cin >> need.back()[j];
            cin >> price[i];
        }

        int total=0;
        for(int i=1;i<=m;i++) cin >> cnt[i];
        for(int i=0;i<n;i++) {
            int cur=INT_MAX;
            for(int j=0;j<need[i].size();j++) cur = min(cur, cnt[need[i][j]]);
            for(int j=0;j<need[i].size();j++) cnt[need[i][j]] -= cur;
            total += price[i]*cur;
        }
        cout << total << '\n';
    }
}