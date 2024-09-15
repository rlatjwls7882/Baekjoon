#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    string s; cin >> s;
    int first[26] = {0, };
    for(int i=0;i<s.length();i++) {
        first[s[i]-'A']++;
    }

    int cnt=0;
    while(n-->1) {
        cin >> s;
        int next[26] = {0, };
        for(int i=0;i<s.length();i++) {
            next[s[i]-'A']++;
        }

        int moreInA=0, moreInB=0;
        for(int i=0;i<26;i++) {
            if(first[i]>next[i]) moreInA += first[i]-next[i];
            else moreInB += next[i]-first[i];
        }
        if(moreInA+moreInB<=1 || moreInA==1&&moreInB==1) cnt++;
    }
    cout << cnt;
}