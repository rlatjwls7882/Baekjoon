#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;
    int a[n], b[n];
    for(int i=0;i<n;i++) cin >> a[i];
    for(int i=0;i<n;i++) cin >> b[i];

    vector<pair<int, int>> v;
    for(int i=0;i<n;i++) v.push_back({b[i]-a[i], a[i]});
    sort(v.begin(), v.end());

    for(int i=0;i<n;i++) {
        if(v[i].first<=m) m += v[i].second;
        else break;
    }
    cout << m;
}