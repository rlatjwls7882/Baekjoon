#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int dp[10] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    while(N-->1) {
        int nextDp[10] = {0, };
        for(int i=0;i<10;i++) {
            if(dp[i]) {
                for(int j=0;j<=i;j++) {
                    nextDp[j]=(nextDp[j]+dp[i])%10007;
                }
            }
        }
        memcpy(&dp, &nextDp, sizeof(dp));
    }

    int sum=0;
    for(int i=0;i<10;i++) {
        sum += dp[i];
    }
    cout << sum%10007;
}