#include<bits/stdc++.h>
using namespace std;

bool chk(string s) {
    int lenFor1=0, lenFor0=0;
    for(int i=s.length()-1;i>=0;i--) {
        if(s[i]=='1') {
            if(lenFor0==0) lenFor1++;
            else {
                if(lenFor0==1 && lenFor1==1) {
                    lenFor0=0;
                } else if(lenFor0<2) {
                    return false;
                } else {
                    lenFor0=lenFor1=0;
                }
            }
        } else {
            if(lenFor1==0) return false;
            lenFor0++;
        }
    }
    if(lenFor0==1 && lenFor1==1 || lenFor0==0 && lenFor1==0) return true;
    return false;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int T; cin >> T;
    while(T-->0) {
        string s; cin >> s;
        cout << (chk(s)?"YES\n":"NO\n");
    }
}