#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;

    long long cnt=0;
    stack<int> stk;
    while(n-->0) {
        int tmp; cin >> tmp;
        while(!stk.empty() && stk.top()<=tmp) {
            stk.pop();
        }
        cnt += stk.size();
        stk.push(tmp);
    }
    cout << cnt;
}