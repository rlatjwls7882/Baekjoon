#include<bits/stdc++.h>
using namespace std;

int row[500'000], col[500'000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, q; cin >> n >> m >> q;
    while(q--) {
        int x, u, v; cin >> x >> u >> v;
        if(x==1) row[u-1] += v;
        else col[u-1] += v;
    }

    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) cout << row[i]+col[j] << ' ';
        cout << '\n';
    }
}