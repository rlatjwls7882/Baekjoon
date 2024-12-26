#include<bits/stdc++.h>
using namespace std;
const int MINF = -0x3f3f3f3f;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int z; cin >> z;
    while(z-->0) {
        int n; cin >> n;
        long long maxOdd=MINF, lastEven=MINF, lastOdd=MINF;
        while(n-->0) {
            long long cur; cin >> cur;
            long long curEven = lastOdd+cur;
            lastOdd = max(cur, lastEven+cur);
            lastEven = curEven;
            maxOdd = max(maxOdd, lastOdd);
        }
        cout << maxOdd << '\n';
    }
}