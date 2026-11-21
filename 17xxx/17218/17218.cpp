#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s1, s2; cin >> s1 >> s2;

    int dp[s1.length()+1][s2.length()+1];
    for(int i=0;i<=s1.length();i++) {
        dp[i][0]=0;
    }
    for(int i=0;i<=s2.length();i++) {
        dp[0][i]=0;
    }

    for(int i=1;i<=s1.length();i++) {
        for(int j=1;j<=s2.length();j++) {
            if(s1[i-1]==s2[j-1]) dp[i][j] = dp[i-1][j-1]+1;
            else dp[i][j] = max(dp[i-1][j], dp[i][j-1]);
        }
    }

    stack<char> stk;
    int x=s1.length(), y=s2.length();
    while(dp[x][y]!=0) {
        if(dp[x][y]==dp[x-1][y]) {
            x--;
        } else if(dp[x][y]==dp[x][y-1]) {
            y--;
        } else {
            x--; y--;
            stk.push(s1[x]);
        }
    }

    while(!stk.empty()) {
        cout << stk.top(); stk.pop();
    }
}