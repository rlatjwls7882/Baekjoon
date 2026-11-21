#include<bits/stdc++.h>
using namespace std;

const long long MOD = 1000000007;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    long long dp[N][3];
    long long dp2[N][3];
    dp[0][0]=1; dp[0][1]=dp[0][2]=0;
    dp2[0][0]=1; dp2[0][1]=dp2[0][2]=0;
    for(int i=1;i<N;i++) {
        dp[i][0] = (dp[i-1][0]+dp[i-1][1]+dp[i-1][2])%MOD;
        dp[i][1] = dp[i-1][0]*2;
        dp[i][2] = dp[i-1][1]/2*3%MOD;
        dp[i-1][1]%=MOD;

        dp2[i][0] = (dp2[i-1][0]+dp2[i-1][1]+dp2[i-1][2])%MOD;
        dp2[i][1] = dp2[i-1][0]%MOD;
        dp2[i][2] = dp2[i-1][1]%MOD;
    }
    cout << (dp[N-1][0]+dp[N-1][1]+dp[N-1][2]-dp2[N-1][0]-dp2[N-1][1]-dp2[N-1][2]+MOD)%MOD;
}