#include<bits/stdc++.h>
using namespace std;

// dp[i][j][k] : i번째 단계에서 거리가 j이고 깜짝 놀라게 하기를 사용했는지 여부(k)일때의 최대 체력
int dp[19][65][2], r[19];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, h, d, k; cin >> n >> h >> d >> k;
    dp[0][d][0] = h;

    for(int i=1;i<=n;i++) {
        cin >> r[i];
        for(int j=0;j<=64;j++) {
            // 웅크리기
            dp[i][j][0] = max(dp[i][j][0], dp[i-1][j][0] - max((r[i]-j)/2, 0));
            dp[i][j][1] = max(dp[i][j][1], dp[i-1][j][1] - max((r[i]-j)/2, 0));

            // 네발로 걷기
            if(j-k>=0) {
                dp[i][j][0] = max(dp[i][j][0], dp[i-1][j-k][0] - max(r[i]-j, 0));
                dp[i][j][1] = max(dp[i][j][1], dp[i-1][j-k][1] - max(r[i]-j, 0));
            }

            // 깜짝 놀라게 하기 (+ 네발로 걷기)
            if(i>=2 && j-k>=0) {
                dp[i][j][1] = max(dp[i][j][1], dp[i-2][j-k][0] -  max(r[i-1]-(j-k), 0));
            }
        }
    }

    int maxH=0;
    for(int i=0;i<=64;i++) {
        maxH = max({maxH, dp[n][i][0], dp[n][i][1]});
    }
    cout << (maxH>0 ? maxH : -1);
}