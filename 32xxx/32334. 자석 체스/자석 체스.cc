#include<bits/stdc++.h>
using namespace std;

bool chk[2001][2001];
int preSum[2001][2001];

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, D; cin >> N >> D;
    for(int i=1;i<=N;i++) {
        for(int j=1;j<=N;j++) {
            preSum[i][j] = preSum[i-1][j]+preSum[i][j-1]-preSum[i-1][j-1];
            cin >> chk[i][j];
            if(chk[i][j]) preSum[i][j]++;
        }
    }

    int minCnt=INT_MAX, minX=1, minY=1;
    for(int i=1;i<=N;i++) {
        for(int j=1;j<=N;j++) {
            if(!chk[i][j]) {
                int cnt = preSum[min(N, i+D)][min(j+D, N)]-preSum[max(0, i-D-1)][min(j+D, N)]-preSum[min(N, i+D)][max(0, j-D-1)]+preSum[max(0, i-D-1)][max(0, j-D-1)];
                if(cnt==0) {
                    cout << i << ' ' << j << '\n';
                    return 0;
                }
                if(minCnt>cnt) {
                    minCnt=cnt;
                    minX=i;
                    minY=j;
                }
            }
        }
    }
    cout << minX << ' ' << minY << '\n' << minCnt;
}