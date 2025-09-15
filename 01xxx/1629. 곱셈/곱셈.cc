#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

ll a, b, c;

ll expo_pow(ll a, ll b) {
    if(!b) return 1;

    ll tmp = expo_pow(a, b/2);
    if(b%2) return tmp*tmp%c*a%c;
    return tmp*tmp%c;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> a >> b >> c;
    cout << expo_pow(a, b);
}