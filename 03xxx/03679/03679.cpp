#include<bits/stdc++.h>
using namespace std;

struct point {
    int x, y, idx, p=0, q=0;
    bool operator<(const point o) const {
        if(p*o.q!=q*o.p) return p*o.q > q*o.p;
        if(y!=o.y) return y < o.y;
        return x < o.x;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int c; cin >> c;
    while(c--) {
        int n; cin >> n;
        vector<point> v(n);
        for(int i=0;i<n;i++) {
            cin >> v[i].x >> v[i].y;
            v[i].idx = i;
        }
        sort(v.begin(), v.end());

        for(int i=1;i<n;i++) {
            v[i].p = v[i].x-v[0].x;
            v[i].q = v[i].y-v[0].y;
        }
        sort(v.begin(), v.end());

        /** 
         * 시게 반대 방향으로 도형을 연결하는 경우
         * y 좌표가 큰 점에서 작은 점으로 연결할 때
         * 세 점 이상이 기준점에서 일직선으로 연결되는 경우 거꾸로 연결됨 (기준점에서의 벡터가 똑같기에 좌표로 오름차순으로 정렬됨)
         */
        for(int i=n-2;i>=0;i--) {
            if(v[i].p*v[n-1].q!=v[i].q*v[n-1].p) {
                reverse(&v[i+1], &v[n]);
                break;
            }
        }

        for(int i=0;i<n;i++) cout << v[i].idx << ' ';
        cout << '\n';
    }
}