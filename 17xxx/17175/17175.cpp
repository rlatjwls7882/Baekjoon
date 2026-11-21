#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int n; cin >> n;

    long fib[n+2];
    fib[0]=fib[1]=1;

    for(int i=2;i<=n;i++) {
        fib[i] = (fib[i-1]+fib[i-2]+1)%1000000007;
    }
    cout << fib[n];
}