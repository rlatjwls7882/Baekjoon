#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<pair<int, int>> a(n), b(n);
    for(int i=0;i<n;i++) cin >> a[i].first >> a[i].second;
    for(int i=0;i<n;i++) cin >> b[i].first >> b[i].second;
    sort(a.begin(), a.end());
    sort(b.begin(), b.end());
    cout << b[0].first-a[0].first << ' ' << b[0].second-a[0].second;
}