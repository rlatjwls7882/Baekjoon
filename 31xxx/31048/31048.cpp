#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int n; cin >> n;
        int fac=1;
        for(int i=2;i<=n;i++) {
            fac = fac*i%10;
        }
        cout << fac << '\n';
    }
}