#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int m; cin >> m;
    int ret=0;
    while(m--) {
        int p; cin >> p;
        ret ^= p;
    }
    cout << (ret?"koosaga":"cubelover");
}