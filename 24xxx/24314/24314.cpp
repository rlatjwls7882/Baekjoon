#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int a1, a0, c, n0; cin >> a1 >> a0 >> c >> n0;
    if(c-a1>0) {
        cout << 0;
    } else {
        if((c-a1)*n0 <= a0) cout << 1;
        else cout << 0;
    }
}