#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; cin >> s;
    for(int i=0;i<s.length();i++) {
        if(s[i]=='x') {
            if(i==1 && s[i-1]=='-') {
                cout << -1;
            } else if(i==0) {
                cout << 1;
            } else {
                for(int j=0;j<i;j++) {
                    cout << s[j];
                }
            }
            return 0;
        }
    }
    cout << 0;
}