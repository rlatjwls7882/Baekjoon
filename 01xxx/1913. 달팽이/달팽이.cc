#include<bits/stdc++.h>
using namespace std;

int moveX[4] = {-1, 0, 1, 0};
int moveY[4] = {0, 1, 0, -1};
int m[999][999] = {0, };

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, idx; cin >> N >> idx;

    m[N/2][N/2]=1;
    int move=0, curX=N/2-1, curY=N/2;
    for(int i=2;i<=N*N;i++) {
        m[curX][curY]=i;
        int nextX=curX+moveX[(move+1)%4];
        int nextY=curY+moveY[(move+1)%4];
        if(nextX>=0 && nextX<N && nextY>=0 && nextY<N && m[nextX][nextY]==0) {
            move = (move+1)%4;
            curX=nextX;
            curY=nextY;
        } else {
            curX+=moveX[move];
            curY+=moveY[move];
        }
    }
    
    int pos[2];
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            cout << m[i][j] << " ";
            if(m[i][j]==idx) {
                pos[0]=i;
                pos[1]=j;
            }
        }
        cout << '\n';
    }
    cout << pos[0]+1 << " " << pos[1]+1;
}