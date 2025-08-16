#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

struct point {
    ll x, y;
};

ll ccw(point a, point b, point c) {
    point vec1 = {b.x-a.x, b.y-a.y};
    point vec2 = {c.x-a.x, c.y-a.y};
    return vec1.x*vec2.y - vec1.y*vec2.x;
}

bool isInside(vector<point> &hull, point p) {
    if(ccw(hull[0], hull[1], p)<0) return false;
    if(ccw(hull[0], hull[hull.size()-1], p)>0) return false;

    int left=1, right=hull.size()-1;
    while(left+1<right) {
        int mid = (left+right)/2;
        if(ccw(hull[0], hull[mid], p)>0) left=mid;
        else right=mid;
    }
    return ccw(hull[left], p, hull[right])<0;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, k; cin >> n >> m >> k;
    vector<point> A(n), B(m);
    for(int i=0;i<n;i++) cin >> A[i].x >> A[i].y;
    for(int i=0;i<m;i++) cin >> B[i].x >> B[i].y;

    int cnt=0;
    while(k--) {
        point p; cin >> p.x >> p.y;
        if(!isInside(A, p) || isInside(B, p)) cnt++;
    }
    if(!cnt) cout << "YES";
    else cout << cnt;
}