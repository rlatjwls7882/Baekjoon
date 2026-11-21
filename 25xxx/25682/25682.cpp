#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m, k; cin >> n >> m >> k;
    string board[n];
    for(int i=0;i<n;i++) cin >> board[i];

    int changeCnt[n+1][m+1]; fill(&changeCnt[0][0], &changeCnt[n][m+1], 0);
    for(int i=1;i<=n;i++) {
        for(int j=1;j<=m;j++) {
            if(i%2==j%2 && board[i-1][j-1]=='W' || i%2!=j%2 && board[i-1][j-1]=='B') changeCnt[i][j]++;
            changeCnt[i][j] += changeCnt[i-1][j] + changeCnt[i][j-1] - changeCnt[i-1][j-1];
        }
    }

    int minChange = k*k;
    for(int i=k;i<=n;i++) {
        for(int j=k;j<=m;j++) {
            int cnt = changeCnt[i][j] - changeCnt[i-k][j] - changeCnt[i][j-k] + changeCnt[i-k][j-k];
            minChange = min(minChange, min(cnt, k*k-cnt));
        }
    }
    cout << minChange;
}