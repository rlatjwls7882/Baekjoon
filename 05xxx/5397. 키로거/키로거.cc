#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        string s; cin >> s;

        stack<char> before;
        stack<char> after;

        for(int i=0;i<s.length();i++) {
            if(s[i]=='<') {
                if(!before.empty()) {
                    after.push(before.top()); before.pop();
                }
            } else if(s[i]=='-') {
                if(!before.empty()) {
                    before.pop();
                }
            } else if(s[i]=='>') {
                if(!after.empty()) {
                    before.push(after.top()); after.pop();
                }
            } else {
                before.push(s[i]);
            }
        }
        while(!before.empty()) {
            after.push(before.top()); before.pop();
        }

        while(!after.empty()) {
            cout << after.top(); after.pop();
        }
        cout << '\n';
    }
}