#include<bits/stdc++.h>
using namespace std;

long long r[100'001];
long long dp[100'001]; // dp[i] : i번을 선택했을 때의 최소 에너지

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=1;i<=n;i++) cin >> r[i];

    dp[0] = LONG_LONG_MAX; // n=1일때의 예외처리
    for(int i=1;i<=n;i++) {
        dp[i] = r[i];
        if(i-2>=1) dp[i] += dp[i-2];
        if(i-3>=1) dp[i] = min(dp[i], dp[i-3]+r[i]);
    }
    cout << accumulate(&r[1], &r[n+1], 0LL) - min(dp[n], dp[n-1]);
}