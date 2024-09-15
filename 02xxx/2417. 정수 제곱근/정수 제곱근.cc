#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    ll n; cin >> n;
    
    ll tmp = ll(sqrt(n));
    if(tmp*tmp>=n) cout << tmp;
    else cout << tmp+1;
}