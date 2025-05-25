#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int k; cin >> k;

    int l=1, r=k;
    for(int i=2;i*i<=k;i++) {
        if(k%i==0) {
            l=i;
            r=k/i;
        }
    }

    cout << l+r << '\n';
    for(int i=1;i<=r;i++) {
        cout << i << ' ' << i+1 << '\n';
    }
    for(int i=1;i<l;i++) {
        cout << i << ' ' << r+i+1 << '\n';
    }
}