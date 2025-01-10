#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string s; cin >> s;
    stack<int> stk;
    int curSum=0, last=0;
    for(char ch:s) {
        if(ch=='H') {
            curSum++;
            last=1;
        } else if(ch=='C') {
            curSum+=12;
            last=12;
        } else if(ch=='O') {
            curSum+=16;
            last=16;
        } else if(ch=='(') {
            stk.push(curSum);
            curSum=0;
        } else if(ch==')') {
            last = curSum;
            curSum += stk.top(); stk.pop();
        } else {
            curSum += last*(ch-'1');
        }
    }
    cout << curSum;
}