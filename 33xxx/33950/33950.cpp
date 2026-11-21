#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(n--) {
        string s; cin >> s;
        for(int i=0;i<s.length();i++) {
            if(i+1<s.length() && s[i]=='P' && s[i+1]=='O') {
                cout << "PHO";
                i++;
            } else {
                cout << s[i];
            }
        }
        cout << '\n';
    }
}