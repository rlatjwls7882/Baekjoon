#include<bits/stdc++.h>
using namespace std;
int MOD = 1000000007;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, L; cin >> N >> L;

    int dp[N+1];
    for(int i=1;i<=N;i++) {
        dp[i]=1;
    }

    while(L-->1) {
        int nextDp[N+1] = {0, };
        for(int i=1;i<=N;i++) {
            for(int j=i;j<=N;j+=i) {
                nextDp[j] = (nextDp[j]+dp[i])%MOD;
            }
        }
        memcpy(&dp, &nextDp, sizeof(dp));
    }

    int sum=0;
    for(int i=1;i<=N;i++) {
        sum = (sum+dp[i])%MOD;
    }
    cout << sum;
}