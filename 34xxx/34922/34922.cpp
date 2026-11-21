#include<bits/stdc++.h>
using namespace std;

typedef long double ld;

const ld PI = acos(-1);

int main() {
    cin.tie(0)->sync_with_stdio(0);
    ld w, h, r; cin >> w >> h >> r;
    cout << setprecision(2) << fixed << w*h-r*r*PI/4;
}