#include<bits/stdc++.h>
using namespace std;

bool chk(string s) {
    int count0=0, count1=0;
    for(int i=s.length()-1;i>=0;i--) {
        if(s[i]=='1') {
            if(count0==0) count1++;
            else {
                if(count0==1 && count1==1) {
                    count0=0;
                } else if(count0<2) {
                    return false;
                } else {
                    count0=count1=0;
                }
            }
        } else {
            if(count1==0) return false;
            count0++;
        }
    }
    if(count0==0 && count1==0 || count0==1 && count1==1) return true;
    return false;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string s; cin >> s;
    if(chk(s)) cout << "SUBMARINE";
    else cout << "NOISE";
}