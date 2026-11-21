#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

struct pos {
    ll x, y, p=0, q=0;
    bool operator<(const pos o) {
        if(p*o.q!=q*o.p) return p*o.q > q*o.p;
        if(y!=o.y) return y < o.y;
        return x < o.x;
    }
};

int ccw(pos a, pos b, pos c) {
    pos vec1 = {b.x-a.x, b.y-a.y};
    pos vec2 = {c.x-a.x, c.y-a.y};
    ll ret = vec1.x*vec2.y - vec1.y*vec2.x;
    if(ret>0) return 1;
    if(ret<0) return -1;
    return 0;
}

bool isInside(vector<pos> stk, pos point) {
    if(stk.size()<=2) return false;
    for(int i=0;i<stk.size();i++) {
        if(ccw(stk[i], stk[(i+1)%stk.size()], point)<=0) return false;
    }
    return true;
}

bool isIntersect(pos a, pos b, pos c, pos d) {
    int aToB1 = ccw(a, b, c);
    int aToB2 = ccw(a, b, d);
    int bToA1 = ccw(c, d, a);
    int bToA2 = ccw(c, d, b);

    if(aToB1*aToB2==0 && bToA1*bToA2==0) {
        return (min(a.x, b.x)<=c.x && c.x<=max(a.x, b.x) || min(a.x, b.x)<=d.x && d.x<=max(a.x, b.x) || min(c.x, d.x)<=a.x && a.x<=max(c.x, d.x) || min(c.x, d.x)<=b.x && b.x<=max(c.x, d.x))
        && (min(a.y, b.y)<=c.y && c.y<=max(a.y, b.y) || min(a.y, b.y)<=d.y && d.y<=max(a.y, b.y) || min(c.y, d.y)<=a.y && a.y<=max(c.y, d.y) || min(c.y, d.y)<=b.y && b.y<=max(c.y, d.y));
    }
    return aToB1*aToB2<=0 && bToA1*bToA2<=0;
}

bool chk(vector<pos> whiteStk, vector<pos> blackStk) {
    int n = whiteStk.size();
    int m = blackStk.size();

    // 검은 도형 내에 하얀 점
    for(pos point : blackStk) {
        if(isInside(whiteStk, point)) return false;
    }

    // 하얀 도형 내에 검은 점
    for(pos point : whiteStk) {
        if(isInside(blackStk, point)) return false;
    }

    // 두 선분의 충돌
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            if(isIntersect(whiteStk[i], whiteStk[(i+1)%n], blackStk[j], blackStk[(j+1)%m])) return false;
        }
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;

    while(t--) {
        int n, m; cin >> n >> m;
        vector<pos> white(n), black(m);
        for(int i=0;i<n;i++) cin >> white[i].x >> white[i].y;
        for(int i=0;i<m;i++) cin >> black[i].x >> black[i].y;

        sort(white.begin(), white.end());
        for(int i=0;i<n;i++) {
            white[i].p = white[i].x - white[0].x;
            white[i].q = white[i].y - white[0].y;
        }
        sort(white.begin(), white.end());

        vector<pos> whiteStk;
        for(int i=0;i<n;i++) {
            while(whiteStk.size()>=2 && ccw(whiteStk[whiteStk.size()-2], whiteStk[whiteStk.size()-1], white[i])<=0) whiteStk.pop_back();
            whiteStk.push_back(white[i]);
        }

        sort(black.begin(), black.end());
        for(int i=0;i<m;i++) {
            black[i].p = black[i].x - black[0].x;
            black[i].q = black[i].y - black[0].y;
        }
        sort(black.begin(), black.end());

        vector<pos> blackStk;
        for(int i=0;i<m;i++) {
            while(blackStk.size()>=2 && ccw(blackStk[blackStk.size()-2], blackStk[blackStk.size()-1], black[i])<=0) blackStk.pop_back();
            blackStk.push_back(black[i]);
        }
        cout << (chk(whiteStk, blackStk) ? "YES\n" : "NO\n");
    }
}