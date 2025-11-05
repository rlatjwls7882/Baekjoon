#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int q; cin >> q;
    while(q--) {
        int a; cin >> a;
        int h = 6+(6+a/50*12)/60;
        int m = (6+a/50*12)%60;
        if(h>=24) cout << "-1\n";
        else {
            if(h<10) cout << 0;
            cout << h << ':';
            if(m<10) cout << 0;
            cout << m << '\n';
        }
    }
}