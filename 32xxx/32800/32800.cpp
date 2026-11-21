#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;

    long long curC=0, maxC=0;
    while(n-->0) {
        long long a, b; cin >> a >> b;
        curC += -a+b;
        maxC = max(maxC, curC);
    }
    cout << maxC;
}