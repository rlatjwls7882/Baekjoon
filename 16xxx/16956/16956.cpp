#include<bits/stdc++.h>
using namespace std;

int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int R, C; cin >> R >> C;

    string map[R];
    for(int i=0;i<R;i++) {
        cin >> map[i];
    }

    for(int i=0;i<R;i++) {
        for(int j=0;j<C;j++) {
            if(map[i][j]=='W') {
                for(int k=0;k<4;k++) {
                    int nextX = i+moveX[k];
                    int nextY = j+moveY[k];
                    if(nextX<0 || nextX>=R || nextY<0 || nextY>=C || map[nextX][nextY]=='.' || map[nextX][nextY]=='W') continue;
                    cout << 0;
                    return 0;
                }
            }
        }
    }

    cout << 1 << '\n';
    for(int i=0;i<R;i++) {
        for(int j=0;j<C;j++) {
            if(map[i][j]=='.') cout << 'D';
            else cout << map[i][j];
        }
        cout << '\n';
    }
}