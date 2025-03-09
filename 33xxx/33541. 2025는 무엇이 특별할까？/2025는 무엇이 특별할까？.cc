#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int x; cin >> x;
    while(++x<10000) {
        if(x == (x/100 + x%100) * (x/100 + x%100)) {
            cout << x;
            return 0;
        }
    }
    cout << -1;
}