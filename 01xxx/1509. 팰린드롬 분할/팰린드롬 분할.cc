#include<bits/stdc++.h>
using namespace std;

string s;
int dp[2500]; // dp[i] : i번째 문자까지의 최소 팰린드롬 수

bool isPalindrome(int left, int right) {
    int len = right-left+1;
    for(int i=0;i<len/2;i++) {
        if(s[left+i]!=s[right-i]) return false;
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> s;

    for(int i=0;i<s.length();i++) dp[i]=i+1;
    for(int i=1;i<s.length();i++) {
        if(isPalindrome(0, i)) {
            dp[i]=1;
        }
    }

    for(int i=0;i<s.length()-1;i++) {
        for(int j=i+1;j<s.length();j++) {
            if(isPalindrome(i+1, j)) {
                dp[j] = min(dp[j], dp[i]+1);
            }
        }
    }
    cout << dp[s.length()-1];
}