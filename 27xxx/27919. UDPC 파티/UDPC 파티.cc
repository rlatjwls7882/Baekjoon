#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    
    string s; cin >> s;
    int cntU=0, cntD=0;
    for(int i=0;i<s.length();i++) {
        if(s[i]=='U'||s[i]=='C') {
            cntU++;
        } else {
            cntD++;
        }
    }

    bool chk=false;
    if(cntU>(cntD+1)/2) {
        cout << "U";
        chk=true;
    }
    if(cntD>0) {
        cout << "DP";
        chk=true;
    }
    if(!chk) {
        cout << "C";
    }
}