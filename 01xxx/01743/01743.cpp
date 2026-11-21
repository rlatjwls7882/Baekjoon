#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

int N, M, _max=0;
char m[100][100];
int moveX[4] = {0, 0, 1, -1};
int moveY[4] = {1, -1, 0, 0};
bool visited[100][100] = {false, };

void bfs(int x, int y) {
    queue<P> q; q.push(P(x, y));
    int cnt=1; visited[x][y]=true;
    while(!q.empty()) {
        P cur = q.front(); q.pop();
        for(int i=0;i<4;i++) {
            int nextX = cur.first+moveX[i];
            int nextY = cur.second+moveY[i];
            if(nextX<0 || nextX>=N || nextY<0 || nextY>=M || m[nextX][nextY]=='.' || visited[nextX][nextY]) continue;
            visited[nextX][nextY]=true;
            cnt++;
            q.push(P(nextX, nextY));
        }
    }
    _max = max(_max, cnt);
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int K; cin >> N >> M >> K;

    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            m[i][j] = '.';
        }
    }

    while(K-->0) {
        int r, c; cin >> r >> c;
        m[r-1][c-1]='#';
    }

    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            if(m[i][j]=='#' && !visited[i][j]) {
                bfs(i, j);
            }
        }
    }
    cout << _max;
}