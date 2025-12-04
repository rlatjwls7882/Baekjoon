#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int y, c, p; cin >> y >> c >> p;
    cout << min({y, c/2, p});
}