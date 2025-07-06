#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int w, h, n; cin >> w >> h >> n;

    int cnt=0, lastX, lastY; cin >> lastX >> lastY;
    while(n-->1) {
        int x, y; cin >> x >> y;

        if(x>lastX && y>lastY || x<lastX && y<lastY) {
            int cross = min(abs(x-lastX), abs(y-lastY));
            cnt += cross + abs(x-lastX)-cross + abs(y-lastY)-cross;
        } else {
            cnt += abs(x-lastX) + abs(y-lastY);
        }
        lastX = x;
        lastY = y;
    }
    cout << cnt;
}