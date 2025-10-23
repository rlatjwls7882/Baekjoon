#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int a, b, c; cin >> a >> b >> c;
        int rem=c%2*3;
        if(rem && b) rem-=2, b--;
        while(rem && a) rem--, a--;

        cout << (c+1)/2*3 + b + (a+1)/2 << '\n';
    }
}