#include<bits/stdc++.h>
using namespace std;

const long long MOD = 1e9+7;
const long long MAX = 10'000'000;

long long res[MAX+1];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    res[1] = 5;
    res[2] = 20;
    for(int i=3;i<=MAX;i++) res[i] = res[i-1]*5%MOD;

    int q; cin >> q;
    while(q--) {
        int n; cin >> n;
        cout << res[n] << '\n';
    }
}