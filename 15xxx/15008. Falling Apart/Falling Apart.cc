#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int n; cin >> n;

    int a[n];
    for(int i=0;i<n;i++) {
        cin >> a[i];
    }
    sort(a, a+n, greater<int>());

    int A=0, B=0;
    for(int i=0;i<n;i++) {
        if(i%2==0) {
            A += a[i];
        } else {
            B += a[i];
        }
    }
    cout << A << " " << B;
}