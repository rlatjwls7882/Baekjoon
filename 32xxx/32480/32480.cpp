#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const ll MOD=1e9+7;
ll SZ=1, a[800'000], a2[800'000];

void SetRight(ll x, ll b) {
    x+=SZ;
    a[x]=(a[x]+b+MOD)%MOD;
    while(x>1) {
        x>>=1;
        a[x]=(a[x*2]+a[x*2+1])%MOD;
    }
}

void SetLeft(ll x, ll b) {
    x+=SZ;
    a2[x]=(a2[x]+b+MOD)%MOD;
    while(x>1) {
        x>>=1;
        a2[x]=(a2[x*2]+a2[x*2+1])%MOD;
    }
}

ll QueryRight(ll l, ll r) {
    ll re=0;
    for(l+=SZ,r+=SZ;l<=r;l>>=1,r>>=1) {
        if(l&1) re+=a[l++];
        if(!(r&1)) re+=a[r--];
    }
    return re%MOD;
}

ll QueryLeft(ll l, ll r) {
    ll re=0;
    for(l+=SZ,r+=SZ;l<=r;l>>=1,r>>=1) {
        if(l&1) re+=a2[l++];
        if(!(r&1)) re+=a2[r--];
    }
    return re%MOD;
}

ll P(ll a, ll b) {
    ll r=1;
    while(b) {
        if(b&1) r=r*a%MOD;
        a=a*a%MOD;
        b>>=1;
    }
    return r;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, q; cin >> n >> q;
    string p; cin >> p;

    ll pp=0, div=1;
    bool chk=false;
    for(char c:p) {
        if(chk) div*=10;
        if(c=='.') chk=true;
        else pp=pp*10+c-'0';
    }
    pp=(1+MOD-pp*P(div, MOD-2)%MOD)%MOD;

    while(SZ<n) SZ<<=1;
    while(q--) {
        char c; ll b, x; cin >> c;
        if(c=='+') {
            cin >> b >> x;
            SetRight(x, b*P(pp, x)%MOD);
            SetLeft(x, b*P(P(pp, x), MOD-2)%MOD);
        } else if(c=='-') {
            cin >> b >> x;
            SetRight(x, -b*P(pp, x)%MOD);
            SetLeft(x, -b*P(P(pp, x), MOD-2)%MOD);
        } else {
            cin >> x;
            cout << (QueryRight(x, n)*P(P(pp, x), MOD-2)+QueryLeft(1, x-1)*P(pp, x))%MOD << '\n';
        }
    }
}
