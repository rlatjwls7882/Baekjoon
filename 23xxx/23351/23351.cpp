#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k, a, b; cin >> n >> k >> a >> b;

    int res=k;
    while(k>=n/a) {
        res += b;
        k = k-n/a+b;
    }
    cout << res;
}