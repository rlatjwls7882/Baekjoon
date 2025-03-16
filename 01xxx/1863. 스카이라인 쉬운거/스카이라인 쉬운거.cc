#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int cnt=0;
    stack<int> stk;
    while(n--) {
        int x, y; cin >> x >> y;
        while(!stk.empty() && stk.top()>y) stk.pop(); // 스택의 지금 건물보다 큰 최신 건물들 제거
        if(y>0 && (stk.empty() || stk.top()<y)) { // 건물 넣고 cnt+1
            stk.push(y);
            cnt++;
        }
    }
    cout << cnt;
}