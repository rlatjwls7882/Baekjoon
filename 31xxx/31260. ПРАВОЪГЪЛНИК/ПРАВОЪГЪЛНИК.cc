#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long long x, y, d; cin >> x >> y >> d;
    long long large_len = (100*x+y+2*d)/4;
    long long short_len = large_len-d;
    cout << large_len/100 << ' ' << large_len%100 << '\n' << short_len/100 << ' ' << short_len%100;
}