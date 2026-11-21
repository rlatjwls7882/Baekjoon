#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    ll n; cin >> n;

    ll cnt=n;
    n--;
    for(ll i=1;i<=n;) {
        ll next = n/(n/i);
        if(i==next) next++;
        cnt += (next-i)*(n/i);
        i=next;
    }
    cout << cnt;
}