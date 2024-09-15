#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        int n; cin >> n;
        if(n==0) break;
        long long arr[n+2] = {0, };
        for(int i=1;i<=n;i++) {
            cin >> arr[i];
        }

        long long maxArea=0;
        stack<long long> stk;
        stk.push(0);
        for(int i=1;i<=n+1;i++) {
            while(!stk.empty() && arr[stk.top()]>arr[i]) {
                long long h = arr[stk.top()]; stk.pop();
                maxArea = max(maxArea, h*(i-stk.top()-1));
            }
            stk.push(i);
        }
        cout << maxArea << '\n';
    }
}