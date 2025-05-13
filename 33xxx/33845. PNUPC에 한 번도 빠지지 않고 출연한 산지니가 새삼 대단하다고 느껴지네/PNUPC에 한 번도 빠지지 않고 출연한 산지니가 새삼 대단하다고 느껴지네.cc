#include<bits/stdc++.h>
using namespace std;

bool chk[128];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string s, t; cin >> s >> t;

    for(char ch:s) chk[ch]=true;
    for(char ch:t) {
        if(!chk[ch]) {
            cout << ch;
        }
    }
}