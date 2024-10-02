#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    long long A[n];
    for(int i=0;i<n;i++) cin >> A[i];

    long long dp[n]; fill(dp, dp+n, 1000000000);
    dp[0]=0;
    for(int i=1;i<n;i++) {
        for(int j=0;j<i;j++) {
            dp[i] = min(dp[i], max(dp[j], (i-j)*(1+abs(A[i]-A[j]))));
        }
    }
    cout << dp[n-1];
}