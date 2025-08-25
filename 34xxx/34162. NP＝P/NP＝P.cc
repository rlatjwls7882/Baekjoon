#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int k; cin >> k;

    if(k==1) {
        cout << "0\n1" << flush;
    } else {
        cout << "1\n1\n" << flush;
        int m; cin >> m;
        cout << (m+k-1)%k+1 << flush;
    }
}