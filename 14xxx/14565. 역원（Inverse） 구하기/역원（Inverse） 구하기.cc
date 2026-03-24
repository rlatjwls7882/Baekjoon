#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

tuple<ll, ll, ll> EEA(ll a, ll b) {
    if(!b) return {a, 1, 0};
    auto [g, x, y] = EEA(b, a%b);
    return {g, y, x-a/b*y};
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    ll n, a; cin >> n >> a;
    auto [g, x, y] = EEA(a, n);
    if(x<0) x+=n;
    cout << n-a << ' ' << (g!=1 ? -1 : x);
}