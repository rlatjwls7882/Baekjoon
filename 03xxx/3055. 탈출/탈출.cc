#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int R, C; cin >> R >> C;
    string m[R];
    for(int i=0;i<R;i++) {
        cin >> m[i];
    }

    P S, E;
    for(int i=0;i<R;i++) {
        for(int j=0;j<C;j++) {
            if(m[i][j]=='S') S = P(i, j);
            else if(m[i][j]=='D') E = P(i, j);
        }
    }

    for(int t=1;;t++) {
        string nextM[R];
        for(int i=0;i<R;i++) {
            nextM[i]=m[i];
        }

        bool move=false;
        for(int i=0;i<R;i++) {
            for(int j=0;j<C;j++) {
                if(m[i][j]=='S') {
                    for(int k=0;k<4;k++) {
                        int nextX = i+moveX[k];
                        int nextY = j+moveY[k];
                        if(nextX<0 || nextX>=R || nextY<0 || nextY>=C || nextM[nextX][nextY]=='*' || nextM[nextX][nextY]=='S' || nextM[nextX][nextY]=='X') continue;
                        move=true;
                        nextM[nextX][nextY]='S';
                    }
                }
            }
        }
        if(!move) break;
        if(nextM[E.first][E.second]=='S') {
            cout << t;
            return 0;
        }
        for(int i=0;i<R;i++) {
            for(int j=0;j<C;j++) {
                if(m[i][j]=='*') {
                    for(int k=0;k<4;k++) {
                        int nextX = i+moveX[k];
                        int nextY = j+moveY[k];
                        if(nextX<0 || nextX>=R || nextY<0 || nextY>=C || nextM[nextX][nextY]=='*' || nextM[nextX][nextY]=='D' || nextM[nextX][nextY]=='X') continue;
                        nextM[nextX][nextY]='*';
                    }
                }
            }
        }
        for(int i=0;i<R;i++) {
            m[i]=nextM[i];
        }
    }
    cout << "KAKTUS";
}