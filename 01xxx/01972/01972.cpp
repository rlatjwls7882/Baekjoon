#include<bits/stdc++.h>
using namespace std;

bool isSurprising(string s) {
    for(int i=1;i<s.length()-1;i++) {
        vector<set<char>> v = vector<set<char>>(26);
        for(int j=i;j<s.length();j++) {
            if(v[s[j-i]-'A'].count(s[j])) return false;
            v[s[j-i]-'A'].insert(s[j]);
        }
    }
    return true;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        string s; cin >> s;
        if(s[0]=='*') break;
        if(isSurprising(s)) cout << s << " is surprising.\n";
        else cout << s << " is NOT surprising.\n";
    }
}