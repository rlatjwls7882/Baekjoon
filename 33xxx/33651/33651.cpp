#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string s; cin >> s;
    string ans="UAPC";

    for(int i=0;i<4;i++) {
        if(ans[i]!=s[i]) {
            cout << ans[i];
            s.insert(s.begin()+i, ans[i]);
        }
    }
}