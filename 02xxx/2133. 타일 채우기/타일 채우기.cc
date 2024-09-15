#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    long long dp[N+1] = {1, 0, };
    for(int i=2;i<=N;i++) {
        dp[i] = dp[i-2]*3;
        for(int j=4;j<=i;j+=2) {
            dp[i] += dp[i-j]*2;
        }
    }
    cout << dp[N];
}