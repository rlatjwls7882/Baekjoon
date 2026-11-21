#include<bits/stdc++.h>
using namespace std;

int h, w;
string m[100];
int moveX[4] = {0, 0, 1, -1};
int moveY[4] = {1, -1, 0, 0};

void dfs(int x, int y) {
    for(int i=0;i<4;i++) {
        int nextX = x+moveX[i];
        int nextY = y+moveY[i];
        if(nextX<0 || nextX>=h || nextY<0 || nextY>=w || m[nextX][nextY]=='.') continue;
        m[nextX][nextY]='.';
        dfs(nextX, nextY);
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        cin >> h >> w;
        for(int i=0;i<h;i++) {
            cin >> m[i];
        }

        int cnt=0;
        for(int i=0;i<h;i++) {
            for(int j=0;j<w;j++) {
                if(m[i][j]=='#') {
                    cnt++;
                    dfs(i, j);
                }
            }
        }
        cout << cnt << '\n';
    }
}