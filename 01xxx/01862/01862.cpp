#include<bits/stdc++.h>
using namespace std;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    string s; cin >> s;

    int res=0;
    for(int i=0;i<s.length();i++) {
        if(s[i]>='5') s[i]--;
        res = res*9 + s[i]-'0';
    }
    cout << res;
}