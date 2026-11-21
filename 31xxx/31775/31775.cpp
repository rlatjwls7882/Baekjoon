#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    bool chk1=false, chk2=false, chk3=false;
    for(int i=0;i<3;i++) {
        string s; cin >> s;
        if(s[0]=='l') chk1=true;
        else if(s[0]=='k') chk2=true;
        else if(s[0]=='p') chk3=true;
    }

    if(chk1 && chk2 && chk3) cout << "GLOBAL";
    else cout << "PONIX";
}
