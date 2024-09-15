#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int arr[N*2-1];
    for(int i=0;i<N*2-1;i++) {
        cin >> arr[i];
    }

    int dp[N+1][N];
    for(int i=0;i<=N;i++) {
        for(int j=0;j<N;j++) {
            dp[i][j]=-1;
        }
    }
    dp[0][0]=-2;

    // 가로줄: 값, 세로줄: 개수
    for(int i=0;i<N*2-1;i++) {
        int nextDp[N+1][N]; memcpy(&nextDp, &dp, sizeof(dp));
        for(int j=0;j<=i && j<N;j++) {
            for(int k=0;k<N;k++) {
                if(dp[j][k]!=-1 && nextDp[j+1][(k+arr[i])%N]==-1) {
                    nextDp[j+1][(k+arr[i])%N]=i;
                }
            }
        }
        memcpy(&dp, &nextDp, sizeof(dp));
    }

    if(dp[N][0]!=-1) {
        for(int i=N, j=0;dp[i][j]!=-2;j=(j-arr[dp[i][j]]+N)%N, i--) {
            cout << arr[dp[i][j]] << ' ';
        }
    } else {
        cout << -1;
    }
}