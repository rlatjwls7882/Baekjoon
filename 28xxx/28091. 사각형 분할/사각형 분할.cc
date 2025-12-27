#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

struct point {
    ll x, y, p=0, q=0;
    bool operator<(const point e) const {
        if(p*e.q!=e.p*q) return p*e.q>e.p*q;
        if(y!=e.y) return y<e.y;
        return x<e.x;
    }
};

int n;
vector<point> hull;

ll ccw(point a, point b, point c) {
    point v1 = {b.x-a.x, b.y-a.y};
    point v2 = {c.x-a.x, c.y-a.y};
    return v1.x*v2.y-v2.x*v1.y;
}

void graham_scan() {
    int m; cin >> n >> m;
    vector<point> v;
    v.push_back({-m, 0});
    v.push_back({m, 0});
    v.push_back({0, m});
    v.push_back({0, -m});
    while(n--) {
        ll x, y; cin >> x >> y;
        v.push_back({x, y});
    }
    n=v.size();
    sort(v.begin(), v.end());
    for(int i=1;i<n;i++) {
        v[i].p=v[i].x-v[0].x;
        v[i].q=v[i].y-v[0].y;
    }
    sort(v.begin(), v.end());

    for(point cur:v) {
        while(hull.size()>=2 && ccw(hull[hull.size()-2], hull[hull.size()-1], cur)<=0) hull.pop_back();
        hull.push_back(cur);
    }
    n=hull.size();
}

ll getArea(point a, point b, point c) {
    return abs(a.x*b.y+b.x*c.y+c.x*a.y-a.x*c.y-b.x*a.y-c.x*b.y);
}

ll ternary_search(int i, int j) {
    int l=i+1, r=j-1;
    while(l+2<r) {
        int p = (l*2+r)/3;
        int q = (l+r*2)/3;
        if(getArea(hull[i], hull[j], hull[p])>=getArea(hull[i], hull[j], hull[q])) r=q;
        else l=p;
    }
    ll ret1=0;
    while(l<=r) ret1 = max(ret1, getArea(hull[i], hull[j], hull[l++]));

    l=j+1, r=n-1;
    while(l+2<r) {
        int p = (l*2+r)/3;
        int q = (l+r*2)/3;
        if(getArea(hull[i], hull[j], hull[p])>=getArea(hull[i], hull[j], hull[q])) r=q;
        else l=p;
    }
    ll ret2=0;
    while(l<=r) ret2 = max(ret2, getArea(hull[i], hull[j], hull[l++]));

    l=0, r=i-1;
    while(l+2<r) {
        int p = (l*2+r)/3;
        int q = (l+r*2)/3;
        if(getArea(hull[i], hull[j], hull[p])>=getArea(hull[i], hull[j], hull[q])) r=q;
        else l=p;
    }
    while(l<=r) ret2 = max(ret2, getArea(hull[i], hull[j], hull[l++]));
    return ret1+ret2;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    graham_scan();

    ll res=0;
    for(int i=0;i<n;i++) {
        for(int j=i+1;j<n;j++) {
            res = max(res, ternary_search(i, j));
        }
    }
    cout << setprecision(6) << fixed << (long double)res*res/16;
}