#include <bits/stdc++.h>

using namespace std;

typedef long long ll;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N; cin >> N;

    ll dp[N+1] = {1, 0, };
    for(int i=0;pow(2, i)<=N;i++) {
        int plus = pow(2, i);
        for(int j=plus;j<=N;j++) {
            dp[j] = (dp[j]+dp[j-plus])%1000000000;
        }
    }
    cout << dp[N];
}