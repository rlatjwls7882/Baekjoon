#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int q; cin >> q;
    while(q-->0) {
        string s; cin >> s;
        int cnt=0;;
        for(int i=0;i+2<s.length();i++) {
            if(s[i]=='W' && s[i+1]=='O' && s[i+2]=='W') cnt++;
        }
        cout << cnt << '\n';
    }
}