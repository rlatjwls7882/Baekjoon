#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int arr[N][3];
    for(int i=0;i<N;i++) {
        for(int j=0;j<3;j++) {
            cin >> arr[i][j];
        }
    }

    int maxCnt=arr[0][2];
    int dp[N][2];
    dp[0][0]=arr[0][2]; dp[0][1]=0;
    for(int i=1;i<N;i++) {
        dp[i][0]=arr[i][2]; dp[i][1] = max(dp[i-1][0], dp[i-1][1]);
        if(i-2>=0) dp[i][0] += max(dp[i-2][0], dp[i-2][1]);
        maxCnt = max(max(maxCnt, dp[i][0]), dp[i][1]);
    }
    cout << maxCnt;
}