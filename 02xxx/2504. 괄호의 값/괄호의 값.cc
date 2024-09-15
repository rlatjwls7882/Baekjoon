#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    string s; cin >> s;

    stack<char> stk;
    int depth=0;
    int storage[30] = {0, };

    for(int i=0;i<s.length();i++) {
        if(s[i]=='(' || s[i]=='[') {
            stk.push(s[i]);
            depth++;
            storage[depth]=0;
        } else {
            if(s[i]==')') {
                if(stk.empty() || stk.top()!='(') {
                    cout << 0;
                    return 0;
                } else {
                    if(storage[depth]) storage[depth]*=2;
                    else storage[depth]=2;
                    storage[depth-1] += storage[depth];
                    depth--; stk.pop();
                }
            } else {
                if(stk.empty() || stk.top()!='[') {
                    cout << 0;
                    return 0;
                } else {
                    if(storage[depth]) storage[depth]*=3;
                    else storage[depth]=3;
                    storage[depth-1] += storage[depth];
                    depth--; stk.pop();
                }
            }
        }
    }
    cout << storage[0];
}