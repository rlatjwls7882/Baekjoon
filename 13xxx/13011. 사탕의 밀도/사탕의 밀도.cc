#include<bits/stdc++.h>
using namespace std;

typedef long double ld;

ld c[50], w[50];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> c[i];
    for(int i=0;i<n;i++) cin >> w[i];

    ld minDiff=LONG_LONG_MAX;
    for(int i=0;i<n;i++) {
        ld g=w[i]/c[i], diff=0;
        for(int j=0;j<n;j++) diff += abs(w[j]-c[j]*g);
        minDiff = min(minDiff, diff);
    }
    cout << fixed << setprecision(9) << minDiff;
}