#include<bits/stdc++.h>
using namespace std;

int combination(int n, int r) {
    int res=1;
    for(int i=n;i>n-r;i--) {
        res *= i;
    }
    for(int i=1;i<=r;i++) {
        res /= i;
    }
    return res;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, k; cin >> n >> m >> k;

    int total=0;
    for(int i=k;i<=m;i++) {
        total += combination(m, i)*combination(n-m, m-i);
    }
    cout << setprecision(9) << fixed << total / (long double)combination(n, m);
}