#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int A[n][3];
    for(int i=0;i<n;i++) {
        for(int j=0;j<3;j++) {
            cin >> A[i][j];
        }
    }

    int minCost=INT_MAX;
    int dp[n][3];
    for(int start=0;start<3;start++) {
        for(int i=0;i<3;i++) dp[0][i]=1000000000;
        dp[0][start]=A[0][start];
        for(int i=1;i<n;i++) {
            for(int j=0;j<3;j++) {
                dp[i][j] = min(dp[i-1][(j+1)%3], dp[i-1][(j+2)%3])+A[i][j];
            }
        }
        minCost = min(minCost, min(dp[n-1][(start+1)%3], dp[n-1][(start+2)%3]));
    }
    cout << minCost;
}