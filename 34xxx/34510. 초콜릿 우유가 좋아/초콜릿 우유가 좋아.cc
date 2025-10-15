#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long long h1, h2, h3, n; cin >> h1 >> h2 >> h3 >> n;
    cout << (n%2 ? h1 : 0) + ((n-1)/2+1)*h2 + n*h3;
}