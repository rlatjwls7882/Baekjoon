#include<bits/stdc++.h>
using namespace std;

void back(string s, int start) {
    if(start==s.length()) {
        cout << s << '\n';
        return;
    }
    for(int i=start;i<s.length();i++) {
        if(i!=start && s[i]==s[start]) continue;
        if(s[i]!=s[start]) swap(s[i], s[start]);
        back(s, start+1);
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(n--) {
        string s; cin >> s;
        sort(s.begin(), s.end());
        back(s, 0);
    }
}