#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    cout << max(n/2, 1) << '\n';
    cout << "1 ";
    for(int i=2;i<=n;i++) {
        cout << i/2 << ' ';
    }
}