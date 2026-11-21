#include<bits/stdc++.h>
using namespace std;

int a[200'000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, q; cin >> n >> q;
    for(int i=0;i<n;i++) cin >> a[i];

    int sum=0;
    for(int i=0;i<n;i++) sum += a[i]*a[(i+1)%n]*a[(i+2)%n]*a[(i+3)%n];

    while(q--) {
        int x; cin >> x;
        for(int i=x-4;i<x;i++) sum -= 2*a[(i+n)%n]*a[(i+n+1)%n]*a[(i+n+2)%n]*a[(i+n+3)%n];
        a[x-1]*=-1;
        cout << sum << '\n';
    }
}