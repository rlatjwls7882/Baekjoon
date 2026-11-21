#include<bits/stdc++.h>
using namespace std;

int board[20][20];
bool chk[20][20];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N; cin >> N;

    for(int i=1;i<=N;i++) {
        int x, y; cin >> x >> y;
        board[x][y] = i%2+1;

        int row=1;
        for(int j=1;y-j>=1 && board[x][y-j]==board[x][y];j++) row++;
        for(int j=1;y+j<=19 && board[x][y+j]==board[x][y];j++) row++;

        int col=1;
        for(int j=1;x-j>=1 && board[x-j][y]==board[x][y];j++) col++;
        for(int j=1;x+j<=19 && board[x+j][y]==board[x][y];j++) col++;

        int cross1=1;
        for(int j=1;x-j>=1 && y-j>=1 && board[x-j][y-j]==board[x][y];j++) cross1++;
        for(int j=1;x+j<=19 && y+j<=19 && board[x+j][y+j]==board[x][y];j++) cross1++;

        int cross2=1;
        for(int j=1;x-j>=1 && y+j<=19 && board[x-j][y+j]==board[x][y];j++) cross2++;
        for(int j=1;x+j<=19 && y-j>=1 && board[x+j][y-j]==board[x][y];j++) cross2++;

        if(row==5 || col==5 || cross1==5 || cross2==5) {
            cout << i;
            return 0;
        }
    }
    cout << -1;
}