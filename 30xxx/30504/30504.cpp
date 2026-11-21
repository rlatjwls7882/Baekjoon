#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<pair<int, int>> a(n);
    for(int i=0;i<n;i++) {
        cin >> a[i].first;
        a[i].second=i;
    }
    vector<int> b(n);
    for(int i=0;i<n;i++) cin >> b[i];

    sort(a.begin(), a.end());
    sort(b.begin(), b.end());

    vector<int> ret(n);
    for(int i=0;i<n;i++) {
        if(a[i].first>b[i]) {
            cout << -1;
            return 0;
        }
        ret[a[i].second]=b[i];
    }
    for(int e : ret) cout << e << ' ';
}