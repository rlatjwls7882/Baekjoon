#include<bits/stdc++.h>
using namespace std;

int dp[100000][2];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N; cin >> N;
    for(int i=0;i<N;i++) {
        int cur; cin >> cur;
        dp[i][0] = cur;
        if(i>=2) dp[i][0] += max(dp[i-2][0], dp[i-2][1]);
        if(i>=1) dp[i][1] = max(dp[i-1][0]+cur/2, dp[i-1][1]);
    }
    cout << max(dp[N-1][0], dp[N-1][1]);
}