#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string s; cin >> s;
    set<char> charSet;
    for(int i=s.length()-1;i>=0;i--) {
        if(charSet.count(s[i])) {
            cout << i+1;
            return 0;
        }
        charSet.insert(s[i]);
    }
}