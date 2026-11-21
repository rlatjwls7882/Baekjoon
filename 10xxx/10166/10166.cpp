#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int D1, D2; cin >> D1 >> D2;

    set<pair<int, int>> s;
    for(int i=D1;i<=D2;i++) {
        for(int j=1;j<=i;j++) {
            int gcdVal = gcd(i, j);
            s.insert({i/gcdVal, j/gcdVal});
        }
    }
    cout << s.size();
}