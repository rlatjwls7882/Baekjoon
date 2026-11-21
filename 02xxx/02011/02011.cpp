#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; cin >> s;
    if(s[0]=='0') {
        cout << 0;
        return 0;
    }
    int N = s.length();
    int dp[N][2];
    dp[0][0]=1; dp[0][1]=0;
    for(int i=1;i<N;i++) {
        if(s[i]=='0') {
            if(s[i-1]=='0' || s[i-1]>='3') {
                cout << 0;
                return 0;
            }
            dp[i][0]=0;
            dp[i][1]=dp[i-1][0];
        } else {
            dp[i][0] = (dp[i-1][0]+dp[i-1][1])%1000000;
            dp[i][1]=0;
            if((s[i-1]-'0')*10+s[i]-'0'<=26) dp[i][1] = dp[i-1][0];
        }
    }
    cout << (dp[N-1][0]+dp[N-1][1])%1000000;
}