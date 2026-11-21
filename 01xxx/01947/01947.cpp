#include<bits/stdc++.h>
using namespace std;

const long long MOD = 1e9;
const int MAX = 1e6+1;

long long dp[MAX];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    dp[1]=0; dp[2]=1;
    for(int i=3;i<=n;i++) {
        dp[i] = (i-1)*(dp[i-2]+dp[i-1])%MOD;
    }
    cout << dp[n];
}