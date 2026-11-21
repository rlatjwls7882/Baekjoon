#include<bits/stdc++.h>
using namespace std;

const long double PI = atan(1)*4;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long double d, h; cin >> d >> h;
    cout << setprecision(6) << fixed << (d+10)*PI*h+(d/2+5)*(d/2+5)*PI;
}