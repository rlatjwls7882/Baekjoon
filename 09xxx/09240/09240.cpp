#include<bits/stdc++.h>
using namespace std;

struct point {
    int x, y, p=0, q=0;
    bool operator<(const point o) const {
        if(p*o.q!=q*o.p) return p*o.q > q*o.p;
        if(y!=o.y) return y < o.y;
        return x < o.x;
    }
};

int ccw(point a, point b, point c) {
    point vec1 = {b.x-a.x, b.y-a.y};
    point vec2 = {c.x-a.x, c.y-a.y};
    return vec1.x*vec2.y - vec1.y*vec2.x;
}

int ccw(point a, point b, point c, point d) {
    point vec1 = {b.x-a.x, b.y-a.y};
    point vec2 = {d.x-c.x, d.y-c.y};
    return vec1.x*vec2.y - vec1.y*vec2.x;
}

vector<point> graham_scan() {
    int c; cin >> c;
    vector<point> v(c);
    for(int i=0;i<c;i++) cin >> v[i].x >> v[i].y;
    sort(v.begin(), v.end());

    for(int i=1;i<c;i++) {
        v[i].p = v[i].x-v[0].x;
        v[i].q = v[i].y-v[0].y;
    }
    sort(v.begin(), v.end());

    vector<point> stk;
    for(int i=0;i<c;i++) {
        while(stk.size()>=2 && ccw(stk[stk.size()-2], stk[stk.size()-1], v[i])<=0) stk.pop_back();
        stk.push_back(v[i]);
    }
    return stk;
}

int dist(point a, point b) {
    return (a.x-b.x)*(a.x-b.x) + (a.y-b.y)*(a.y-b.y);
}

void rotating_calipers(vector<point> hull) {
    int n = hull.size();
    int maxDist=0, i=0, j=1;
    while(i<n && j<n) {
        maxDist = max(maxDist, dist(hull[i], hull[j]));
        if(ccw(hull[i], hull[(i+1)%n], hull[j], hull[(j+1)%n])>0) j++;
        else i++;
    }
    cout << setprecision(6) << fixed << sqrt(maxDist);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    rotating_calipers(graham_scan());
}