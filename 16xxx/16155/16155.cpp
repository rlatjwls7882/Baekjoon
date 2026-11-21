#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

int x[5001], y[5001];

void mod(ll &a, ll &b) {
    ll gcdVal = gcd(a, b);
    a/=gcdVal;
    b/=gcdVal;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int lastX, lastY;
    for(int i=0;i<=n;i++) {
        int a, b; cin >> a >> b;
        if(i>=1) {
            for(int i=lastX;i<a;i++) {
                x[i]=a-lastX;
                y[i]=b-lastY;
            }
        }
        lastX=a;
        lastY=b;
    }

    int s, e; cin >> s >> e;
    ll p=0, q=1;
    for(int i=s;i<e;i++) {
        p = p*x[i]+y[i]*q;
        q*=x[i];
        mod(p, q);
    }
    q*=e-s;
    p = abs(p);
    mod(p, q);
    if(q==1) cout << p;
    else cout << p << '/' << q;
}