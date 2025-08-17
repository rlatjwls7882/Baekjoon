#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

struct point {
    ll x, y, p=0, q=0;
    bool operator<(const point o) const {
        if(p*o.q!=o.p*q) return p*o.q > o.p*q;
        if(x!=o.x) return x < o.x;
        return y < o.y;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    vector<point> v;
    while(n--) {
        ll x, y; char c; cin >> x >> y >> c;
        if(c=='Y') v.push_back({x, y});
    }
    sort(v.begin(), v.end());

    for(int i=1;i<v.size();i++) {
        v[i].p = v[i].x - v[0].x;
        v[i].q = v[i].y - v[0].y;
    }
    sort(v.begin(), v.end());

    int last=v.size()-1; // 원점에서 각도가 같은 마지막 점들 반대로 정렬되는 것 예외처리
    for(int i=v.size()-2;i>=0;i--) {
        if(v[i].p*v[last].q!=v[i].q*v[last].p) {
            reverse(&v[i+1], &v[last+1]);
            break;
        }
    }

    cout << v.size() << '\n';
    for(auto e : v) cout << e.x << ' ' << e.y << '\n';
}