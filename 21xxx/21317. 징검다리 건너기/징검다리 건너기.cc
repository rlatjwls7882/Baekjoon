#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;
int dp[20][2];
int needEnergy[19][2];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n-1;i++) cin >> needEnergy[i][0] >> needEnergy[i][1];
    int k; cin >> k;

    memset(dp, INF, sizeof(dp));
    dp[0][0]=dp[0][1]=0;
    for(int i=0;i<n;i++) {
        if(i+1<n) {
            dp[i+1][0] = min(dp[i+1][0], dp[i][0]+needEnergy[i][0]);
            dp[i+1][1] = min(dp[i+1][1], dp[i][1]+needEnergy[i][0]);
        }
        if(i+2<n) {
            dp[i+2][0] = min(dp[i+2][0], dp[i][0]+needEnergy[i][1]);
            dp[i+2][1] = min(dp[i+2][1], dp[i][1]+needEnergy[i][1]);
        }
        if(i+3<n) dp[i+3][1] = min(dp[i+3][1], dp[i][0]+k);
    }
    cout << min(dp[n-1][0], dp[n-1][1]);
}