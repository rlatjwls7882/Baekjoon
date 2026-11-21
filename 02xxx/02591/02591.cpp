#include<bits/stdc++.h>
using namespace std;

int dp[40][35];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string s; cin >> s;

    for(int i=0;i<s.length();i++) {
        if(i==0) {
            dp[i][s[i]-'0']=1;
        } else {
            // 1자리로 끝나는 수의 개수
            for(int j=1;j<=34;j++) {
                if(s[i]!='0') dp[i][s[i]-'0'] += dp[i-1][j];
            }
            // 2자리로 끝나는 수의 개수
            for(int j=1;j<=3;j++) {
                if(1<=j*10+s[i]-'0' && j*10+s[i]-'0'<=34) dp[i][j*10+s[i]-'0'] += dp[i-1][j];
            }
        }
    }
    cout << accumulate(dp[s.length()-1], dp[s.length()-1]+35, 0);
}