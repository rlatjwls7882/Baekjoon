#include<bits/stdc++.h>
using namespace std;

typedef long double ld;
typedef pair<ld, ld> pdd;

const long double PI = atanl(1)*4;

ld getAngle(pdd a, pdd b, pdd c) {
    return atanl(b.second/min(b.first-a.first, c.first-b.first))*180/PI;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<pair<ld, ld>> v(n);
    for(int i=0;i<n;i++) cin >> v[i].first >> v[i].second;

    ld res=0;
    for(int i=1;i<n-1;i++) res = max(res, getAngle(v[0], v[i], v[n-1]));
    cout << fixed << setprecision(6) << res;
}