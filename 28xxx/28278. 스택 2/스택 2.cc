#include<bits/stdc++.h>
using namespace std;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;

    stack<int> stk;
    while(n--) {
        int op; cin >> op;
        if(op==1) {
            int x; cin >> x;
            stk.push(x);
        } else if(op==2) {
            if(stk.size()) {
                cout << stk.top() << '\n';
                stk.pop();
            } else {
                cout << "-1\n";
            }
        } else if(op==3) {
            cout << stk.size() << '\n';
        } else if(op==4) {
            cout << stk.empty() << '\n';
        } else {
            cout << (stk.size() ? stk.top() : -1) << '\n';
        }
    }
}