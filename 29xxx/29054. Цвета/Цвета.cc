#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int minVal=INT_MAX, maxVal=0;
    while(n--) {
        int a; cin >> a;
        minVal = min(a, minVal);
        maxVal = max(a, maxVal);
    }
    cout << maxVal-minVal+1;
}