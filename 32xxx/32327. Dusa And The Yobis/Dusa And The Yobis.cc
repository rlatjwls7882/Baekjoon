#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int d; cin >> d;
    while(true) {
        int yobi; cin >> yobi;
        if(d<=yobi) break;
        d += yobi;
    }
    cout << d;
}