#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;

// dp[i][j] : i번째 나사에 대하여, 총 왼쪽으로 j%10번 돌렸을 때의 최소 회전 수
int dp[10001][10];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; string a, b; cin >> n >> a >> b;
    
    fill(&dp[0][0], &dp[10000][10], INF);
    dp[0][0]=0;
    for(int i=1;i<=n;i++) {
        for(int j=0;j<10;j++) {
            char cur = a[i-1]+j;
            
            // 오른쪽으로 돌리기 (a[i-1]이 작아짐)
            int rightCnt = ((a[i-1]-'0'+j)%10 + (10-(b[i-1]-'0')))%10;
            dp[i][j] = min(dp[i][j], dp[i-1][j] + rightCnt);
            
            // 왼쪽으로 돌리기 (a[i-1]이 커짐)
            int leftCnt = ((b[i-1]-'0') + 10-(a[i-1]-'0'+j)%10)%10;
            dp[i][(j+leftCnt)%10] = min(dp[i][(j+leftCnt)%10], dp[i-1][j] + leftCnt);
        }
    }
    int minCnt = INF;
    for(int i=0;i<10;i++) minCnt = min(minCnt, dp[n][i]);
    cout << minCnt;
}