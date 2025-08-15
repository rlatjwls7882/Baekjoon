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

ll ccw(pos a, pos b, pos c, pos d) {
    pos vec1 = {b.x-a.x, b.y-a.y};
    pos vec2 = {d.x-c.x, d.y-c.y};
    return vec1.x*vec2.y - vec1.y*vec2.x;
}

vector<pos> grahamScan() {
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
        while(stk.size()>=2 && ccw(stk[stk.size()-2], stk[stk.size()-1], stk[stk.size()-1], v[i])<=0) stk.pop_back();
        stk.push_back(v[i]); 
    }
    return stk;
}

ll dist(pos a, pos b) {
    return (b.x-a.x)*(b.x-a.x) + (b.y-a.y)*(b.y-a.y);
}

void rotateCalipers(vector<pos> stk) {
    int n = stk.size();
    pos a, b;
    ll curDist=0;
    int left=0, right=1;
    while(left<n) {
        while(ccw(stk[left], stk[(left+1)%n], stk[right], stk[(right+1)%n])>0) {
            ll nextDist = dist(stk[left], stk[right]);
            if(nextDist>curDist) {
                curDist = nextDist;
                a = stk[left];
                b = stk[right];
            }
            right = (right+1)%n;
        }
        while(ccw(stk[left], stk[(left+1)%n], stk[right], stk[(right+1)%n])<0) {
            ll nextDist = dist(stk[left], stk[right]);
            if(nextDist>curDist) {
                curDist = nextDist;
                a = stk[left];
                b = stk[right];
            }
            right = (right+n-1)%n;
        }
        ll nextDist = dist(stk[left], stk[right]);
        if(nextDist>curDist) {
            curDist = nextDist;
            a = stk[left];
            b = stk[right];
        }
        left++;
    }
    cout << a.x << ' ' << a.y << ' ' << b.x << ' ' << b.y << '\n';
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        rotateCalipers(grahamScan());
    }
}