#include <bits/stdc++.h>
using namespace std;

bool isAkarakaPalindrome(string s) {
    for(int i=0;i<s.length()/2;i++) {
        if(s[i]!=s[s.length()-1-i]) {
            return false;
        }
    }
    if(s.length()>1 && !isAkarakaPalindrome(s.substr(0, s.length()/2))) return false;
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; cin >> s;

    if(isAkarakaPalindrome(s)) cout << "AKARAKA";
    else cout << "IPSELENTI";
}