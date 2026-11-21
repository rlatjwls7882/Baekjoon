#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        string s; cin >> s;
        
        int maxLen=1;
        for(int len=s.length();len>1;len--) {
            int idx=0;
            for(int i=s.length()-len;i<s.length();i++) {
                if(s[s.length()-1-idx]==s[i]) idx++;
            }
            if(idx==len) {
                maxLen=len;
                break;
            }
        }

        cout << s;
        for(int i=s.length()-1-maxLen;i>=0;i--) {
            cout << s[i];
        }
        cout << '\n';
    }
}