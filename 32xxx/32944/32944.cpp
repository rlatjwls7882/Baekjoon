#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, k; cin >> n >> m >> k;

    if(n==m) {
        cout << -1;
    } else {
        for(int i=1;i<k;i++) cout << i << ' ';
        for(int i=n;i>m;i--) cout << i << ' ';
        for(int i=k;i<=m;i++) cout << i << ' ';
    }
}