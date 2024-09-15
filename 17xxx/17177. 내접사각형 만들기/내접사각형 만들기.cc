#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    double a, b, c; cin >> a >> b >> c;

    double x = sqrt((a*a-b*b-c*c)+b*b*c*c/(a*a))-b*c/a;
    if(x>0) cout << x;
    else cout << -1;
}