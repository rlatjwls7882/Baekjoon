#include<bits/stdc++.h>
using namespace std;

string s;

string rev(string t) {
    for(int i=0;i<t.length()/2;i++) swap(t[i], t[t.length()-1-i]);
    return t;
}

bool chk(string t) {
    if(s.length()>t.length()) return false;
    if(s.length()==t.length()) return s==t;
    if(t[0]=='B' && chk(rev(t.substr(1, t.length()-1)))) return true;
    if(t.back()=='A' && chk(t.substr(0, t.length()-1))) return true;
    return false;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string t; cin >> s >> t;
    cout << chk(t);
}