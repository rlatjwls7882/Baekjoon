#include<bits/stdc++.h>
using namespace std;

bool board[1001][1001];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, q; cin >> n >> m >> q;

    int remain=n*m;
    while(q--) {
        int z; cin >> z;
        if(z==1) {
            int dx, dy, x, y; cin >> dx >> dy >> x >> y;
            while(true) {
                if(x<1 || x>n || y<1 || y>m || board[x][y]) break;
                board[x][y]=true;
                x += dx;
                y += dy;
                remain--;
            }
        } else if(z==2) {
            int x, y; cin >> x >> y;
            cout << board[x][y] << '\n';
        } else {
            cout << remain << '\n';
        }
    }
}