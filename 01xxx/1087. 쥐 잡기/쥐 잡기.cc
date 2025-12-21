#include<bits/stdc++.h>
using namespace std;

typedef long double ld;
const int MAX = 50;
const int INF = 2e8;

int n;
ld px[MAX], py[MAX], vx[MAX], vy[MAX];

ld getCost(ld t) {
    ld l=INF, r=-INF, u=-INF, d=INF;
    for(int i=0;i<n;i++) {
        l = min(l, px[i]+vx[i]*t);
        r = max(r, px[i]+vx[i]*t);
        u = max(u, py[i]+vy[i]*t);
        d = min(d, py[i]+vy[i]*t);
    }
    return max(r-l, u-d);
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    cin >> n;
    for(int i=0;i<n;i++) cin >> px[i] >> py[i] >> vx[i] >> vy[i];

    ld l=0, r=2000;
    while(l+0.000000000002<r) {
        ld p = (l*2+r)/3;
        ld q = (l+r*2)/3;
        if(getCost(p)<=getCost(q)) r=q;
        else l=p;
    }

    ld ret=100'000'000;
    while(l<=r) {
        ret = min(ret, getCost(l));
        l+=0.000000000001;
    }
    cout << setprecision(9) << fixed << ret;
}