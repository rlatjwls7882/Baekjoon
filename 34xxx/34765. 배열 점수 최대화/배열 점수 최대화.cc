#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    ll n, v; cin >> n >> v;

    ll res=v+n-1;
    deque<ll> a; a.push_back(v+n-1);
    for(int i=n-2;i>=0;i--) {
        a.push_back(a.back()-1);
        a.push_back(a.back()-1);
        a.pop_front();
        res = max(res, (ll)(a.size()*a[a.size()/2]));
    }
    cout << res;
}