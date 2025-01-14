#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int X, Y; cin >> X >> Y;
    int diff=Y-X;
    for(int i=0;;i++) {
        diff -= (i+1)/2;
        if(diff<=0) {
            cout << i;
            return 0;
        }
    }
}