#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, a, b; cin >> n >> m >> a >> b;

    int ammo=0, t=0;
    while(n) {
        if(!ammo) {
            if(b*min(m, n)<=a) {
                ammo++;
                t+=b;
            } else {
                ammo=m;
                t+=a;
            }
        } else {
            ammo--;
            n--;
            t++;
        }
    }
    cout << t;
}