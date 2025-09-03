#include<bits/stdc++.h>
using namespace std;

char board[10][10];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; string s; cin >> n >> s;
    fill(&board[0][0], &board[9][10], '.');

    int x=0, y=0;
    for(char ch : s) {
        if(ch=='D' && x!=n-1 || ch=='U' && x!=0) {
            if(board[x][y]=='-') board[x][y]='+';
            else if(board[x][y]=='.') board[x][y]='|';

            if(ch=='D') x++;
            else x--;

            if(board[x][y]=='-') board[x][y]='+';
            else if(board[x][y]=='.') board[x][y]='|';
        } else if(ch=='R' && y!=n-1 || ch=='L' && y!=0) {
            if(board[x][y]=='|') board[x][y]='+';
            else if(board[x][y]=='.') board[x][y]='-';

            if(ch=='R') y++;
            else y--;

            if(board[x][y]=='|') board[x][y]='+';
            else if(board[x][y]=='.') board[x][y]='-';
        }
    }

    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) cout << board[i][j];
        cout << '\n';
    }
}