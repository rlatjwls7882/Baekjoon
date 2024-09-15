#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int C, N; cin >> C >> N;

    int dp[C+1] = {0, };
    for(int i=1;i<=C;i++) {
        dp[i] = 1000000;
    }

    while(N-->0) {
        int cost, customer; cin >> cost >> customer;
        for(int i=1;i<=C;i++) {
            if(i-customer>=0) {
                dp[i] = min(dp[i], dp[i-customer]+cost);
            } else {
                dp[i] = min(dp[i], cost);
            }
        }
    }
    cout << dp[C];
}