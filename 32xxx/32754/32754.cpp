#include<bits/stdc++.h>
using namespace std;

typedef long double ld;

struct point {
    ld x, y;
};

ld sq(ld x) {
    return x*x;
}

ld dist(point a, point b) {
    return sqrt(sq(a.x-b.x)+sq(a.y-b.y));
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, r; cin >> n >> r;

    int cnt=0;
    while(n--) {
        point p1, p2, p3, p4; cin >> p1.x >> p1.y >> p2.x >> p2.y >> p3.x >> p3.y >> p4.x >> p4.y;
        point p = {(p1.x+p2.x+p3.x+p4.x)/4, (p1.y+p2.y+p3.y+p4.y)/4};

        if(dist({0, 0}, p)-dist(p, p1)<=r) cnt++;
    }
    cout << cnt;
}