#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    int sx=INT_MAX, sy=INT_MAX, ex=INT_MIN, ey=INT_MIN;
    while(N-->0) {
        int x1, y1, x2, y2; cin >> x1 >> y1 >> x2 >> y2;
        sx = min(sx, x1);
        sy = min(sy, y1);
        ex = max(ex, x2);
        ey = max(ey, y2);
        cout << 2*(ex-sx+ey-sy) << '\n';
    }
}