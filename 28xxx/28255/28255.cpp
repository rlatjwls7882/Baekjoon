#include<bits/stdc++.h>
using namespace std;

bool icecream(string s) {
    int n = s.length()/3;

    if(n*3==s.length()) {
        for(int i=0;i<n;i++) {
            if(s[i]!=s[2*n-1-i]) {
                return false;
            }
            if(s[i]!=s[2*n+i]) {
                return false;
            }
        }
        return true;
    } else if(n*3==s.length()-2) {
        bool chk=true;
        for(int i=0;i<n;i++) {
            if(s[i]!=s[2*n-i]) {
                chk=false;
            }
        }
        for(int i=0;i<=n;i++) {
            if(s[i]!=s[2*n+1+i]) {
                chk=false;
            }
        }
        if(chk) return true;

        for(int i=0;i<=n;i++) {
            if(s[i]!=s[2*n+1-i]) {
                return false;
            }
        }
        for(int i=1;i<=n;i++) {
            if(s[i]!=s[2*n+1+i]) {
                return false;
            }
        }
        return true;
    } else {
        for(int i=0;i<n;i++) {
            if(s[i]!=s[2*n-i]) {
                return false;
            }
        }
        for(int i=1;i<n;i++) {
            if(s[i]!=s[2*n+i]) {
                return false;
            }
        }
        return true;
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;

    while(T-->0) {
        string s; cin >> s;
        cout << icecream(s) << '\n';
    }
}