#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long long R, K, M; cin >> R >> K >> M;
    while(M>=K && R>0) {
        R/=2;
        M -= K;
    }
    cout << R;
}