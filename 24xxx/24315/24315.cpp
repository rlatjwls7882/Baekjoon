#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int a1, a0, c1, c2, n0; cin >> a1 >> a0 >> c1 >> c2 >> n0;
    // c1*n <= a1*n+a0 <= c2*n (n>=n0)
    if(a1==0) {
        if(a0==0) cout << 1;
        else cout << 0;
    } else if(c1-a1>0 || c2-a1<0) {
        cout << 0;
    } else {
        if(n0*(c1-a1)<=a0 && n0*(c2-a1)>=a0) cout << 1;
        else cout << 0;
    }
}