#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i+=2) {
        if(i==0) cout << n*n/2 << ' ';
        else cout << i/2*n << ' ';
        for(int j=1;j<n;j++) cout << i/2*n+j << ' ';
        cout << '\n';

        for(int j=1;j<=n;j++) cout << i/2*n+j << ' ';
        cout << '\n';
    }
}