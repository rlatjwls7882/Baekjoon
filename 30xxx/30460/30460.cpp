#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int A[N+4] = {0, };
    for(int i=1;i<N+1;i++) {
        cin >> A[i];
    }

    int dp[N+4];
    dp[0]=0;
    for(int i=1;i<N+4;i++) {
        dp[i] = dp[i-1]+A[i];
        if(i>=3) dp[i] = max(dp[i], dp[i-3]+(A[i-2]+A[i-1]+A[i])*2);
    }
    cout << dp[N+3];
}