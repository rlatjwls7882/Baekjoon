#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, p, q, r, s; cin >> n >> p >> q >> r >> s;
    int a[n+1]; cin >> a[1];

    int sum = a[1];
    for(int i=2;i<=n;i++) {
        if(i%2==0) a[i] = p*a[i/2]+q;
        else a[i] = r*a[i/2]+s;
        sum += a[i];
    }
    cout << sum;
}