#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;

    int pos[N][2];
    for(int i=0;i<N;i++) {
        for(int j=0;j<2;j++) {
            cin >> pos[i][j];
        }
    }

    int dp[N][K+1]; fill(&dp[0][0], &dp[N-1][K+1], -1);
    dp[0][0]=0;
    for(int i=1;i<N;i++) {
        for(int j=i-1;j>=0;j--) {
            int skip = (i-j-1);
            if(skip>K) break;
            for(int k=0;k+skip<=K;k++) {
                if(dp[j][k]!=-1) {
                    int next = k+skip;
                    int nextDist = dp[j][k]+abs(pos[i][0]-pos[j][0])+abs(pos[i][1]-pos[j][1]);
                    if(dp[i][next]==-1) dp[i][next] = nextDist;
                    else dp[i][next] = min(dp[i][next], nextDist);
                }
            }
        }
    }

    int minDist = INT_MAX;
    for(int i=0;i<=K;i++) minDist = min(minDist, dp[N-1][i]);
    cout << minDist;
}