#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const ll MOD = 1e9+7;

ll w[1001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    w[2]=3;
    for(int i=4;i<=n;i+=2) {
        w[i] = (w[i-2]*3+2)%MOD;
        for(int j=2;j<i-2;j+=2) w[i] = (w[i]+w[j]*2)%MOD;
    }
    cout << w[n];
}