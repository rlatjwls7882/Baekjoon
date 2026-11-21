#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int n;
ll x[100'000];

ll getDist(ll a) {
    ll ret=0;
    for(int i=1;i<n;i++) ret += abs(i*a-x[i]);
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    cin >> n;
    for(int i=0;i<n;i++) cin >> x[i];

    ll left=0, right=1'000'000'000;
    while(left+2<right) {
        ll a = (left*2+right)/3;
        ll b = (left+right*2)/3;
        if(getDist(a)<=getDist(b)) right=b;
        else left=a+1;
    }

    ll res=LONG_LONG_MAX;
    for(int i=left;i<=right;i++) res = min(res, getDist(i));
    cout << res;
}