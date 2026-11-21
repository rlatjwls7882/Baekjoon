#include<bits/stdc++.h>
using namespace std;

typedef long double ld;

ld ax, ay, bx, by, cx, cy, dx, dy;

ld sq(ld a) {
    return a*a;
}

ld getDist(ld perc) {
    return sqrt(sq(ax*perc+bx*(1-perc) - (cx*perc+dx*(1-perc))) + sq(ay*perc+by*(1-perc) - (cy*perc+dy*(1-perc))));
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    cin >> ax >> ay >>  bx >> by >> cx >> cy >> dx >> dy;

    ld l=0, r=1;
    while(l+0.00000002<r) {
        ld p = (l*2+r)/3;
        ld q = (l+r*2)/3;
        if(getDist(p)<=getDist(q)) r=q;
        else l=p;
    }

    ld res=1e10;
    while(l<=r) {
        res = min(res, getDist(l));
        l+=0.00000001;
    }
    cout << setprecision(6) << fixed << res;
}