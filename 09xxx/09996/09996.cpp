#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    string pattern; cin >> pattern; int idx;
    for(int i=0;i<pattern.length();i++) {
        if(pattern[i]=='*') idx=i;
    }

    while(N-->0) {
        string s; cin >> s;
        bool chk=true;
        for(int i=0;i<idx;i++) {
            if(s[i]!=pattern[i]) {
                chk=false;
                break;
            }
        }
        for(int i=0;i<pattern.length()-1-idx;i++) {
            if(s[s.length()-1-i]!=pattern[pattern.length()-1-i]) {
                chk=false;
                break;
            }
        }
        if(s.length()>=pattern.length()-1 && chk) cout << "DA\n";
        else cout << "NE\n";
    }
}