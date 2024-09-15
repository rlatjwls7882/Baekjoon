#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int t; cin >> t;

    while(t-->0) {
        int n, l; cin >> n >> l;

        int a[n];
        for(int i=0;i<n;i++) {
            cin >> a[i];
        }
        sort(a, a+n);

        int b[n];
        for(int i=0;i<n;i++) {
            cin >> b[i];
        }
        sort(b, b+n, greater<int>());

        int suma=0, sumb=0;
        for(int i=0;i<l;i++) {
            suma += a[i];
            sumb += b[i];
        }
        cout << (suma>sumb?"YES\n":"NO\n");
    }
}