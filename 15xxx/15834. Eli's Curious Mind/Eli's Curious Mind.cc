#include<bits/stdc++.h>
using namespace std;

int dp[77];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    dp[3]=1;
    dp[4]=2;
    dp[5]=2;
    for(int i=6;i<=76;i++) {
        dp[i] = dp[i-2] + dp[i-3];
    }

    for(int tc=1;;tc++) {
        int n; cin >> n;
        if(!n) break;
        cout << "Case #" << tc << ": " << dp[n]+dp[n-1] << '\n';
    }
}