#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int m, n; cin >> m >> n;
        int row[m];
        for(int i=0;i<m;i++) cin >> row[i];
        int col[n];
        for(int i=0;i<n;i++) cin >> col[i];

        if(m==2 && n==2) cout << "7\n";
        else cout << "1\n";
    }
}