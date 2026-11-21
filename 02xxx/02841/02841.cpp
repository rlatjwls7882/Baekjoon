#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, p; cin >> n >> p;

    stack<int> stk[6];
    int cnt=0;
    while(n-->0) {
        int a, b; cin >> a >> b;
        while(!stk[a-1].empty() && stk[a-1].top()>b) {
            stk[a-1].pop();
            cnt++;
        }
        if(stk[a-1].empty() || stk[a-1].top() != b) {
            stk[a-1].push(b);
            cnt++;
        }
    }
    cout << cnt;
}