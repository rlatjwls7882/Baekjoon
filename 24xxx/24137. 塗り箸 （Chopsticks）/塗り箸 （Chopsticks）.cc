#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;

int dp[300][300];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; string s; cin >> n >> s;

    fill(&dp[0][0], &dp[299][300], INF);
    for(int i=0;i<n;i++) dp[i][i]=1;

    for(int len=2;len<=n;len++) {
        for(int left=0;left+len-1<n;left++) {
            for(int leftLen=1;leftLen<len;leftLen++) {
                dp[left][left+len-1] = min(dp[left][left+len-1], dp[left][left+leftLen-1] + dp[left+leftLen][left+len-1] - (s[left] == s[left+len-1]));
            }
        }
    }
    cout << dp[0][n-1];
}