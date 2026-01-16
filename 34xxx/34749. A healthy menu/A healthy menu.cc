#include<bits/stdc++.h>
using namespace std;

int mx[1000];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            int cur; cin >> cur;
            mx[j] = max(mx[j], cur);
        }
    }
    cout << accumulate(mx, mx+m, 0);
}