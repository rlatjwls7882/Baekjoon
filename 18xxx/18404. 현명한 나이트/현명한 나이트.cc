#include<bits/stdc++.h>
using namespace std;

int moveX[8] = {-2, -2, -1, -1, 1, 1, 2, 2};
int moveY[8] = {-1, 1, -2, 2, -2, 2, -1, 1};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    int Sx, Sy; cin >> Sx >> Sy;

    int m[N][N];
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            m[i][j]=-1;
        }
    }

    m[Sx-1][Sy-1]=0;
    queue<pair<int, int>> q; q.push({Sx-1, Sy-1});
    while(!q.empty()) {
        pair<int, int> cur = q.front(); q.pop();
        for(int i=0;i<8;i++) {
            int nextX = cur.first+moveX[i];
            int nextY = cur.second+moveY[i];
            if(nextX<0 || nextX>=N || nextY<0 || nextY>=N || m[nextX][nextY]!=-1) continue;
            m[nextX][nextY] = m[cur.first][cur.second]+1;
            q.push({nextX, nextY});
        }
    }

    while(M-->0) {
        int x, y; cin >> x >> y;
        cout << m[x-1][y-1] << ' ';
    }
}