#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const ll MOD = 1e9+7;

ll a[1'000'000];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<m;i++) cin >> a[i];
    sort(a, a+m);

    ll x=a[m-2], y=a[m-1];
    if(y<=0) {
        cout << (x+y+MOD)%MOD;
    } else {
        while(x<0 && n-->0) x+=y;
        if(n<=0) swap(x, y);

        while(n-->0) {
            ll tmp = (x+y+MOD)%MOD;
            x=y;
            y=tmp;
        }
        cout << (y+MOD)%MOD;
    }
}