#include<bits/stdc++.h>
using namespace std;

const long long MOD = 1e9;

long long dp[10][10][10]; // dp[i][j][k] : 현재 마지막 수가 i고, 최소 j 최대 k까지 방문한 계단수의 개수

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=1;i<=9;i++) dp[i][i][i]=1; // 초기값

    while(n-->1) {
        long long nextDp[10][10][10];
        memset(nextDp, 0, sizeof nextDp);
        for(int i=0;i<=9;i++) {
            for(int j=0;j<=9;j++) {
                for(int k=j;k<=9;k++) {
                    if(i-1>=0) nextDp[i-1][min(i-1, j)][k] = (nextDp[i-1][min(i-1, j)][k] + dp[i][j][k]) % MOD;
                    if(i+1<=9) nextDp[i+1][j][max(i+1, k)] = (nextDp[i+1][j][max(i+1, k)] + dp[i][j][k]) % MOD;
                }
            }
        }
        memcpy(dp, nextDp, sizeof dp);
    }
    long long sum=0;
    for(int i=0;i<=9;i++) sum += dp[i][0][9];
    cout << sum % MOD;
}