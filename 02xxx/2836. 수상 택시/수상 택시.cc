#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    vector<pair<ll, ll>> v;
    while(n--) {
        int a, b; cin >> a >> b;
        if(a>b) v.push_back({b, a});
    }
    sort(v.begin(), v.end());

    ll total=m, start=0, last=0;
    for(int i=0;i<v.size();i++) {
        if(last<v[i].first) {
            total += (last-start)*2;
            start = v[i].first;
            last = v[i].second;
        } else {
            last = max(last, v[i].second);
        }
    }
    total += (last-start)*2;

    cout << total;
}