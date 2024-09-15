#include<bits/stdc++.h>
#define MINF -1000000000
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int arr[n];
    for(int i=0;i<n;i++) {
        cin >> arr[i];
    }

    int dp[n][2];
    dp[0][0]=arr[0];
    dp[0][1]=MINF;

    int maxVal=arr[0];
    for(int i=1;i<n;i++) {
        dp[i][0] = max(arr[i], dp[i-1][0]+arr[i]);
        dp[i][1] = dp[i-1][1]+arr[i];
        if(i-2>=0) dp[i][1] = max(dp[i][1], dp[i-2][0]+arr[i]);
        maxVal = max(max(maxVal, dp[i][0]), dp[i][1]);
    }
    cout << maxVal;
}