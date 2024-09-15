#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; cin >> s;

    stack<int> stk;
    for(int i=0;i<s.length();i++) {
        if('0'<=s[i] && s[i]<='9') {
            stk.push(s[i]-'0');
        } else {
            int b = stk.top(); stk.pop();
            int a = stk.top(); stk.pop();
            if(s[i]=='*') stk.push(a*b);
            else if(s[i]=='+') stk.push(a+b);
            else if(s[i]=='-') stk.push(a-b);
            else stk.push(a/b);
        }
    }
    cout << stk.top();
}