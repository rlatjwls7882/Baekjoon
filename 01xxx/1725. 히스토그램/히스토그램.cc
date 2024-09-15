#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int h[N+2] = {0, };
    for(int i=1;i<=N;i++) {
        cin >> h[i];
    }

    int maxSize=0;
    stack<int> stk;
    stk.push(0);
    for(int i=1;i<=N+1;i++) {
        while(!stk.empty() && h[stk.top()]>h[i]) {
            int curH = h[stk.top()]; stk.pop();
            maxSize = max(maxSize, curH*(i-stk.top()-1));
        }
        stk.push(i);
    }
    cout << maxSize;
}