#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int p, m, c, x; cin >> p >> m >> c >> x;

    int ret=INT_MAX;
    for(int i=1;i<=p;i++) {
        for(int j=1;j<=m;j++) {
            for(int k=1;k<=c;k++) {
                ret = min(ret, abs((i+j)*(j+k)-x));
            }
        }
    }
    cout << ret;
}