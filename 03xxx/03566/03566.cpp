#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int rh, rv, sh, sv; cin >> rh >> rv >> sh >> sv;

    int n; cin >> n;
    int minCost = INT_MAX;
    while(n--) {
        int r1, r2, s1, s2, c; cin >> r1 >> r2 >> s1 >> s2 >> c;
        minCost = min(minCost, max((s1+sh-1)/s1, (r1+rh-1)/r1) * max((s2+sv-1)/s2, (r2+rv-1)/r2) * c);
        minCost = min(minCost, max((s2+sh-1)/s2, (r2+rh-1)/r2) * max((s1+sv-1)/s1, (r1+rv-1)/r1) * c);
    }
    cout << minCost;
}