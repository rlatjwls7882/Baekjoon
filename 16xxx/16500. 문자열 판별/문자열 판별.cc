#include<bits/stdc++.h>
using namespace std;

int n;
string s;
vector<string> a(100);

int match(int startIdx, int aIdx) {
    for(int i=0;i<a[aIdx].length();i++) {
        if(s.length()<=startIdx+i || s[startIdx+i] != a[aIdx][i]) {
            return -1;
        }
    }
    return startIdx+a[aIdx].length();
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> s >> n;
    for(int i=0;i<n;i++) cin >> a[i];

    // dp[i] : i번째 문자까지 완성 가능
    vector<bool> dp(s.length()+1);
    dp[0]=true;
    for(int i=0;i<s.length();i++) {
        if(dp[i]) {
            for(int j=0;j<n;j++) {
                int ret = match(i, j);
                if(ret!=-1) dp[ret]=true;
            }
        }
    }
    cout << dp[s.length()];
}