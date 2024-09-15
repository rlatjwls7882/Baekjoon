#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int dp[N+1][3];
    dp[0][0]=1; dp[0][1]=dp[0][2]=0;

    for(int i=1;i<=N;i++) {
        dp[i][0] = (dp[i-1][0]+dp[i-1][1]+dp[i-1][2])%9901;
        dp[i][1] = (dp[i-1][0]+dp[i-1][2])%9901;
        dp[i][2] = (dp[i-1][0]+dp[i-1][1])%9901;
    }
    cout << (dp[N][0]+dp[N][1]+dp[N][2])%9901;
}