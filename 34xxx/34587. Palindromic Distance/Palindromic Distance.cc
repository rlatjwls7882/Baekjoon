#include<bits/stdc++.h>
using namespace std;

string s;
int dp[3000][3000]; // dp[L][R] : L부터 R까지 팰린드롬이도록 하는 최소 연산 수

int dfs(int l, int r) {
    if(l>=r) return 0;
    if(dp[l][r]!=-1) return dp[l][r];

    if(s[l]==s[r]) dp[l][r] = dfs(l+1, r-1);
    else dp[l][r] = min({dfs(l+1, r), dfs(l, r-1), dfs(l+1, r-1)})+1;
    return dp[l][r];
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        cin >> s;
        for(int i=0;i<s.length();i++) for(int j=i+1;j<s.length();j++) dp[i][j]=-1;
        cout << dfs(0, s.length()-1) << '\n';
    }
}