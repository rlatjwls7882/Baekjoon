#include<bits/stdc++.h>
using namespace std;

int board[501][501];
bool chk[501][501];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int h, w, q; cin >> h >> w >> q;
    while(q--) {
        int qk, x, y; cin >> qk >> x >> y;
        if(qk==1) {
            int c; cin >> c;
            if(!chk[x][y]) board[x][y]=c;
            if(!chk[x+1][y]) board[x+1][y]=c;
            if(!chk[x][y+1]) board[x][y+1]=c;
            if(!chk[x+1][y+1]) board[x+1][y+1]=c;
        } else {
            chk[x][y]=chk[x+1][y]=chk[x][y+1]=chk[x+1][y+1]=true;
        }
    }
    for(int i=1;i<=h;i++) {
        for(int j=1;j<=w;j++) cout << board[i][j] << ' ';
        cout << '\n';
    }
}