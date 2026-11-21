#include<bits/stdc++.h>
using namespace std;

const int MOD = 1000000009;
int dp[1001][1000] = {0, };

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;

    for(int i=1;i<=1000;i++) {
        for(int j=i-1;j>0;j--) {
            dp[i][j] = dp[i-1][j-1];
            if(i-2>=0) dp[i][j] = (dp[i][j]+dp[i-2][j-1])%MOD;
            if(i-3>=0) dp[i][j] = (dp[i][j]+dp[i-3][j-1])%MOD;
        }
        if(i<=3) dp[i][0]=1;
    }
    
    while(T-->0) {
        int n, m; cin >> n >> m;

        long long sum=0;
        for(int i=0;i<m;i++) {
            sum = (sum+dp[n][i])%MOD;
        }
        cout << sum << '\n';
    }
}