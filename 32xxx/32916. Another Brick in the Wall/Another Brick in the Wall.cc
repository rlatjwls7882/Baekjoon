#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int l, h; cin >> l >> h;
    if(l%2==1) cout << h;
    else cout << h/2*2;
}