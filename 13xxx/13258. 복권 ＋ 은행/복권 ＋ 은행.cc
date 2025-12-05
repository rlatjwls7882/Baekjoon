#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    double a, b; cin >> a;
    for(int i=0;i<n-1;i++) {
        int tmp; cin >> tmp;
        b += tmp;
    }
    double j, c; cin >> j >> c;
    cout << setprecision(10) << fixed << a + a/(a+b)*j*c;
}