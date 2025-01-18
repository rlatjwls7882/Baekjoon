#include<bits/stdc++.h>
using namespace std;

struct v {
    int x, y;
};

int cross(v v1, v v2) {
    return v1.x*v2.y-v2.x*v1.y;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int x1, y1, x2, y2, x3, y3; cin >> x1 >> y1 >> x2 >> y2 >> x3 >> y3;
    int val = cross({x2-x1, y2-y1}, {x3-x2, y3-y2});
    if(val==0) cout << 0;
    else if(val>0) cout << 1;
    else cout << -1;
}