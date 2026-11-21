#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    while(n-->0) {
        string s; cin >> s;
        if(s[0]<97) s[0]+=32;
        for(char ch:s) {
            if(ch<97) cout << '_' << char(ch+32);
            else cout << ch;
        }
        cout << '\n';
    }
}