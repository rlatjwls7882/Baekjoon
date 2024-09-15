#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    long long dp[N];
    dp[0]=1;
    for(int i=1;i<N;i++) {
        dp[i] = dp[i-1];
        if(i>=3) dp[i] += dp[i-3];
        dp[i] %= 1000000009;
    }

    if(N<3) cout << dp[N-1];
    else cout << (dp[N-1]+dp[N-3])%1000000009;
}