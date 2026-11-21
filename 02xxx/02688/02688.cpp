#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    long long dp[64][10] = {0, };
    for(int i=0;i<10;i++) dp[0][i]=1;
    for(int i=1;i<64;i++) {
        for(int j=0;j<10;j++) {
            for(int k=j;k>=0;k--) {
                dp[i][j] += dp[i-1][k];
            }
        }
    }

    int t; cin >> t;
    while(t-->0) {
        int n; cin >> n;
        long long sum=0;
        for(int i=0;i<10;i++) sum += dp[n-1][i];
        cout << sum << '\n';
    }
}