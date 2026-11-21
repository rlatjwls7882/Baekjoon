#include<bits/stdc++.h>
using namespace std;

long long getRes(string s) {
    long long ret = stoll(s);
    for(int i=0;i<s.length();i++) {
        s[i] = '9' - s[i] + '0';
    }
    return ret * stoll(s);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        string s; cin >> s;

        /** 
         * 4 * 5
         * 49 * 50
         * 499 * 500
         */
        if(s[0]>'4') {
            s[0]='4';
            for(int i=1;i<s.length();i++) {
                s[i]='9';
            }
        }
        cout << getRes(s) << '\n';
    }
}