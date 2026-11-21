#include<bits/stdc++.h>
using namespace std;

int a[1001], b[1001], lcs[1001][1001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=1;i<=n;i++) cin >> a[i];
    for(int i=1;i<=n;i++) cin >> b[i];

    for(int i=1;i<=n;i++) {
        for(int j=1;j<=n;j++) {
            if(abs(a[i]-b[j])<=4) lcs[i][j] = lcs[i-1][j-1]+1;
            else lcs[i][j] = max(lcs[i-1][j], lcs[i][j-1]);
        }
    }
    cout << lcs[n][n];
}