#include<bits/stdc++.h>
using namespace std;

int a[250'000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> a[i];
    for(int i=0;i<n;i++) {
        int b; cin >> b;
        a[i] -= b;
    }

    int q; cin >> q;
    vector<pair<int, int>> v(q);
    for(int i=0;i<q;i++) {
        cin >> v[i].first;
        v[i].second=i;
    }
    sort(v.begin(), v.end(), greater<pair<int, int>>());

    int idx=0;
    vector<int> res(q);
    for(int i=0;i<q;i++) {
        while(idx<n && v[i].first<=a[idx]) idx++;
        res[v[i].second]=idx;
    }
    for(int i=0;i<q;i++) cout << res[i] << '\n';
}