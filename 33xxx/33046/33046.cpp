#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int a, b, c, d; cin >> a >> b >> c >> d;
    cout << (a+b+c+d-2)%4+1;
}