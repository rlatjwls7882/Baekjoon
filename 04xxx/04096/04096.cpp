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
    while(true) {
        string s; cin >> s;
        if(s.compare("0")==0) break;

        for(int i=0;;i++) {
            if(isPalindrome(s)) {
                cout << i << '\n';
                break;
            }
            s[s.length()-1]++;
            for(int j=s.length()-1;j>0;j--) {
                if(s[j]=='9'+1) {
                    s[j-1]++;
                    s[j]='0';
                } else {
                    break;
                }
            }
            if(s[0]=='9'+1) {
                s[0]='0';
                s = "1"+s;
            }
        }
    }
}