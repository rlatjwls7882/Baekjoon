#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int x, y; cin >> x >> y;

        int lastX = 1, lastY = 1;
        while(true) {
            int nextX = lastX+lastY;
            int nextY = lastX;
            if(nextX>x || nextY>y) break;
            lastX = nextX;
            lastY = nextY;
        }
        cout << lastX << ' ' << lastY << '\n';
    }
}