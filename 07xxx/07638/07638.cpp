#include<bits/stdc++.h>
using namespace std;

typedef long double ld;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while(true) {
        int n, m; cin >> n >> m;
        if(!n) break;
        vector<vector<ld>> percent(m, vector<ld>(n));
        for(int i=0;i<n;i++) for(int j=0;j<m;j++) cin >> percent[j][i];
        for(int i=0;i<m;i++) sort(percent[i].begin(), percent[i].end(), greater<ld>());

        ld total=0;
        for(int i=0;i<n;i++) {
            ld cur=1;
            for(int j=0;j<m;j++) cur *= percent[j][i];
            total += cur;
        }
        cout << fixed << setprecision(4) << total << '\n';
    }
}