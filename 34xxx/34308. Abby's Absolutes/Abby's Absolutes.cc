#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; cin >> n >> k;
    while(k--) {
        int cur; cin >> cur;
        if(n-cur<cur-1) cout << n << ' ';
        else cout << "1 ";
    }
}