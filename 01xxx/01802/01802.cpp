#include<bits/stdc++.h>
using namespace std;

bool chk(string s, int len, int pos) {
    if(len==1) return true;
    for(int i=0;i<len-1;i++) {
        if(s[pos+i]==s[pos+(len-1)*2-i]) return false;
    }
    return chk(s, len/2, pos) & chk(s, len/2, pos+len);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int T; cin >> T;
    while(T-->0) {
        string s; cin >> s;
        if(chk(s, (s.length()+1)/2, 0)) cout << "YES\n";
        else cout << "NO\n";
    }
}