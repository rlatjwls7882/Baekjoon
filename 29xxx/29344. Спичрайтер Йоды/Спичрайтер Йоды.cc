#include<bits/stdc++.h>
using namespace std;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    while(true) {
        stack<string> stk;
        while(true) {
            string s; cin >> s;
            if(cin.fail()) return 0;
            if(s.back()=='.') {
                stk.push(s.substr(0, s.size()-1));
                break;
            }
            stk.push(s);
        }
        while(!stk.empty()) {
            cout << stk.top(); stk.pop();
            if(stk.empty()) cout << ". ";
            else cout << " ";
        }
    }
}