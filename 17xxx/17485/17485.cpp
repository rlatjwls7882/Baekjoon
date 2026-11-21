#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;

int arr[1000][1000], dp[1000][1000][3];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            cin >> arr[i][j];
        }
    }

    // 0: 왼쪽에서, 1: 가운데서, 2: 오른쪽에서 온것
    for(int i=0;i<m;i++) {
        for(int j=0;j<3;j++) {
            dp[0][i][j]=arr[0][i];
        }
    }
    dp[0][0][0]=dp[0][m-1][2]=INF;

    for(int i=1;i<n;i++) {
        for(int j=0;j<m;j++) {
            for(int k=0;k<3;k++) {
                dp[i][j][k]=INF;
            }
        }
    }

    for(int i=1;i<n;i++) {
        for(int j=0;j<m;j++) {
            if(j-1>=0) dp[i][j][0] = min(dp[i-1][j-1][1], dp[i-1][j-1][2])+arr[i][j];
            dp[i][j][1] = min(dp[i-1][j][0], dp[i-1][j][2])+arr[i][j];
            if(j+1<m) dp[i][j][2] = min(dp[i-1][j+1][0], dp[i-1][j+1][1])+arr[i][j];
        }
    }

    int res = INF;
    for(int i=0;i<m;i++) {
        for(int j=0;j<3;j++) {
            res = min(res, dp[n-1][i][j]);
        }
    }
    cout << res;
}