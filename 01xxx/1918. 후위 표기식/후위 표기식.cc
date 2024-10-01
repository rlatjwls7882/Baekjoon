#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; cin >> s;

    stack<char> stk;
    for(int i=0;i<s.length();i++) {
        if('A'<=s[i] && s[i]<='Z') {
            cout << s[i];
        } else {
            while(s[i]!='(' && s[i]!=')' && !stk.empty() && stk.top()!='(' && stk.top()!=')' && (stk.top()=='*' || stk.top()=='/' || s[i]=='+' || s[i]=='-')) {
                cout << stk.top(); stk.pop();
            }
            stk.push(s[i]);
            if(stk.top()==')') {
                stk.pop();
                while(true) {
                    char top = stk.top(); stk.pop();
                    if(top=='(') break;
                    cout << top;
                }
            }
        }
    }
    while(!stk.empty()) {
        cout << stk.top(); stk.pop();
    }
}