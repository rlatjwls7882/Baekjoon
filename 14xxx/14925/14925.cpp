#include<bits/stdc++.h>
using namespace std;

int state[1001][1001], preSum[1001][1001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int m, n; cin >> m >> n;
    for(int i=1;i<=m;i++) {
        for(int j=1;j<=n;j++) {
            cin >> state[i][j];
            preSum[i][j] = state[i][j] + preSum[i-1][j] + preSum[i][j-1] - preSum[i-1][j-1];
        }
    }

    int maxLen=0;
    for(int i=1;i<=m;i++) {
        for(int j=1;j<=n;j++) {
            for(int k=1;;k++) {
                if(i-k>=0 && j-k>=0 && preSum[i][j] - preSum[i-k][j] - preSum[i][j-k] + preSum[i-k][j-k]==0) {
                    maxLen = max(maxLen, k);
                } else {
                    break;
                }
            }
        }
    }
    cout << maxLen;
}