#include<bits/stdc++.h>
using namespace std;

struct point {
    int x, y;
};

int ccw(point a, point b, point c) {
    point vect1 = {b.x-a.x, b.y-a.y};
    point vect2 = {c.x-a.x, c.y-a.y};

    int ret = vect1.x*vect2.y-vect1.y*vect2.x;
    if(ret>0) return 1;
    if(ret<0) return -1;
    return 0;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    point p1, p2, p3; cin >> p1.x >> p1.y >> p2.x >> p2.y >> p3.x >> p3.y;
    cout << ccw(p1, p2, p3);
}