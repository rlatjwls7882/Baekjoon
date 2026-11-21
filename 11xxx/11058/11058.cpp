#include<bits/stdc++.h>
using namespace std;

long long dp[101];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    for(int i=1;i<=6;i++) dp[i]=i;
    for(int i=7;i<=100;i++) {
        for(int j=3;j<i;j++) {
            dp[i] = max(dp[i-j]*(j-1), dp[i]);
        }
    }

    int n; cin >> n;
    cout << dp[n];
}