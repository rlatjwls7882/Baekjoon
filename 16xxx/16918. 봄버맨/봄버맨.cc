#include <bits/stdc++.h>
using namespace std;

int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};

struct Bomb {
    char bomb;
    int t;
    Bomb() {}
    Bomb(char bomb, int t) {
        this->bomb=bomb;
        this->t=t;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int R, C, N; cin >> R >> C >> N;

    Bomb m[R][C];
    for(int i=0;i<R;i++) {
        for(int j=0;j<C;j++) {
            char tmp; cin >> tmp;
            if(tmp=='O') m[i][j] = Bomb('O', 0);
            else m[i][j] = Bomb('.', -10);
        }
    }

    for(int t=2;t<=N;t++) {
        for(int i=0;i<R;i++) {
            for(int j=0;j<C;j++) {
                if(t%2==0) {
                    if(m[i][j].bomb=='.') {
                        m[i][j] = Bomb('O', t);
                    }
                } else {
                    if(m[i][j].t==t-3) {
                        m[i][j].bomb = '.';
                        for(int k=0;k<4;k++) {
                            int nextX = i+moveX[k];
                            int nextY = j+moveY[k];
                            if(nextX<0 || nextX>=R || nextY<0 || nextY>=C) continue;
                            m[nextX][nextY].bomb = '.';
                        }
                    }
                }
            }
        }
    }

    for(int i=0;i<R;i++) {
        for(int j=0;j<C;j++) {
            cout << m[i][j].bomb;
        }
        cout << '\n';
    }
}