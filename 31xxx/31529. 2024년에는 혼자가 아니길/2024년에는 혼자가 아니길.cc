#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int x, y; cin >> x >> y;

    // x = a² + b² + c² + d²
    // y = (a+b)² + (c+d)²
    // y - x = 2ab + 2cd
    // (NM)² = ((b-a)/2)² + ((d-c)/2)² = (2x-y)/4
    int res = (2*x-y)*506;
    cout << (x>y || res<0 ? -1 : res);
}