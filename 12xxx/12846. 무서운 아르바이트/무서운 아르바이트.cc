#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

ll t[100'002];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=1;i<=n;i++) cin >> t[i];

    ll res=0;
    vector<ll> stk; stk.push_back(0);
    for(int i=1;i<=n+1;i++) {
        while(t[stk.back()]>t[i]) {
            ll top = t[stk.back()]; stk.pop_back();
            res = max(res, top*(i-stk.back()-1));
        }
        stk.push_back(i);
    }
    cout << res;
}