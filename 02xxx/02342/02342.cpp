#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;

int dp[5][5]; // [왼쪽 발의 위치][오른쪽 발의 위치] 일때의 최소 힘

int dist(int a, int b) {
    return abs(a-b)==2 ? 2 : 1;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    
    fill(&dp[0][0], &dp[4][5], INF);
    dp[0][0]=0;
    while(true) {
        int n; cin >> n;
        if(!n) break;

        int nextDp[5][5];
        fill(&nextDp[0][0], &nextDp[4][5], INF);
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                nextDp[n][j] = min(nextDp[n][j], dp[i][j] + (i==n ? 1 : i==0 ? 2 : dist(i, n)+2));
                nextDp[i][n] = min(nextDp[i][n], dp[i][j] + (j==n ? 1 : j==0 ? 2 : dist(j, n)+2));
            }
        }
        memcpy(dp, nextDp, sizeof dp);
    }
    cout << *min_element(&dp[0][0], &dp[4][5]);
}