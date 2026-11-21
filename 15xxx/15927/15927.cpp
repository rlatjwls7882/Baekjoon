#include<bits/stdc++.h>
using namespace std;

bool isPalindrome(string s) {
    for(int i=0;i<s.length()/2;i++) {
        if(s[i]!=s[s.length()-1-i]) {
            return false;
        }
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; cin >> s;

    bool chk=true;
    for(int i=1;i<s.length();i++) {
        if(s[i]!=s[i-1]) {
            chk=false;
            break;
        }
    }
    if(chk) {
        cout << -1;
        return 0;
    }

    if(isPalindrome(s)) cout << s.length()-1;
    else cout << s.length();
}