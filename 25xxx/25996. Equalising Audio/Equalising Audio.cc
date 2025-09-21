#include<bits/stdc++.h>
using namespace std;

typedef long double ld;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    ld n, x; cin >> n >> x;

    ld average=0;
    vector<ld> a(n);
    for(int i=0;i<n;i++) {
        cin >> a[i];
        average += a[i]*a[i];
    }
    average /= n;

    if(x==0 || average==0) {
        for(int i=0;i<n;i++) cout << "0 ";
        return 0;
    }

    ld w = sqrtl(x/average);
    for(int i=0;i<n;i++) cout << fixed << setprecision(6) << a[i]*w << ' ';
}