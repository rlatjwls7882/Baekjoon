#include<bits/stdc++.h>
using namespace std;

typedef long double ld;

ld minCost[101];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int k; cin >> k;
    for(int tc=1;tc<=k;tc++) {
        int n, m; cin >> n >> m;
        memset(minCost, 0, sizeof minCost);
        minCost[0]=1;
        
        while(m--) {
            int g; ld p; cin >> g >> p;
            for(int i=g;i<=n;i++) minCost[i] = max(minCost[i], minCost[i-g]*p);
        }
        cout << fixed << setprecision(2) << "Data Set " << tc << ":\n" << minCost[n] << '\n';
    }
}