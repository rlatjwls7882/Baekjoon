#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int y1, m1, d1, y2, m2, d2; double t1, p1, t2, p2; cin >> y1 >> m1 >> d1 >> t1 >> p1 >> y2 >> m2 >> d2 >> t2 >> p2;
    int move = y2*360+m2*30+d2 - (y1*360+m1*30+d1);
    int y = y1-move/360;
    int m = m1-move%360/30;
    int d = d1-move%30;
    if(d<=0) {
        int cnt = -d/30+1;
        d += cnt*30;
        m -= cnt;
    }
    if(d>=31) {
        int cnt = (d-1)/30;
        d -= cnt*30;
        m += cnt;
    }
    if(m<=0) {
        int cnt = -m/12+1;
        m += cnt*12;
        y -= cnt;
    }
    if(m>=13) {
        int cnt = (m-1)/12;
        m -= cnt*12;
        y += cnt;
    }
    cout << setprecision(3) << fixed << y << ' ' << m << ' ' << d << ' ' << 2*t1-t2 << ' ' << 2*p1-p2;
}