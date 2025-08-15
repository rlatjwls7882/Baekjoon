#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

struct pos {
    ll x, y, p=0, q=0;
    bool operator<(const pos o) const {
        if(p*o.q!=q*o.p) return p*o.q > q*o.p;
        if(y!=o.y) return y < o.y;
        return x < o.x;
    }
};

ll ccw(pos a, pos b, pos c) {
    pos vec1 = {b.x-a.x, b.y-a.y};
    pos vec2 = {c.x-b.x, c.y-b.y};
    return vec1.x*vec2.y - vec1.y*vec2.x;
}

ll ccw(pos a, pos b, pos c, pos d) {
    pos vec1 = {b.x-a.x, b.y-a.y};
    pos vec2 = {d.x-c.x, d.y-c.y};
    return vec1.x*vec2.y - vec1.y*vec2.x;
}

vector<pos> graham_Scan() {
    int n; cin >> n;
    vector<pos> v(n);
    for(int i=0;i<n;i++) cin >> v[i].x >> v[i].y;
    sort(v.begin(), v.end());

    for(int i=1;i<n;i++) {
        v[i].p = v[i].x - v[0].x;
        v[i].q = v[i].y - v[0].y;
    }
    sort(v.begin(), v.end());

    vector<pos> stk;
    for(int i=0;i<n;i++) {
        while(stk.size()>=2 && ccw(stk[stk.size()-2], stk[stk.size()-1], v[i])<=0) stk.pop_back();
        stk.push_back(v[i]);
    }
    return stk;
}

ll dist(pos a, pos b) {
    return (b.x-a.x)*(b.x-a.x) + (b.y-a.y)*(b.y-a.y);
}

void rotating_Calipers(vector<pos> stk) {
    int n = stk.size();
    pos a, b;
    ll maxDist=0;
    int i=0, j=1;
    while(i<n && j<n) {
        ll curDist = dist(stk[i], stk[j]);
        if(curDist>maxDist) {
            maxDist = curDist;
            a = stk[i];
            b = stk[j];
        }
        if(ccw(stk[i], stk[i+1], stk[j], stk[j+1])>0) j++;
        else i++;
    }
    cout << a.x << ' ' << a.y << ' ' << b.x << ' ' << b.y << '\n';
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        rotating_Calipers(graham_Scan());
    }
}
