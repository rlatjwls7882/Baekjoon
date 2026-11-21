#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    if(n<=2) {
        cout << 0;
        return 0;
    }

    long double x[n], y[n];
    for(int i=0;i<n;i++) cin >> x[i] >> y[i];

    long double sum=0;
    for(int i=0;i<n;i++) {
        sum += x[i]*y[(i+1)%n];
        sum -= x[i]*y[(i-1+n)%n];
    }
    sum/=2;
    cout.precision(10);
    cout << fixed;
    cout << sum*(1-M_PI/(3*sqrt(3)))/3;
}