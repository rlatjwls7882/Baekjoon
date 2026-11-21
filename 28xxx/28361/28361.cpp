#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    cout << n << "\n1";

    int cur=1;
    if(n%3) {
        cout << " 2 4 3 5";
        cur=5;
    }
    while(cur<n-1) {
        cout << ' ' << cur+2 << ' ' << cur+1 << ' ' << (cur+2)%n+1;
        cur+=3;
    }
    if(cur==n) cout << " 1";
}