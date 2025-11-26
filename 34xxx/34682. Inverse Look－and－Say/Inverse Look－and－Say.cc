#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string s; cin >> s;
    if(s.length()%2) {
        cout << -1;
        return 0;
    }

    vector<char> res;
    for(int i=0;i<s.length();i+=2) {
        if(s[i]=='0' || i==0 && s[i+1]=='0' || i>=2 && s[i+1]==s[i-1]) {
            cout << -1;
            return 0;
        }
        int cnt = s[i]-'0';
        while(cnt--) res.push_back(s[i+1]);
    }
    for(char ch:res) cout << ch;
}