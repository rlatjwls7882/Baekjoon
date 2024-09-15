#include<bits/stdc++.h>
#define INF 10000
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);\
    int N, M; cin >> N >> M;
    int arr[N][M];
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            cin >> arr[i][j];
        }
    }

    int dp[M][3];
    for(int i=0;i<M;i++) {
        dp[i][0]=dp[i][1]=dp[i][2]=arr[0][i];
    }

    for(int i=1;i<N;i++) {
        int next[M][3];
        for(int j=0;j<M;j++) {
            next[j][0]=next[j][1]=next[j][2]=INF;
        }

        for(int j=0;j<M;j++) {
            if(j+1<M) next[j][0] = min(next[j][0], min(dp[j+1][1]+arr[i][j], dp[j+1][2]+arr[i][j]));
            next[j][1] = min(next[j][1], min(dp[j][0]+arr[i][j], dp[j][2]+arr[i][j]));
            if(j-1>=0) next[j][2] = min(next[j][2], min(dp[j-1][0]+arr[i][j], dp[j-1][1]+arr[i][j]));
        }
        memcpy(&dp, &next, sizeof(dp));
    }
    
    int minCost = INF;
    for(int i=0;i<M;i++) {
        for(int j=0;j<3;j++) {
            minCost = min(minCost, dp[i][j]);
        }
    }
    cout << minCost;
}