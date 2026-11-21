#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;

    int cur=1;
    stack<int> stk;
    queue<string> res;
    for(int i=0;i<n;i++) {
        int tmp; cin >> tmp;
        while(stk.empty() || !stk.empty() && stk.top() != tmp) {
            stk.push(cur++);
            res.push("+\n");
            if(stk.top()>tmp) {
                cout << "NO";
                return 0;
            }
        }
        res.push("-\n");
        stk.pop();
    }

    while(!res.empty()) {
        cout << res.front(); res.pop();
    }
}