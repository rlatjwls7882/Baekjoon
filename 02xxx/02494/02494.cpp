#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;

/** 
 * dp[i][j] : i번째 숫자 나사까지 왼쪽으로 j번 돌렸을 때의 최소 회전 칸수
 * prv[i][j] : 이동
 */
int dp[10001][10], prv[10001][10];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; string a, b; cin >> n >> a >> b;

    fill(&dp[0][0], &dp[10000][10], INF);
    dp[0][0]=0;
    for(int i=0;i<n;i++) {
        for(int j=0;j<10;j++) {
            // 오른쪽으로 돌리기(a[i]가 작아짐)
            int moveR = ((a[i]-'0'+j)%10 + (10-(b[i]-'0')))%10;
            if(dp[i+1][j] > dp[i][j] + moveR) {
                dp[i+1][j] = dp[i][j] + moveR;
                prv[i+1][j] = -moveR;
            }

            // 왼쪽으로 돌리기(a[i]가 커짐)
            int moveL = ((b[i]-'0') + (10-(a[i]-'0'+j)%10))%10; 
            if(dp[i+1][(j+moveL)%10] > dp[i][j] + moveL) {
                dp[i+1][(j+moveL)%10] = dp[i][j] + moveL;
                prv[i+1][(j+moveL)%10] = moveL;
            }
        }
    }

    int minCost=INF, idx=0;
    for(int i=0;i<10;i++) {
        if(minCost > dp[n][i]) {
            minCost = dp[n][i];
            idx = i;
        }
    }

    vector<pair<int, int>> res;
    for(int depth=n;depth>=1;depth--) {
        res.push_back({depth, prv[depth][idx]});
        if(prv[depth][idx]>0) idx = (idx-prv[depth][idx]+10)%10;
    }

    cout << minCost << '\n';
    for(int i=n-1;i>=0;i--) {
        cout << res[i].first << ' ' << res[i].second << '\n';
    }
}