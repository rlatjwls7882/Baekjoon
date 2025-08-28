#include<bits/stdc++.h>
using namespace std;

struct line {
    long long x1, y1, x2, y2;
};

int ccw(line a) {
    long long ret = a.x1*a.y2 - a.x2*a.y1;
    if(ret>0) return 1;
    if(ret<0) return -1;
    return 0;
}

bool isIntersect(line a, line b) {
    int aToB1 = ccw({a.x2-a.x1, a.y2-a.y1, b.x1-a.x1, b.y1-a.y1});
    int aToB2 = ccw({a.x2-a.x1, a.y2-a.y1, b.x2-a.x1, b.y2-a.y1});
    int bToA1 = ccw({b.x2-b.x1, b.y2-b.y1, a.x1-b.x1, a.y1-b.y1});
    int bToA2 = ccw({b.x2-b.x1, b.y2-b.y1, a.x2-b.x1, a.y2-b.y1});

    if(aToB1 * aToB2==0 && bToA1 * bToA2==0) { // 두 선분이 일렬로 위치한 경우
        return (min(a.x1, a.x2)<=b.x1 && b.x1<=max(a.x1, a.x2) || min(a.x1, a.x2)<=b.x2 && b.x2<=max(a.x1, a.x2) || min(b.x1, b.x2)<=a.x1 && a.x1<=max(b.x1, b.x2) || min(b.x1, b.x2)<=a.x2 && a.x2<=max(b.x1, b.x2))
        && (min(a.y1, a.y2)<=b.y1 && b.y1<=max(a.y1, a.y2) || min(a.y1, a.y2)<=b.y2 && b.y2<=max(a.y1, a.y2) || min(b.y1, b.y2)<=a.y1 && a.y1<=max(b.y1, b.y2) || min(b.y1, b.y2)<=a.y2 && a.y2<=max(b.y1, b.y2));
    }
    return aToB1 * aToB2 <= 0 && bToA1 * bToA2 <= 0;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    line a, b;
    cin >> a.x1 >> a.y1 >> a.x2 >> a.y2 >> b.x1 >> b.y1 >> b.x2 >> b.y2;
    cout << isIntersect(a, b);
}