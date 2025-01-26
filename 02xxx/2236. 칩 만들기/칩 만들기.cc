#include<bits/stdc++.h>
using namespace std;

int res[50];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; cin >> n >> k;
    vector<pair<int, int>> v(n);
    for(int i=0;i<n;i++) {
        cin >> v[i].first;
        v[i].second=i;
    }
    sort(v.begin(), v.end(), greater<pair<int, int>>());

    for(int i=0;i<k;i++) {
        if(i>=n) {
            cout << "0\n";
        } else {
            cout << v[i].second+1 << '\n';
            res[v[i].second]=v[i].second+1;
        }
    }
    for(int i=0;i<n;i++) cout << res[i] << '\n';
}