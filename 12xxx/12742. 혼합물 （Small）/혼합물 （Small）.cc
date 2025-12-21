#include<bits/stdc++.h>
using namespace std;

typedef long double ld;
const int MAX = 200;

ld n, x, y;
ld GA[MAX], GB[MAX], W[MAX];

pair<ld, ld> getCost(ld a) {
    ld b=1'000'000;
    for(int i=0;i<n;i++) {
        b = min(b, (W[i]-a*GA[i])/GB[i]);
        if(b<0) return {-1, -1};
    }
    return {a*x+b*y, b};
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    cin >> n >> x >> y;
    for(int i=0;i<n;i++) cin >> GA[i];
    for(int i=0;i<n;i++) cin >> GB[i];

    ld l=0, r=1'000'000;
    for(int i=0;i<n;i++) {
        cin >> W[i];
        r = min(r, W[i]/GA[i]);
    }

    while(l+0.00000000002<r) {
        ld p = (l*2+r)/3;
        ld q = (l+r*2)/3;
        if(getCost(p).first>=getCost(q).first) r=q;
        else l=p;
    }

    ld mx=0, L, R;
    while(l<=r) {
        auto e = getCost(l);
        if(e.first>mx) {
            mx=e.first;
            L=l;
            R=e.second;
        }
        l+=0.00000000001;
    }
    cout << setprecision(2) << fixed << mx << '\n' << L << ' ' << R;
}