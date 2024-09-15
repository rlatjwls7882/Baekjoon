#include<bits/stdc++.h>
using namespace std;

int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};

struct Pos {
    int x, y, cost, cnt;
    Pos(int x, int y, int cost, int cnt) {
        this->x=x;
        this->y=y;
        this->cost=cost;
        this->cnt=cnt;
    }

    bool operator<(const Pos a) const {
        return this->cost>a.cost;
    }
};

bool visited[100][100][3] = {false, };

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M, Sx, Sy, Ex, Ey; cin >> N >> M >> Sx >> Sy >> Ex >> Ey;
    int m[N][M];
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            cin >> m[i][j];
        }
    }

    priority_queue<Pos> pq; pq.push(Pos(Sx-1, Sy-1, 0, 1));
    while(!pq.empty()) {
        Pos cur = pq.top(); pq.pop();
        if(visited[cur.x][cur.y][cur.cnt]) continue;
        visited[cur.x][cur.y][cur.cnt]=true;

        if(cur.x==Ex-1 && cur.y==Ey-1) {
            cout << cur.cost;
            return 0;
        }

        for(int i=0;i<4;i++) {
            int nextX = cur.x+moveX[i];
            int nextY = cur.y+moveY[i];
            if(cur.cnt!=0 && cur.cnt-1!=i/2 || nextX<0 || nextX>=N || nextY<0 || nextY>=M || visited[nextX][nextY][(cur.cnt+1)%3] || m[nextX][nextY]==-1) continue;
            pq.push(Pos(nextX, nextY, cur.cost+m[nextX][nextY], (cur.cnt+1)%3));
        }
    }
    cout << -1;
}