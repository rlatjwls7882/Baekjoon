#include<bits/stdc++.h>
using namespace std;

struct ConvexHull {
    using ll = long long;
    struct point {
        ll x, y, type, p=0, q=0;
        bool operator<(const point o) const {
            if(p*o.q!=o.p*q) return p*o.q>o.p*q;
            if(p*p+q*q!=o.p*o.p+o.q*o.q) return p*p+q*q<o.p*o.p+o.q*o.q;
            if(y!=o.y) return y<o.y;
            return x<o.x;
        }
        bool operator==(const point o) const {
            return x==o.x && y==o.y && type==o.type;
        }
    };
    vector<point> hull;

    inline ll ccw(point a, point b, point c) {
        point v1 = {b.x-a.x, b.y-a.y};
        point v2 = {c.x-a.x, c.y-a.y};
        return v1.x*v2.y-v2.x*v1.y;
    }

    inline ConvexHull(vector<point> v) {
        sort(v.begin(), v.end());
        v.erase(unique(v.begin(), v.end()), v.end());

        for(int i=1;i<v.size();i++) {
            v[i].p = v[i].x-v[0].x;
            v[i].q = v[i].y-v[0].y;
        }
        sort(v.begin(), v.end());

        int revIdx=v.size()-1;
        while(revIdx>1 && ccw(v.front(), v[revIdx-1], v[revIdx])==0) revIdx--;
        reverse(v.begin()+revIdx, v.end());

        for(point cur:v) {
            while(hull.size()>=2 && ccw(hull[hull.size()-2], hull[hull.size()-1], cur)<0) hull.pop_back();
            hull.push_back(cur);
        }
    }
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    vector<ConvexHull::point> v;
    int n; cin >> n;
    while(n--) {
        int x, y; cin >> x >> y;
        v.push_back({x, y, 0});
    }

    int m; cin >> m;
    while(m--) {
        int x, y; cin >> x >> y;
        v.push_back({x, y, 1});
    }

    int cnt=0;
    ConvexHull ch(v);
    auto &hull = ch.hull;
    for(int i=0;i<hull.size();i++) cnt += !hull[i].type && !hull[(i+1)%hull.size()].type;
    cout << cnt;
}