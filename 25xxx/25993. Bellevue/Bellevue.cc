#include<bits/stdc++.h>
using namespace std;

typedef long double ld;
typedef pair<ld, ld> pdd;

const long double PI = atanl(1)*4;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<pair<ld, ld>> v(n);
    for(int i=0;i<n;i++) cin >> v[i].first >> v[i].second;

    ld res=0;
    for(int i=1;i<n-1;i++) res = max(res, atanl(v[i].second/min(v[i].first-v[0].first, v[n-1].first-v[i].first))*180/PI);
    cout << fixed << setprecision(6) << res;
}