#include<bits/stdc++.h>
using namespace std;

int use[128];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while(true) {
        int m; cin >> m;
        if(!m) break;
        string s; cin.ignore(); getline(cin, s);

        memset(use, 0, sizeof use);
        int l=0, r=0, cnt=0, maxLen=0;
        while(r<s.length()) {
            while(r<s.length() && (cnt<m || use[s[r]])) {
                if(++use[s[r++]]==1) cnt++;
            }
            maxLen = max(maxLen, r-l);
            if(--use[s[l++]]==0) cnt--;
        }
        cout << maxLen << '\n';
    }
}