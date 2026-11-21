#include<bits/stdc++.h>
using namespace std;

int M, N;
int m[250][250];
int moveX[8] = {1, 1, 1, 0, 0, -1, -1, -1};
int moveY[8] = {-1, 0, 1, -1, 1, -1, 0, 1};
bool visited[250][250] = {false, };

void flood_fill(int x, int y) {
    queue<pair<int, int>> q; q.push(make_pair(x, y));
    visited[x][y]=true;
    while(!q.empty()) {
        pair<int, int> cur = q.front(); q.pop();
        for(int i=0;i<8;i++) {
            int nextX = cur.first+moveX[i];
            int nextY = cur.second+moveY[i];
            if(nextX<0 || nextX>=M || nextY<0 || nextY>=N || visited[nextX][nextY] || m[nextX][nextY]==0) continue;
            visited[nextX][nextY]=true;
            q.push(make_pair(nextX, nextY));
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> M >> N;
    for(int i=0;i<M;i++) {
        for(int j=0;j<N;j++) {
            cin >> m[i][j];
        }
    }

    int cnt=0;
    for(int i=0;i<M;i++) {
        for(int j=0;j<N;j++) {
            if(m[i][j]==1 && !visited[i][j]) {
                cnt++;
                flood_fill(i, j);
            }
        }
    }
    cout << cnt;
}