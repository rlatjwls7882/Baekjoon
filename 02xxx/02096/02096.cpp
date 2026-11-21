#include<bits/stdc++.h>
#define INF 100000000
using namespace std;


int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int dp[3*2] = {0, };
    while(N-->0) {
        int nextDp[6] = {INF, 0, INF, 0, INF, 0};
        for(int i=0;i<3;i++) {
            int val; cin >> val;
            for(int j=i-1;j<=i+1;j++) {
                if(j<0 || j>=3) continue;
                nextDp[i*2] = min(nextDp[i*2], dp[j*2]+val);
                nextDp[i*2+1] = max(nextDp[i*2+1], dp[j*2+1]+val);
            }
        }
        memcpy(&dp, &nextDp, sizeof(dp));
    }

    int minVal=INF, maxVal=0;
    for(int i=0;i<6;i++) {
        if(i%2==0) minVal = min(minVal, dp[i]);
        else maxVal = max(maxVal, dp[i]);
    }
    cout << maxVal << ' ' << minVal;
}