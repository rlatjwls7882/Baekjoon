#include<bits/stdc++.h>
using namespace std;

struct vec {
    long long x, y;
};

int cross(vec v1, vec v2) {
    long long ret = v1.x*v2.y-v2.x*v1.y;
    if(ret<0) return -1;
    if(ret>0) return 1;
    return 0;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long long x1, y1, x2, y2, x3, y3, x4, y4; cin >> x1 >> y1 >> x2 >> y2 >> x3 >> y3 >> x4 >> y4;
    int a = cross({x2-x1, y2-y1}, {x3-x2, y3-y2});
    int b = cross({x2-x1, y2-y1}, {x4-x2, y4-y2});
    int c = cross({x4-x3, y4-y3}, {x1-x4, y1-y4});
    int d = cross({x4-x3, y4-y3}, {x2-x4, y2-y4});
    cout << (a==0 && b==0 && c==0 && d==0 && (min(x3, x4)<=x1 && x1<=max(x3, x4) || min(x3, x4)<=x2 && x2<=max(x3, x4) || min(x1, x2)<=x3 && x3<=max(x1, x2) || min(x1, x2)<=x4 && x4<=max(x1, x2)) && (min(y3, y4)<=y1 && y1<=max(y3, y4) || min(y3, y4)<=y2 && y2<=max(y3, y4) || min(y1, y2)<=y3 && y3<=max(y1, y2) || min(y1, y2)<=y4 && y4<=max(y1, y2)) || !(a==0 && b==0 && c==0 && d==0) && a*b<=0 && c*d<=0);
}