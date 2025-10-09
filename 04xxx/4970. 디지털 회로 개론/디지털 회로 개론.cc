#include<bits/stdc++.h>
using namespace std;

int NOT(int x) {
    return (2-x);
}

int AND(int x, int y) {
    if(x==2 && y==2) return 2;
    return !(x==0 || y==0);
}

int OR(int x, int y) {
    return max(x, y);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while(true) {
        string s; cin >> s;
        if(s[0]=='.') break;

        int cnt=0;
        for(int p=0;p<=2;p++) {
            for(int q=0;q<=2;q++) {
                for(int r=0;r<=2;r++) {
                    stack<int> stk;
                    stack<char> opt;
                    for(int ch : s) {
                        if(ch=='P') stk.push(p);
                        else if(ch=='Q') stk.push(q);
                        else if(ch=='R') stk.push(r);
                        else if('0'<=ch && ch<='2') stk.push(ch-'0');
                        else {
                            opt.push(ch);
                            if(opt.top()==')') {
                                opt.pop();
                                while(opt.top()!='(') {
                                    char op = opt.top(); opt.pop();
                                    if(op=='-') stk.top() = NOT(stk.top());
                                    else {
                                        int top1 = stk.top(); stk.pop();
                                        int top2 = stk.top(); stk.pop();
                                        if(!opt.empty() && opt.top()=='-') {
                                            opt.pop();
                                            opt.push(op);
                                            stk.push(NOT(top2));
                                            stk.push(top1);
                                        }
                                        else if(op=='+') stk.push(OR(top1, top2));
                                        else stk.push(AND(top1, top2));
                                    }
                                }
                                opt.pop();
                            }
                        }
                    }
                    while(!opt.empty()) {
                        char op = opt.top(); opt.pop();
                        if(op=='-') stk.top() = NOT(stk.top());
                        else {
                            int top1 = stk.top(); stk.pop();
                            int top2 = stk.top(); stk.pop();
                            if(!opt.empty() && opt.top()=='-') {
                                opt.pop();
                                opt.push(op);
                                stk.push(NOT(top2));
                                stk.push(top1);
                            }
                            if(op=='+') stk.push(OR(top1, top2));
                            else stk.push(AND(top1, top2));
                        }
                    }
                    if(stk.top()==2) cnt++;
                }
            }
        }
        cout << cnt << '\n';
    }
}