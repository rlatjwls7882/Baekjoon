#include<bits/stdc++.h>
using namespace std;

int dp[100'001][2];

int calc(int val, string s) {
    int x = s[1]-'0';
    if(s[0]=='+') return val+x;
    else if(s[0]=='-') return val-x;
    else if(s[0]=='*') return val*x;
    return val/x;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    dp[0][0]=1;
    for(int i=1;i<=n;i++) {
        string a, b; cin >> a >> b;
        if(dp[i-1][0]>0) {
            dp[i][0] = max(calc(dp[i-1][0], a), calc(dp[i-1][0], b));
            dp[i][1] = dp[i-1][0];
        }
        if(dp[i-1][1]>0) dp[i][1] = max(dp[i][1], max(calc(dp[i-1][1], a), calc(dp[i-1][1], b)));
        if(dp[i][0]<=0 && dp[i][1]<=0) {
            cout << "ddong game";
            return 0;
        }
    }
    cout << max(dp[n][0], dp[n][1]);
}