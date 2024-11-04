#include<bits/stdc++.h>
using namespace std;

bool isPalindrome(string s) {
    for(int i=0;i<s.length()/2;i++) {
        if(s[i] != s[s.length()-1-i]) return false;
    }
    return true;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    // 팰린드롬끼리 합쳐야 더블팰린드롬이 됨
    int cnt=0;
    for(int i=0;i<N;i++) {
        string s; cin >> s;
        if(isPalindrome(s)) cnt++;
    }
    cout << cnt*(cnt-1);
}