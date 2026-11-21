#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; string s; cin >> n >> s;

    int val=-1;
    bool chk=false;
    for(char ch:s) {
        if('0'<=ch && ch<='9') {
            if(val==-1)val = ch-'0';
            else val = val*10 + ch-'0';
            chk=true;
        } else {
            if(val!=-1) cout << val*n << '\n';
            val=-1;
        }
    }
    if(val!=-1) cout << val*n;
    if(!chk) cout << "N/A";
}