#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int a, b, h, w; cin >> a >> b >> h >> w;
    cout << ((h+a-1)/a)*((w+b-1)/b);
}