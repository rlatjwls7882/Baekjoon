#include<bits/stdc++.h>
using namespace std;

int cnt[50'001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    int ret=1;
    for(int i=0;i<n;i++) {
        int c; cin >> c;
        ret = max(ret, ++cnt[c]);
    }
    cout << ret;
}