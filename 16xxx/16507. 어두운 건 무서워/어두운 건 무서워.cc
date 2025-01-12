#include<bits/stdc++.h>
using namespace std;

int preSum[1001][1001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int R, C, Q; cin >> R >> C >> Q;
    for(int i=1;i<=R;i++) {
        for(int j=1;j<=C;j++) {
            cin >> preSum[i][j];
            preSum[i][j] += preSum[i-1][j] + preSum[i][j-1] - preSum[i-1][j-1];
        }
    }

    while(Q-->0) {
        int r1, c1, r2, c2; cin >> r1 >> c1 >> r2 >> c2;
        cout << (preSum[r2][c2]-preSum[r1-1][c2]-preSum[r2][c1-1]+preSum[r1-1][c1-1]) / ((r2-r1+1)*(c2-c1+1)) << '\n';
    }
}