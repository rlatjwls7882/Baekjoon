#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;

    bool cnt[N+1][N+1]; memset(cnt, false, sizeof(cnt));
    for(int i=0;i<M;i++) {
        int r, c; cin >> r >> c;
        cnt[r][c]=true;
    }

    int preSum[N+1][N+1]; memset(preSum, 0, sizeof(preSum));
    for(int i=1;i<=N;i++) {
        for(int j=1;j<=N;j++) {
            preSum[i][j] = preSum[i-1][j] + preSum[i][j-1] - preSum[i-1][j-1] + (cnt[i][j]);
        }
    }

    vector<int> squareLen;
    for(int i=1;i*i<=M;i++) if(M%i==0) squareLen.push_back(i);

    int minMoveCnt = M;
    for(int i=1;i<=N;i++) {
        for(int j=1;j<=N;j++) {
            for(int len:squareLen) {
                if(i>=len && j>=M/len) minMoveCnt = min(minMoveCnt, M - (preSum[i][j] - preSum[i-len][j] - preSum[i][j-M/len] + preSum[i-len][j-M/len]));
                if(i>=M/len && j>=len) minMoveCnt = min(minMoveCnt, M - (preSum[i][j] - preSum[i-M/len][j] - preSum[i][j-len] + preSum[i-M/len][j-len]));
            }
        }
    }
    cout << minMoveCnt;
}