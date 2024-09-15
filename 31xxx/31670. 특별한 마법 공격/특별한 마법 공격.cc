#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N; cin >> N;
    long dp[N+1] = {0};

    cin >> dp[1];
    for(int i=2;i<=N;i++) {
        long R; cin >> R;
        dp[i] = min(dp[i-1]+R, dp[i-2]+R);
    }
    cout << min(dp[N-1], dp[N]);
}