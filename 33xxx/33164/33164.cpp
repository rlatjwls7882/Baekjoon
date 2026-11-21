#include<bits/stdc++.h>
using namespace std;

int a[100], b[100];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<n;i++) cin >> a[i];
    for(int i=0;i<m;i++) cin >> b[i];

    int res=0;
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            res += (a[i]+b[j])*max(a[i], b[j]);
        }
    }
    cout << res;
}