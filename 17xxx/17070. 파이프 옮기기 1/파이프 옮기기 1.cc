#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int m[N][N];
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            cin >> m[i][j];
        }
    }

    int dp[N][N][3];
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            for(int k=0;k<3;k++) {
                dp[i][j][k]=0;
            }
        }
    }

    dp[0][1][0]=1;
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            if(m[i][j]==0) {
                if(dp[i][j][0]) {
                    if(j+1<N && m[i][j+1]!=1) dp[i][j+1][0] += dp[i][j][0];
                    if(i+1<N && j+1<N && m[i][j+1]!=1 && m[i+1][j]!=1 && m[i+1][j+1]!=1) dp[i+1][j+1][2] += dp[i][j][0];
                }
                if(dp[i][j][1]) {
                    if(i+1<N && m[i+1][j]!=1) dp[i+1][j][1] += dp[i][j][1];
                    if(i+1<N && j+1<N && m[i][j+1]!=1 && m[i+1][j]!=1 && m[i+1][j+1]!=1) dp[i+1][j+1][2] += dp[i][j][1];
                }
                if(dp[i][j][2]) {
                    if(j+1<N && m[i][j+1]!=1) dp[i][j+1][0] += dp[i][j][2];
                    if(i+1<N && m[i+1][j]!=1) dp[i+1][j][1] += dp[i][j][2];
                    if(i+1<N && j+1<N && m[i][j+1]!=1 && m[i+1][j]!=1 && m[i+1][j+1]!=1) dp[i+1][j+1][2] += dp[i][j][2];
                }
            }
        }
    }
    cout << dp[N-1][N-1][0]+dp[N-1][N-1][1]+dp[N-1][N-1][2];
}