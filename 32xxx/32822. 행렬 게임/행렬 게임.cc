#include<bits/stdc++.h>
using namespace std;

int a[1000][1000], b[1000][1000], maxDiff[1000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<n;i++) for(int j=0;j<n;j++) cin >> a[i][j];
    for(int i=0;i<n;i++) for(int j=0;j<n;j++) cin >> b[i][j];

    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            maxDiff[j] = max(maxDiff[j], abs(a[i][j]-b[i][j]));
        }
    }

    int res=0;
    while(m--) {
        int u; cin >> u;
        res += maxDiff[u-1];
    }
    cout << res;
}