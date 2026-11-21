#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

ll h[100'000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) cin >> h[i];

    stack<ll> stk;
    ll res1=0, res2=1;
    for(ll i=0;i<n;i++) {
        while(!stk.empty() && h[stk.top()]<=h[i]) stk.pop();
        if(!stk.empty()) {
            ll cur1 = (i-stk.top())*(h[stk.top()]-h[stk.top()+1]) - (h[stk.top()]-h[i]);
            ll cur2 = h[stk.top()]-h[stk.top()+1];
            ll gcdVal = gcd(cur1, cur2);
            cur1/=gcdVal;
            cur2/=gcdVal;
            if(res1*cur2<cur1*res2) res1=cur1, res2=cur2;
        }
        stk.push(i);
    }

    stk = {};
    for(ll i=n-1;i>=0;i--) {
        while(!stk.empty() && h[stk.top()]<=h[i]) stk.pop();
        if(!stk.empty()) {
            ll cur1 = (stk.top()-i)*(h[stk.top()]-h[stk.top()-1]) - (h[stk.top()]-h[i]);
            ll cur2 = h[stk.top()]-h[stk.top()-1];
            ll gcdVal = gcd(cur1, cur2);
            cur1/=gcdVal;
            cur2/=gcdVal;
            if(res1*cur2<cur1*res2) res1=cur1, res2=cur2;
        }
        stk.push(i);
    }
    if(!res1) cout << 0;
    else cout << res1 << '/' << res2;
}