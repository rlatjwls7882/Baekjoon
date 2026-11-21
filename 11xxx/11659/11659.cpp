#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'001;

int preSum[MAX];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=1;i<=n;i++) {
        cin >> preSum[i];
        preSum[i] += preSum[i-1];
    }

    while(m--) {
        int i, j; cin >> i >> j;
        cout << preSum[j] - preSum[i-1] << '\n';
    }
}