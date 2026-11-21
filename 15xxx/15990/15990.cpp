#include<bits/stdc++.h>
using namespace std;
int MOD = 1000000009;
long long dp[100001][3] = {0, };

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    dp[1][0]=1;
    dp[2][1]=1;
    dp[3][0]=dp[3][1]=dp[3][2]=1;
    for(int i=4;i<=100000;i++) {
        for(int j=0;j<3;j++) {
            for(int k=0;k<3;k++) {
                if(k!=j) {
                    dp[i][j] += dp[i-j-1][k];
                }
            }
            dp[i][j] %= MOD;
        }
    }

    int T; cin >> T;
    while(T-->0) {
        int N; cin >> N;
        cout << (dp[N][0]+dp[N][1]+dp[N][2])%MOD << '\n';
    }
}