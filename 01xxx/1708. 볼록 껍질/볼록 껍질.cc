#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

struct pos {
    ll x, y;
    ll p=0, q=0; // 기준점으로부터의 상대 위치
    bool operator<(const pos b) const {
        if(p*b.q!=q*b.p) return p*b.q > q*b.p;
        if(y!=b.y) return y < b.y;
        return x < b.x;
    }
};

ll ccw(pos a, pos b, pos c) {
    pos vec1 = {b.x-a.x, b.y-a.y};
    pos vec2 = {c.x-b.x, c.y-b.y};
    return vec1.x*vec2.y - vec1.y*vec2.x;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    vector<pos> v(n);
    for(int i=0;i<n;i++) cin >> v[i].x >> v[i].y;
    sort(v.begin(), v.end());

    // y가 가장 작고 x가 가장 작은 점을 기준점으로 삼고, 시계 반대 방향으로 정렬
    for(int i=0;i<n;i++) {
        v[i].p = v[i].x-v[0].x;
        v[i].q = v[i].y-v[0].y;
    }
    sort(v.begin(), v.end());

    stack<pos> stk;
    for(int i=0;i<n;i++) {
        if(stk.size()<2) {
            stk.push(v[i]);
        } else {
            while(stk.size()>=2) {
                pos top1 = stk.top(); stk.pop();
                pos top2 = stk.top();
                if(ccw(top2, top1, v[i])>0) {
                    stk.push(top1);
                    break;
                }
            }
            stk.push(v[i]);
        }
    }
    cout << stk.size();
}