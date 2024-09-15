#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;

    int minVal=INT_MAX, sum=0, xorVal=0;
    while(n-->0) {
        int tmp; cin >> tmp;
        sum += tmp;
        minVal = min(minVal, tmp);
        xorVal ^= tmp;
    }

    if(xorVal==0) cout << sum-minVal;
    else cout << 0;
}