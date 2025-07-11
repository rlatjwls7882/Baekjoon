#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int b; cin >> b;
    while(b--) {
        int s, n, f, m; cin >> s >> n >> f >> m;

        int res = s-m;
        cout << (n<=res && res<=n*f ? "YES\n" : "NO\n");
    }
}