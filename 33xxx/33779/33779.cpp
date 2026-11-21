#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string s; cin >> s;

    for(int i=0;i<s.length()/2;i++) {
        if(s[i]!=s[s.length()-1-i]) {
            cout << "boop";
            return 0;
        }
    }
    cout << "beep";
}