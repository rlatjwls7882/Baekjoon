#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long long n, m; cin >> n >> m;

    while(n--) {
        int a; cin >> a;
        m -= a-1;
    }
    cout << (m<=0 ? "DIMI" : "OUT");
}