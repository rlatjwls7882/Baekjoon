#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; getline(cin, s);
    bool chk=false;
    for(int i=0;i<s.length();i++) {
        if(s[i]=='(') cout << '\n', chk=true;
        else if(s[i]!=')') cout << s[i];
    }
    if(!chk) cout << "\n-";
}