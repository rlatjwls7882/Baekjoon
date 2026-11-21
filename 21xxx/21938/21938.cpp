#include<bits/stdc++.h>
using namespace std;

int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    int m[N][M];
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            int r, g, b; cin >> r >> g >> b;
            m[i][j] = (r+g+b)/3;
        }
    }
    int T; cin >> T;

    bool visited[N][M];
    memset(visited, false, sizeof(visited));

    int cnt=0;
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            if(m[i][j]>=T && !visited[i][j]) {
                cnt++;
                visited[i][j]=true;
                queue<pair<int, int>> q; q.push({i, j});
                while(!q.empty()) {
                    pair<int, int> cur = q.front(); q.pop();
                    for(int k=0;k<4;k++) {
                        int nextX = cur.first+moveX[k];
                        int nextY = cur.second+moveY[k];
                        if(nextX<0 || nextX>=N || nextY<0 || nextY>=M || visited[nextX][nextY] || m[nextX][nextY]<T) continue;
                        visited[nextX][nextY]=true;
                        q.push({nextX, nextY});
                    }
                }
            }
        }
    }
    cout << cnt;
}