#include<bits/stdc++.h>
using namespace std;

const int MAX = 5002;

int board[MAX][MAX];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    while(m--) {
        int a, b, x; cin >> a >> b >> x;
        board[a-1][b-1]++;
        board[a-1][b]--;
        board[a+x][b-1]--;
        board[a+x][b+x+1]++;
        board[a+x+1][b]++;
        board[a+x+1][b+x+1]--;
    }

    // 오른쪽
    for(int i=0;i<=n;i++) {
        for(int j=0;j<=n;j++) {
            board[i][j+1] += board[i][j];
        }
    }

    // 아래쪽
    for(int i=0;i<=n;i++) {
        for(int j=0;j<=n;j++) {
            board[i+1][j] += board[i][j];
        }
    }

    // 오른쪽 대각선 아래
    for(int i=0;i<=n;i++) {
        for(int j=0;j<=n;j++) {
            board[i+1][j+1] += board[i][j];
        }
    }

    int cnt=0;
    for(int i=0;i<=n;i++) {
        for(int j=0;j<=n;j++) {
            if(board[i][j]) cnt++;
        }
    }
    cout << cnt;
}