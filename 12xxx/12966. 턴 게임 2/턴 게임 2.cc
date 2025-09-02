#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    ll a, b; cin >> a >> b;

    ll x = sqrt(a+b);
    if(a+b != x*x) {
        cout << -1;
        return 0;
    }

    int cnt=0;
    x = x*2-1;
    while(x>=1) {
        if(a>=x && a-x!=2) {
            cnt++;
            a -= x;
        }
        x-=2;
    }
    if(a) cout << -1;
    else cout << cnt;
}