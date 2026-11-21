#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int xs, ys; cin >> xs >> ys;
    int xe, ye, dx, dy; cin >> xe >> ye >> dx >> dy;

    int gcdVal = gcd(dx, dy);
    dx /= gcdVal;
    dy /= gcdVal;

    int diff = pow(xe-xs, 2)+pow(ye-ys, 2);
    while(true) {
        int nextDiff = pow(xe+dx-xs, 2)+pow(ye+dy-ys, 2);
        if(nextDiff<diff) {
            diff = nextDiff;
            xe += dx;
            ye += dy;
        } else {
            cout << xe << ' ' << ye;
            break;
        }
    }
}