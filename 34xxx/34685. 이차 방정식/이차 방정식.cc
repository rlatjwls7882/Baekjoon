#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int main() {
    cin.tie(0)->sync_with_stdio(0);
    ll k; cin >> k;
    ll boundary=abs(k);

    unordered_set<ll> p;
    for(ll A=-boundary;A<=boundary;A++) {
        if(!A) continue;
        if(k*k%A==0) p.insert(2*k-A-k*k/A);
    }
    cout << p.size() << ' ' << accumulate(p.begin(), p.end(), 0LL);
}