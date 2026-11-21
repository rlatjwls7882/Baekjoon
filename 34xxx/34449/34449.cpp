#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    double d, w, n; cin >> d >> w >> n;
    cout << (d*3.14159/n>=w ? "YES" : "NO");
}