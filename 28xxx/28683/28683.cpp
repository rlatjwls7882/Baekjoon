#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    long long n; cin >> n;
    if(sqrtl(n) == (long long)sqrtl(n)) {
        cout << -1;
        return 0;
    }

    int cnt=0;
    for(long long i=1;i*i<=n;i++) {
        if(n%i==0 && (i+n/i)%2==0) cnt++;
    }
    
    for(long long i=1;i*i*2<=n;i++) {
        if((long long)sqrtl(n-i*i) == sqrtl(n-i*i)) cnt++;
    }
    cout << cnt;
}