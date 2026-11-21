#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        int n; cin >> n;
        if(n==0) break;
        string word=""; int idx=0;
        while(n-->0) {
            string s; char c; cin >> s >> c;
            if(s[0]=='I') {
                word.insert(word.begin()+idx, c);
                idx++;
            } else if(s[0]=='L') {
                idx = max(0, --idx);
            } else {
                idx = min((int)word.length(), ++idx);
            }
        }
        cout << word << '\n';
    }
}