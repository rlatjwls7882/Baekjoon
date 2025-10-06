#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t, x, m; cin >> t >> x >> m;

    int minDist = INT_MAX;
    while(m--) {
        int d, s; cin >> d >> s;
        minDist = min(minDist, (d-1)/s);
    }

    int cnt = min(minDist, t);
    if(cnt) cnt += (t-cnt)/2;
    cout << cnt*x;
}