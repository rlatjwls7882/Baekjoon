#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    long long A, B; cin >> A >> B;

    long long cnt=0;
    for(long long i=1;i<=B;i*=2) {
        cnt += (B/i - (A-1)/i)*(i-i/2);
    }
    cout << cnt;
}