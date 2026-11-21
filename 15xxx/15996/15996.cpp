#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, k; cin >> N >> k;

    int cnt=0;
    for(long long i=k;i<=N;i*=k) {
        cnt += N/i;
    }
    cout << cnt;
}