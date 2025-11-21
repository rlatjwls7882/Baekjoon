#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'001;
vector<vector<int>> conn(MAX);

int color[MAX];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    while(m--) {
        int u, v; cin >> u >> v;
        conn[max(u, v)].push_back(min(u, v));
    }
    for(int i=1;i<=n;i++) {
        unordered_set<int> nums;
        for(int next:conn[i]) nums.insert(color[next]);

        color[i]=1;
        while(nums.count(color[i])) color[i]++;
        cout << color[i] << ' ';
    }
}