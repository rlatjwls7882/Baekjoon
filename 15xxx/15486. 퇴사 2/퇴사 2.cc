#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int T[N], P[N];
    for(int i=0;i<N;i++) {
        cin >> T[i] >> P[i];
    }

    int dp[N+1] = {0, };
    for(int i=N-1;i>=0;i--) {
        if(T[i]+i<=N && P[i]+dp[i+T[i]]>dp[i+1]) {
            dp[i]=P[i]+dp[i+T[i]];
        } else {
            dp[i]=dp[i+1];
        }
    }
    cout << dp[0];
}