#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=1;i<=n;i++) {
        if(i%2==1) {
            cout << (n+1)/2-i/2 << ' ';
        } else {
            cout << n-(i-1)/2 << ' ';
        }
    }
}