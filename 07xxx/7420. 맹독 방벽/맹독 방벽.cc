#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef vector<int> vi;
typedef vector<vi> vvi;
typedef vector<vvi> vvvi;
typedef vector<ll> vll;
typedef vector<vll> vvll;
typedef pair<int, int> pi;
typedef pair<ll, ll> pll;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const double PI = atan(1)*4;

int n, l;

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
    pos vec2 = {c.x-a.x, c.y-a.y};
    return vec1.x*vec2.y - vec1.y*vec2.x;
}

ll getRes(vector<pos> stk) {
    double ret = l*2*PI;
    for(int i=0;i<stk.size();i++) {
        ret += sqrtl(pow(stk[i].x-stk[(i+1)%stk.size()].x, 2)+pow(stk[i].y-stk[(i+1)%stk.size()].y, 2));
    }
    return round(ret);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> l;
    vector<pos> v(n);
    for(int i=0;i<n;i++) cin >> v[i].x >> v[i].y;
    sort(v.begin(), v.end());
    for(int i=0;i<n;i++) {
        v[i].p = v[i].x - v[0].x;
        v[i].q = v[i].y - v[0].y;
    }
    sort(v.begin(), v.end());

    vector<pos> stk;
    for(int i=0;i<n;i++) {
        while(stk.size()>=2 && ccw(stk[stk.size()-2], stk[stk.size()-1], v[i])<=0) stk.pop_back();
        stk.push_back(v[i]);
    }
    cout << getRes(stk);
}