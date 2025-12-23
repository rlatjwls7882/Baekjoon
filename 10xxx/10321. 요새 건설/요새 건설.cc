#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

struct point {
    ll x, y;
    ll p=0, q=0;
    bool operator<(const point b) const {
        if(p*b.q!=b.p*q) return p*b.q>b.p*q;
        if(y!=b.y) return y<b.y;
        return x<b.x;
    }
};

ll ccw(point a, point b, point c) {
    point v1 = {b.x-a.x, b.y-a.y};
    point v2 = {c.x-a.x, c.y-a.y};
    return v1.x*v2.y-v1.y*v2.x;
}

vector<point> graham_scan(int n) {
    vector<point> v(n);
    for(int i=0;i<n;i++) cin >> v[i].x >> v[i].y;
    sort(v.begin(), v.end());
    for(int i=0;i<n;i++) {
        v[i].p = v[i].x-v[0].x;
        v[i].q = v[i].y-v[0].y;
    }
    sort(v.begin(), v.end());

    vector<point> stk;
    for(point cur:v) {
        while(stk.size()>=2 && ccw(stk[stk.size()-2], stk[stk.size()-1], cur)<=0) stk.pop_back();
        stk.push_back(cur);
    }
    return stk;
}

ll getTriArea(point a, point b, point c) {
    return abs(a.x*b.y+b.x*c.y+c.x*a.y -a.x*c.y-b.x*a.y-c.x*b.y);
}

ll ternary_search(vector<point>& hull, int i, int j) {
    int l=i+1, r=j-1;
    while(l+2<r) {
        int p = (l*2+r)/3;
        int q = (l+r*2)/3;
        if(getTriArea(hull[i], hull[j], hull[p])>=getTriArea(hull[i], hull[j], hull[q])) r=q;
        else l=p;
    }
    ll ret1=0;
    while(l<=r) ret1 = max(ret1, getTriArea(hull[i], hull[j], hull[l++]));

    l=j+1, r=hull.size()-1;
    while(l+2<r) {
        int p = (l*2+r)/3;
        int q = (l+r*2)/3;
        if(getTriArea(hull[i], hull[j], hull[p])>=getTriArea(hull[i], hull[j], hull[q])) r=q;
        else l=p;
    }
    ll ret2=0;
    while(l<=r) ret2 = max(ret2, getTriArea(hull[i], hull[j], hull[l++]));
    return ret1+ret2;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int t; cin >> t;
    while(t--) {
        int n; cin >> n;
        vector<point> hull = graham_scan(n);
        n = hull.size();

        ll res=0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                res = max(res, ternary_search(hull, i, j));
            }
        }
        cout << res/2 << (res%2 ? ".5\n":"\n");
    }
}