#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N; cin >> N;

    int cnt=0;
    set<string> word;
    while(N-->0) {
        string s; cin >> s;
        if(word.find(s)==word.end()) {
            cnt++;
            for(int i=0;i<s.length();i++) {
                word.insert(s.substr(i)+s.substr(0, i));
            }
        }
    }
    cout << cnt;
}