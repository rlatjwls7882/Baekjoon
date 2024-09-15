#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; int k; cin >> s >> k;

    int cnt=0, jump=s.length()-k;
    for(int i=0;i<jump;i++) {
        int chars[26] = {0, };
        for(int j=i;j<s.length();j+=jump) {
            chars[s[j]-'a']++;
        }

        char change; int occur=0;
        for(int j=0;j<26;j++) {
            if(occur<chars[j]) {
                occur=chars[j];
                change='a'+j;
            }
        }

        for(int j=i;j<s.length();j+=jump) {
            if(s[j]!=change) {
                cnt++;
            }
        }
    }
    cout << cnt;
}