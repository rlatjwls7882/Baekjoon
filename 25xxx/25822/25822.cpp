#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    double C; cin >> C;
    int cnt = min((int)(C/0.99), 2);
    
    int N; cin >> N;
    int maxCnt=0;
    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
        maxCnt = max(maxCnt, arr[i]);
    }

    int maxLen=0;
    int dp[N][3];
    dp[0][0]=dp[0][1]=dp[0][2]=0;
    if(arr[0]) {
        dp[0][0]=1;
        maxLen=1;
    } else if(cnt) {
        dp[0][1]=1;
        maxLen=1;
    }

    for(int i=1;i<N;i++) {
        if(arr[i]) {
            dp[i][0] = dp[i-1][0]+1;
            dp[i][1] = dp[i-1][1]+1;
            dp[i][2] = dp[i-1][2]+1;
        } else {
            dp[i][0] = 0;
            dp[i][1] = dp[i-1][0]+1;
            dp[i][2] = dp[i-1][1]+1;
        }
        maxLen = max(maxLen, dp[i][0]);
        if(cnt>=1) maxLen = max(maxLen, dp[i][1]);
        if(cnt>=2) maxLen = max(maxLen, dp[i][2]);
    }
    cout << maxLen << '\n' << maxCnt;
}