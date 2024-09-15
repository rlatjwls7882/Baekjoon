#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;

    long long dp[N+1] = {0, };
    dp[1]++;
    if(M<=N) dp[M]++;

    for(int i=2;i<=N;i++) {
        dp[i] += dp[i-1];
        if(i-M>=0) dp[i] += dp[i-M];
        dp[i] %= 1000000007;
    }
    cout << dp[N];
}