#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    int preSum[N+1][M+1] = {0, };
    for(int i=1;i<=N;i++) {
        for(int j=1;j<=M;j++) {
            cin >> preSum[i][j];
            preSum[i][j] += preSum[i-1][j]+preSum[i][j-1]-preSum[i-1][j-1];
        }
    }

    int K; cin >> K;
    while(K-->0) {
        int x1, y1, x2, y2; cin >> x1 >> y1 >> x2 >> y2;
        cout << preSum[x2][y2] - preSum[x1-1][y2] - preSum[x2][y1-1] + preSum[x1-1][y1-1] << '\n';
    }
}