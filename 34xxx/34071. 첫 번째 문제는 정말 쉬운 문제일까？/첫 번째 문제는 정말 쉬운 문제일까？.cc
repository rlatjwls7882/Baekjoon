#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int firstX; cin >> firstX;
    int small=firstX, big=firstX;
    while(n-->1) {
        int x; cin >> x;
        small = min(small, x);
        big = max(big, x);
    }

    if(firstX==small) cout << "ez";
    else if(firstX==big) cout << "hard";
    else cout << "?";
}