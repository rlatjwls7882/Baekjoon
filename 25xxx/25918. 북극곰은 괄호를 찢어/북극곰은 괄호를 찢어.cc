#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; string s; cin >> n >> s;
    stack<char> stk;

    int maxDepth=0, depth=0;
    for(char ch:s) {
        if(!stk.empty() && stk.top()!=ch) {
            maxDepth = max(maxDepth, depth);
            depth--;
            stk.pop();
        } else {
            depth++;
            stk.push(ch);
        }
    }
    if(depth) cout << -1;
    else cout << maxDepth;
}