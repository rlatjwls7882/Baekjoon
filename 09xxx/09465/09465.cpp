#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int n; cin >> n;
        int arr[n+1][2];
        for(int i=0;i<2;i++) {
            for(int j=1;j<=n;j++) {
                cin >> arr[j][i];
            }
        }

        int dp[n+1][2];
        dp[0][0]=dp[0][1]=0;

        int maxScore=0;
        for(int i=1;i<=n;i++) {
            for(int j=0;j<2;j++) {
                dp[i][j] = dp[i-1][(j+1)%2] + arr[i][j];
                if(i-2>=0) {
                    dp[i][j] = max(dp[i][j], max(dp[i-2][0], dp[i-2][1])+arr[i][j]);
                }
                maxScore = max(maxScore, dp[i][j]);
            }
        }
        cout << maxScore << '\n';
    }
}