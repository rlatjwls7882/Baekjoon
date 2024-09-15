#include<bits/stdc++.h>
using namespace std;

int moveX[4] = {0, 0, 1, -1};
int moveY[4] = {1, -1, 0, 0};

struct Pos {
    int x, y, cost, mod;
    bool operator<(const Pos a) const {
        return this->cost > a.cost;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, t, r, c; cin >> N >> t >> r >> c;
    string m[N];
    for(int i=0;i<N;i++) {
        cin >> m[i];
    }

    int visited[N][N][2];
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            for(int k=0;k<2;k++) {
                visited[i][j][k]=-1;
            }
        }
    }

    priority_queue<Pos> pq; pq.push({0, 0, 0, 0});
    while(!pq.empty()) {
        Pos cur = pq.top(); pq.pop();
        if(visited[cur.x][cur.y][cur.mod]!=-1) continue;
        visited[cur.x][cur.y][cur.mod]=cur.cost;
        if(cur.x==r-1 && cur.y==c-1) {
            cout << cur.cost;
            return 0;
        }

        if(cur.mod==0) {
            for(int i=0;i<4;i++) {
                Pos next = {cur.x+moveX[i], cur.y+moveY[i], cur.cost+1, 0};
                if(next.x<0 || next.x>=N || next.y<0 || next.y>=N || visited[next.x][next.y][0]!=-1) continue;
                pq.push(next);
            }
            if(visited[cur.x][cur.y][1]==-1) pq.push({cur.x, cur.y, cur.cost+t, 1});
        } else {
            for(int i=0;i<4;i++) {
                Pos next = {cur.x, cur.y, cur.cost+1, 1};
                while(true) {
                    next.x += moveX[i];
                    next.y += moveY[i];
                    if(next.x<0 || next.x>=N || next.y<0 || next.y>=N) break;
                    if(m[next.x][next.y]!='#') continue;
                    if(visited[next.x][next.y][1]==-1) pq.push(next);
                    break;
                }
            }
            if(visited[cur.x][cur.y][0]==-1) pq.push({cur.x, cur.y, cur.cost, 0});
        }
    }
}