#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

ll a[100'002], preSum[100'002];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;
    for(int i=1;i<=n;i++) {
        cin >> a[i];
        preSum[i] = preSum[i-1]+a[i];
    }

    ll res=0;
    vector<int> stk; stk.push_back(0);
    for(int i=1;i<=n+1;i++) {
        while(a[stk.back()]>a[i]) {
            ll top = stk.back(); stk.pop_back();
            res = max(res, a[top]*(preSum[i-1]-preSum[stk.back()]));
        }
        stk.push_back(i);
    }
    cout << res;
}