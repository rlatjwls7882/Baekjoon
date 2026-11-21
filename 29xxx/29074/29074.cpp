#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;
    int cnt=0, len = (int)(log10(n)+1);
    for(int i=n;i<=m;i+=pow(10, len)) {
        cnt++;
    }
    cout << cnt;
}