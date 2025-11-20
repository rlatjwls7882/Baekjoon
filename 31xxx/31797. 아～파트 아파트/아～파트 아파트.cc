#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    vector<pair<int, int>> v;
    for(int i=1;i<=m;i++) {
        int h1, h2; cin >> h1 >> h2;
        v.push_back({h1, i});
        v.push_back({h2, i});
    }
    sort(v.begin(), v.end());

    cout << v[(n-1)%v.size()].second;
}