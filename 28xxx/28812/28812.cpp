#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, c; cin >> n >> c;
    int minCost = INT_MAX;
    while(n--) {
        int p, d, v; cin >> p >> d >> v;
        minCost = min(minCost, p+d+v*c);
    }
    cout << minCost;
}