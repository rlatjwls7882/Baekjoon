#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;

    int cnt=0;
    for(int i=0;i<=n;i++) {
        for(int j=0;j<=m;j++) {
            if(i+j<=n+m) {
                cnt++;
            }
        }
    }
    cout << cnt;
}