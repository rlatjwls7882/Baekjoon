#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    if(n==3) {
        cout << -1;
    } else if(n%2==0) {
        cout << n/2 << '\n';
        for(int i=0;i<n/2-1;i++) cout << n-i << '\n';
        for(int i=n/2-1;i>=1;i--) cout << i << '\n';
        cout << n/2+1;
    } else {
        for(int i=n-1;i>=1;i--) {
            if(i==n/2) cout << n << '\n';
            else cout << i << '\n';
        }
        cout << n/2;
    }
}