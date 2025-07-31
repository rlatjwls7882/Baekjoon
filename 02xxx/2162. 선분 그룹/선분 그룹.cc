#include<bits/stdc++.h>
using namespace std;

struct line {
    int x1, y1, x2, y2;
};

int ccw(line a) {
    int ret = a.x1*a.y2 - a.x2*a.y1;
    if(ret>0) return 1;
    if(ret<0) return -1;
    return 0;
}

bool isIntersect(line a, line b) {
    int aToB1 = ccw({a.x2-a.x1, a.y2-a.y1, b.x1-a.x2, b.y1-a.y2});
    int aToB2 = ccw({a.x2-a.x1, a.y2-a.y1, b.x2-a.x2, b.y2-a.y2});
    int bToA1 = ccw({b.x2-b.x1, b.y2-b.y1, a.x1-b.x2, a.y1-b.y2});
    int bToA2 = ccw({b.x2-b.x1, b.y2-b.y1, a.x2-b.x2, a.y2-b.y2});
    return aToB1==0 && aToB2==0 && bToA1==0 && bToA2==0
    && (min(a.x1, a.x2)<=b.x1 && b.x1<=max(a.x1, a.x2) || min(a.x1, a.x2)<=b.x2 && b.x2<=max(a.x1, a.x2) || min(b.x1, b.x2)<=a.x1 && a.x1<=max(b.x1, b.x2) || min(b.x1, b.x2)<=a.x2 && a.x2<=max(b.x1, b.x2))
    && (min(a.y1, a.y2)<=b.y1 && b.y1<=max(a.y1, a.y2) || min(a.y1, a.y2)<=b.y2 && b.y2<=max(a.y1, a.y2) || min(b.y1, b.y2)<=a.y1 && a.y1<=max(b.y1, b.y2) || min(b.y1, b.y2)<=a.y2 && a.y2<=max(b.y1, b.y2))
    || !(aToB1==0 && aToB2==0 && bToA1==0 && bToA2==0) && aToB1 * aToB2 <= 0 && bToA1 * bToA2 <= 0;
}

const int MAX = 3000;

int parent[MAX], _size[MAX];

int _find(int x) {
    if(parent[x]==x) return x;
    return parent[x] = _find(parent[x]);
}

void _union(int x, int y) {
    x = _find(x);
    y = _find(y);
    if(x<y) {
        parent[y]=x;
        _size[x] += _size[y];
    } else if(x>y) {
        parent[x]=y;
        _size[y] += _size[x];
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<line> lines(n);
    for(int i=0;i<n;i++) {
        parent[i]=i;
        _size[i]=1;
        cin >> lines[i].x1 >> lines[i].y1 >> lines[i].x2 >> lines[i].y2;
        for(int j=0;j<i;j++) {
            if(isIntersect(lines[i], lines[j])) {
                _union(i, j);
            }
        }
    }

    int cnt=0, maxSize=1;
    for(int i=0;i<n;i++) {
        if(i==parent[i]) cnt++;
        maxSize = max(maxSize, _size[i]);
    }
    cout << cnt << '\n' << maxSize;
}