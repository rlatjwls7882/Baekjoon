#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; string s; cin >> N >> s;

    string last = "";
    for(int i=0;i<s.length();i++) {
        if(s[i]=='+' || s[i]=='-' || s[i]=='0') {
            continue;
        }
        if(s[i]=='C') {
            last="C";
            cout << 'B';
        } else if(s[i]=='B' && (i+1<s.length() && s[i+1]!='+' || i+1==s.length())) {
            if(i==0 || last.compare("C")==0) cout << 'D';
            else cout << 'B';
            last="B0";
        } else if(s[i]=='A' && i+1<s.length() && s[i+1]=='-' || s[i]=='B' && i+1<s.length() && s[i+1]=='+') {
            if(i==0 || last.compare("B0")==0 || last.compare("C")==0) cout << 'P';
            else cout << "D";
            if(s[i]=='A') last="A-";
            else last="B+";
        } else if(s[i]=='A' && i+1<s.length() && s[i+1]=='+') {
            cout << 'E';
            last="A+";
        } else {
            if(i==0 || last.compare("A-")==0 || last.compare("B0")==0 || last.compare("B+")==0 || last.compare("C")==0) cout << 'E';
            else if(last.compare("A+")==0 || last.compare("A0")==0) cout << 'P';
            last="A0";
        }
    }
}