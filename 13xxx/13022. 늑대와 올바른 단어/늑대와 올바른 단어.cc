#include<bits/stdc++.h>
using namespace std;

string s;

bool chk() {
    int curW=0, cnt=0;
    for(int i=0;i<s.length();) {
        if(s[i]=='w') {
            curW++;
            i++;
        } else {
            if(curW==0 || s.length()<i+3*curW) return 0;
            for(int j=i;j<i+curW;j++) if(s[j]!='o') return 0;
            for(int j=i+curW;j<i+2*curW;j++) if(s[j]!='l') return 0;
            for(int j=i+2*curW;j<i+3*curW;j++) if(s[j]!='f') return 0;
            i += 3*curW;
            curW=0;
        }
    }
    return curW==0;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> s;
    cout << chk();
}