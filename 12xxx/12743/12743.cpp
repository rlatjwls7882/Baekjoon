#include<bits/stdc++.h>
using namespace std;

typedef long double ld;
const int MAX = 200'000;

ld n, x, y;
ld GA[MAX], GB[MAX], W[MAX];

pair<ld, ld> getCost(ld a) {
    ld b=1'000'000;
    for(int i=0;i<n;i++) b = min(b, (W[i]-a*GA[i])/GB[i]);
    return {x*a+y*b, b};
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

    while(l+0.000000000002<r) {
        ld p = (l*2+r)/3;
        ld q = (l+r*2)/3;
        if(getCost(p).first>=getCost(q).first) r=q;
        else l=p;
    }

    ld res=0, L, R;
    while(l<=r) {
        auto c = getCost(l);
        if(c.first>res) {
            res=c.first;
            L=l;
            R=c.second;
        }
        l+=0.000000000001;
    }
    cout << setprecision(2) << fixed << res << '\n' << L << ' ' << R;
}