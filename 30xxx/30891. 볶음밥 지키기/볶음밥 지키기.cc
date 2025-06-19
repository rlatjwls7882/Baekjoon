#include<bits/stdc++.h>
using namespace std;

struct pos {
    int x, y;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, r; cin >> n >> r;
    vector<pos> v(n);
    for(int i=0;i<n;i++) cin >> v[i].x >> v[i].y;

    int maxCnt=-1, maxX, maxY;
    for(int x=-100;x<=100;x++) {
        for(int y=-100;y<=100;y++) {
            int cnt=0;
            for(pos p:v) {
                if(pow(p.x-x, 2) + pow(p.y-y, 2)<=r*r) cnt++;
            }
            if(cnt>maxCnt) {
                maxCnt = cnt;
                maxX = x;
                maxY = y;
            }
        }
    }
    cout << maxX << ' ' << maxY;
}