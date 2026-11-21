#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;
    long long T[n+1] = {0, };
    for(int i=1;i<=n;i++) {
        cin >> T[i];
        T[i] += T[i-1];
    }

    long long _max = T[min(n, m)];
    for(int i=m+1;i<=n;i++) {
        _max = max(_max, T[i]-T[i-m]);
    }
    cout << _max;
}