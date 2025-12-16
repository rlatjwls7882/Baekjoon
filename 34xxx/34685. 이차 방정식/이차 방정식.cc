#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    ll k; cin >> k;
    ll boundary=abs(k)*2;

    unordered_set<ll> p;
    for(ll a=-boundary;a<=boundary;a++) {
        if(!(a+k)) continue;
        if(k*k%(a+k)==0) p.insert(-(a+k*k/(a+k)-k));
    }
    cout << p.size() << ' ' << accumulate(p.begin(), p.end(), 0LL);
}