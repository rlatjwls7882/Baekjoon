#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    if(n==1) {
        cout << "1";
    } else if(n==2) {
        cout << "2 1";
    } else if(n%2) {
        cout << -1;
    } else {
        int l=n-1, r=3;
        cout << n << ' ' << n-1 << ' ' << 2 << ' ';
        while(r<l) {
            cout << l - (r-1) << ' ' << (r+n) - l << ' ';
            l--;
            r++;
        }
        cout << 1;
    }
}