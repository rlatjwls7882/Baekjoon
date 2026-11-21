#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, C; cin >> N >> C;
    map<string, int> m;
    while(N-->0) {
        string s; cin >> s;
        int idx=0;
        for(int i=0;i<s.length();i++) {
            if(s[i]=='*') {
                idx=i;
                break;
            }
        }
        for(int i=0;i<26;i++) {
            m[s.substr(0, idx)+char(i+'a')+s.substr(idx+1, s.length()-idx-1)]++;
        }
    }

    int maxCnt=0;
    for(auto tmp:m) maxCnt = max(maxCnt, tmp.second);
    for(auto tmp:m) {
        if(tmp.second==maxCnt) {
            cout << tmp.first << ' ' << tmp.second;
            return 0;
        }
    }
}