#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, k, T; cin >> n >> k >> T;

    int cnt=0;
    while(n-->0) {
        int d; cin >> d;
        T = T+d - (T-k);
        cnt += abs(T-k);
    }
    cout << cnt;
}