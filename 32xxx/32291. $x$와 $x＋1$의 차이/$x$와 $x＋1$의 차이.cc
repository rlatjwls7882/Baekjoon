#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

vector<ll> getSubMultiples(ll n) {
    vector<ll> ret;
    for(ll i=1;i*i<=n;i++) {
        if(n%i==0) {
            ret.push_back(i);
            if(i!=n/i) ret.push_back(n/i);
        }
    }
    sort(ret.begin(), ret.end());
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    ll x; cin >> x;

    auto sub = getSubMultiples(x+1);
    sub.pop_back();
    for(auto e:sub) cout << e << ' ';
}