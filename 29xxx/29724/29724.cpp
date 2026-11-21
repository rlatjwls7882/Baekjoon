#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int sum=0, price=0;
    while(n--) {
        string t; int w, h, l; cin >> t >> w >> h >> l;
        if(t[0]=='A') {
            int cnt = (w/12)*(h/12)*(l/12);
            sum += 1000 + cnt*500;
            price += cnt*4000;
        } else {
            sum += 6000;
        }
    }
    cout << sum << '\n' << price;
}