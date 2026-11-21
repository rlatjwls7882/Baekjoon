#include<bits/stdc++.h>
using namespace std;

struct point {
    int x, y, p=0, q=0;
    bool operator<(const point b) const {
        if(p*b.q!=b.p*q) return p*b.q>b.p*q;
        if(y!=b.y) return y<b.y;
        return x<b.x;
    }
};

int ccw(point a, point b, point c) {
    point v1 = {b.x-a.x, b.y-a.y};
    point v2 = {c.x-a.x, c.y-a.y};
    return v1.x*v2.y-v2.x*v1.y;
}

int ccw(point a, point b, point c, point d) {
    point v1 = {b.x-a.x, b.y-a.y};
    point v2 = {d.x-c.x, d.y-c.y};
    return v1.x*v2.y-v2.x*v1.y;
}

int dist(point a, point b) {
    return (b.x-a.x)*(b.x-a.x)+(b.y-a.y)*(b.y-a.y);
}

int solve() {
    int n; cin >> n;
    vector<point> v(n);
    for(int i=0;i<n;i++) cin >> v[i].x >> v[i].y;
    sort(v.begin(), v.end());

    for(int i=1;i<n;i++) {
        v[i].p = v[i].x-v[0].x;
        v[i].q = v[i].y-v[0].y;
    }
    sort(v.begin(), v.end());

    vector<point> hull;
    for(point cur:v) {
        while(hull.size()>=2 && ccw(hull[hull.size()-2], hull[hull.size()-1], cur)<=0) hull.pop_back();
        hull.push_back(cur);
    }
    n=hull.size();

    int ret=0, l=0, r=1;
    while(l<n && r<n) {
        ret = max(ret, dist(hull[l], hull[r]));
        if(ccw(hull[l], hull[(l+1)%n], hull[r], hull[(r+1)%n])>0) r++;
        else l++;
    }
    return ret;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    cout << solve();
}