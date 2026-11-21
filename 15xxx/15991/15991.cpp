#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    long long dp[100001] = {1, 1, 2, 2};
    for(int i=4;i<=100000;i++) {
        dp[i] = dp[i-2] + dp[i-4];
        if(i>=6) dp[i] += dp[i-6];
        dp[i] %= 1000000009;
    }

    int T; cin >> T;
    while(T-->0) {
        int N; cin >> N;
        cout << dp[N] << '\n';
    }
}