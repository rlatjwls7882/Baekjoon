#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int R, G; cin >> R >> G;

    int _gcd = gcd(R, G);

    for(int i=1;i*i<=_gcd;i++) {
        if(_gcd%i==0) {
            if(i*i==_gcd) {
                cout << i << ' ' << R/i << ' ' << G/i << '\n';
            } else {
                cout << i << ' ' << R/i << ' ' << G/i << '\n';
                cout << _gcd/i << ' ' << R/(_gcd/i) << ' ' << G/(_gcd/i) << '\n';
            }
        }
    }

}