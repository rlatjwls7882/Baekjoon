#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    long long sum=0;
    vector<pair<int, int>> v(n);
    for(int i=0;i<n;i++) {
        cin >> v[i].first >> v[i].second;
        sum += v[i].second;
    }
    sort(v.begin(), v.end());

    long long cur=0;
    for(auto [x, a]:v) {
        cur += a;
        if(cur>=(sum+1)/2) {
            cout << x;
            return 0;
        }
    }
}