#include<bits/stdc++.h>
using namespace std;

bool isPalindrome(string s) {
    if(s.find('1')==s.npos) return true;
    s = s.substr(s.find('1'));

    for(int i=0;i<s.length()/2;i++) {
        if(s[i]!=s[s.length()-1-i]) return false;
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int x; cin >> x;
        for(int i=0;;i++) {
            if(isPalindrome(bitset<32>(x+i).to_string()) || isPalindrome(bitset<32>(x-i).to_string())) {
                cout << i << '\n';
                break;
            }
        }
    }
}