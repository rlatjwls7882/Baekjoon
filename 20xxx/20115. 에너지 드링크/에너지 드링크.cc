#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int x[n];
    for(int i=0;i<n;i++) {
        cin >> x[i];
    }
    sort(x, x+n);

    double sum=x[n-1];
    for(int i=0;i<n-1;i++) {
        sum += x[i]/2.0;
    }
    cout << sum;
}