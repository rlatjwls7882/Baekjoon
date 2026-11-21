#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long long n, k; cin >> n >> k;
    if(n==1 || n==5) {
        cout << k*8 + n-1;
    } else if(k%2==0) {
        cout << k/2*8 + n-1;
    } else {
        cout << k/2*8 + 9-n;
    }
}