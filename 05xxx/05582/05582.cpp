#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s1, s2; cin >> s1 >> s2;

    int len[s1.length()+1][s2.length()+1];
    for(int i=0;i<=s1.length();i++) {
        len[i][0]=0;
    }
    for(int i=0;i<=s2.length();i++) {
        len[0][i]=0;
    }

    int maxLen=0;
    for(int i=1;i<=s1.length();i++) {
        for(int j=1;j<=s2.length();j++) {
            if(s1[i-1]==s2[j-1]) {
                len[i][j] = len[i-1][j-1]+1;
            } else {
                len[i][j] = 0;
            }
            maxLen = max(maxLen, len[i][j]);
        }
    }
    cout << maxLen;
}