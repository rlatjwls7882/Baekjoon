#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;

int dp[201][201]; // dp[L][R] : L ~ R에 색이 전부 채워졌을 때의 최소 연산 횟수+1
int color[201];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; cin >> n >> k;

    fill(&dp[0][0], &dp[200][201], INF);
    for(int i=1;i<=n;i++) {
        cin >> color[i];
        dp[i][i]=1;
    }

    for(int len=2;len<=n;len++) {
        for(int left=1;left+len-1<=n;left++) {
            for(int leftLen=1;leftLen<len;leftLen++) {
                dp[left][left+len-1] = min(dp[left][left+len-1], dp[left][left+leftLen-1] + dp[left+leftLen][left+len-1] - (color[left] == color[left+len-1]));
            }
        }
    }
    cout << dp[1][n]-1;
}