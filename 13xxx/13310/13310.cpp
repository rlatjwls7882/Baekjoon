#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

struct pos {
    ll x, y, dx, dy;
};

struct point {
    ll x, y, p=0, q=0;
    bool operator<(const point e) const {
        if(p*e.q!=e.p*q) return p*e.q>e.p*q;
        if(y!=e.y) return y<e.y;
        return x<e.x;
    }
};

int n;
pos p[30'000];

ll sq(ll x) {
    return x*x;
}

ll dist(point a, point b) {
    return sq(a.x-b.x)+sq(a.y-b.y);
}

ll ccw(point a, point b, point c) {
    point v1 = {b.x-a.x, b.y-a.y};
    point v2 = {c.x-a.x, c.y-a.y};
    return v1.x*v2.y-v2.x*v1.y;
}

ll ccw(point a, point b, point c, point d) {
    point v1 = {b.x-a.x, b.y-a.y};
    point v2 = {d.x-c.x, d.y-c.y};
    return v1.x*v2.y-v2.x*v1.y;
}

ll f(ll t) {
    vector<point> v;
    for(int i=0;i<n;i++) v.push_back({p[i].x+p[i].dx*t, p[i].y+p[i].dy*t});
    sort(v.begin(), v.end());
    for(int i=1;i<n;i++) {
        v[i].p = v[i].x-v[0].x;
        v[i].q = v[i].y-v[0].y;
    }
    sort(v.begin(), v.end());

    vector<point> hull;
    for(auto e:v) {
        while(hull.size()>=2 && ccw(hull[hull.size()-2], hull[hull.size()-1], e)<=0) hull.pop_back();
        hull.push_back(e);
    }

    ll sz=hull.size();
    ll maxDist=0, i=0, j=1;
    while(i<sz && j<sz) {
        maxDist = max(maxDist, dist(hull[i], hull[j]));
        if(ccw(hull[i], hull[(i+1)%sz], hull[j], hull[(j+1)%sz])>0) j++;
        else i++;
    }
    return maxDist;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int t; cin >> n >> t;
    for(int i=0;i<n;i++) cin >> p[i].x >> p[i].y >> p[i].dx >> p[i].dy;

    ll l=0, r=t;
    while(l+2<r) {
        ll p = (l*2+r)/3;
        ll q = (l+2*r)/3;
        if(f(p)<=f(q)) r=q;
        else l=p;
    }

    ll maxDist=LONG_LONG_MAX, res=0;
    while(l<=r) {
        ll ret = f(l);
        if(ret<maxDist) {
            maxDist=ret;
            res=l;
        }
        l++;
    }
    cout << res << '\n' << maxDist;
}