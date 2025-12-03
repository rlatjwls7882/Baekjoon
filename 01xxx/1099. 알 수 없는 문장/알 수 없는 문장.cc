#include<bits/stdc++.h>
using namespace std;

int dp[51];
string s[50];

bool match(string a, string b) {
    sort(a.begin(), a.end());
    sort(b.begin(), b.end());
    return a==b;
}

int score(string a, string b) {
    int cnt=0;
    for(int i=0;i<a.length();i++) cnt += a[i]!=b[i];
    return cnt;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string res; cin >> res;
    res = "0"+res;
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> s[i];

    memset(dp, -1, sizeof dp);
    dp[0]=0;
    for(int i=1;i<res.length();i++) {
        for(int j=0;j<n;j++) {
            int len = s[j].length();
            if(i-len>=0 && dp[i-len]!=-1 && match(s[j], res.substr(i-len+1, len))) {
                int cost = score(s[j], res.substr(i-len+1, len));
                if(dp[i]==-1) dp[i] = dp[i-len]+cost;
                else dp[i] = min(dp[i], dp[i-len]+cost);
            }
        }
    }
    cout << dp[res.length()-1];
}