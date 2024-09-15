#include<bits/stdc++.h>
using namespace std;

int N, M, cnt=0;
int m[50][50];
int roomSize[2501];
int visited[50][50] = {0, };
int bit[4] = {1, 2, 4, 8};
int moveX[4] = {0, -1, 0, 1};
int moveY[4] = {-1, 0, 1, 0};

void flood_fill(int x, int y) {
    queue<pair<int, int>> q; q.push(make_pair(x, y));
    visited[x][y]=cnt;
    while(!q.empty()) {
        pair<int, int> cur = q.front(); q.pop();
        roomSize[cnt]++;
        for(int i=0;i<4;i++) {
            if(!(m[cur.first][cur.second]&bit[i]) && !visited[cur.first+moveX[i]][cur.second+moveY[i]]) {
                visited[cur.first+moveX[i]][cur.second+moveY[i]]=cnt;
                q.push(make_pair(cur.first+moveX[i], cur.second+moveY[i]));
            }
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N >> M;
    for(int i=0;i<M;i++) {
        for(int j=0;j<N;j++) {
            cin >> m[i][j];
        }
    }

    int maxSize=0;
    for(int i=0;i<M;i++) {
        for(int j=0;j<N;j++) {
            if(!visited[i][j]) {
                cnt++;
                flood_fill(i, j);
                maxSize = max(maxSize, roomSize[cnt]);
            }
        }
    }
    cout << cnt << '\n' << maxSize << '\n';

    for(int i=0;i<M;i++) {
        for(int j=0;j<N;j++) {
            for(int k=0;k<4;k++) {
                if(i+moveX[k]<0 || i+moveX[k]>=M || j+moveY[k]<0 || j+moveY[k]>=N || visited[i][j]==visited[i+moveX[k]][j+moveY[k]]) continue;
                maxSize = max(maxSize, roomSize[visited[i][j]]+roomSize[visited[i+moveX[k]][j+moveY[k]]]);
            }
        }
    }
    cout << maxSize;
}
