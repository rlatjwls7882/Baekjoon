#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;

int dp[100][100]; // dp[L][R] : L ~ R 범위에 색을 채웠을 때의 최소 비용

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; string s; cin >> n >> s;

    fill(&dp[0][0], &dp[99][100], INF);
    for(int i=0;i<n;i++) dp[i][i]=1;

    for(int len=2;len<=n;len++) {
        for(int left=0;left+len-1<n;left++) {
            for(int beforeLen=1;beforeLen<len;beforeLen++) {
                dp[left][left+len-1] = min(dp[left][left+len-1], dp[left][left+beforeLen-1] + dp[left+beforeLen][left+len-1] - (s[left] == s[left+len-1]));
            }
        }
    }
    cout << dp[0][n-1];
}