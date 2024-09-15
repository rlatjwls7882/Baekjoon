#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;

    int dp[10][10][10]; fill(&dp[0][0][0], &dp[9][9][10], INT_MAX);
    dp[0][0][0]=0;
    for(int i=0;i<n;i++) {
        int d; cin >> d;
        int nextDp[10][10][10]; fill(&nextDp[0][0][0], &nextDp[9][9][10], INT_MAX);
        for(int a=0;a<10;a++) {
            for(int b=0;b<10;b++) {
                for(int c=0;c<10;c++) {
                    if(dp[a][b][c]!=INT_MAX) {
                        nextDp[d][b][c] = min(nextDp[d][b][c], dp[a][b][c]+min(abs(a-d), abs(abs(a-d)-10)));
                        nextDp[a][d][c] = min(nextDp[a][d][c], dp[a][b][c]+min(abs(b-d), abs(abs(b-d)-10)));
                        nextDp[a][b][d] = min(nextDp[a][b][d], dp[a][b][c]+min(abs(c-d), abs(abs(c-d)-10)));
                    }
                }
            }
        }
        memcpy(&dp, &nextDp, sizeof(dp));
    }

    int minCnt=INT_MAX;
    for(int a=0;a<10;a++) {
        for(int b=0;b<10;b++) {
            for(int c=0;c<10;c++) {
                minCnt = min(minCnt, dp[a][b][c]);
            }
        }
    }
    cout << minCnt;
}