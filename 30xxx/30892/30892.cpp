#include<bits/stdc++.h>
using namespace std;

int a[200'000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long long n, k, t; cin >> n >> k >> t;
    for(int i=0;i<n;i++) cin >> a[i];
    sort(a, a+n);

    int idx=0;
    stack<int> stk;
    while(k--) {
        while(idx+1<n && a[idx+1]<t) stk.push(a[idx++]);
        if(idx<n && a[idx]<t) t += a[idx++];
        else if(!stk.empty()) t += stk.top(), stk.pop();
    }
    cout << t;
}