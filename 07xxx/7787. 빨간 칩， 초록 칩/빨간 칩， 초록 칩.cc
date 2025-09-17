#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int r, g; cin >> r >> g;
    if(r%2) {
        if(g%2) cout << "B player wins";
        else cout << "A player wins";
    } else {
        if(r%4==g%4) cout << "B player wins";
        else cout << "A player wins";
    }
}