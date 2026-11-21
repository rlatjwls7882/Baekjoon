#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

struct pos {
    ll x, y, p=0, q=0;
    bool operator<(const pos o) const {
        if(p*o.q!=q*o.p) return p*o.q > q*o.p;
        if(y!=o.y) return y<o.y;
        return x<o.x;
    }
};

ll n;
pos P;

ll ccw(pos a, pos b, pos c) {
    pos vec1 = {b.x-a.x, b.y-a.y};
    pos vec2 = {c.x-a.x, c.y-a.y};
    return vec1.x*vec2.y - vec1.y*vec2.x;
}

bool isInside(vector<int> stk, vector<pos> v) {
    if(stk.size()<=2) return false;
    for(int i=0;i<stk.size();i++) {
        if(ccw(v[stk[i]], v[stk[(i+1)%stk.size()]], P)<=0) return false;
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> P.x >> P.y;
    vector<pos> v(n);
    for(int i=0;i<n;i++) cin >> v[i].x >> v[i].y;

    int cnt=0;
    while(true) {
        for(int i=0;i<n;i++) v[i].p = v[i].q = 0;
        sort(v.begin(), v.end());
        for(int i=1;i<n;i++) {
            v[i].p = v[0].x - v[i].x;
            v[i].q = v[0].y - v[i].y;
        }
        sort(v.begin(), v.end());

        vector<int> stk;
        for(int i=0;i<n;i++) {
            if(stk.size()<2) {
                stk.push_back(i);
            } else {
                while(stk.size()>=2 && ccw(v[stk[stk.size()-2]], v[stk[stk.size()-1]], v[i])<=0) {
                    stk.pop_back();
                }
                stk.push_back(i);
            }
        }
        if(!isInside(stk, v)) break;

        cnt++;
        for(int i=stk.size()-1;i>=0;i--) {
            v.erase(v.begin()+stk[i]);
        }
        n = v.size();
    }
    cout << cnt;
}