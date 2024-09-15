#include <bits/stdc++.h>
using namespace std;

int moveX[4] = {0, 0, 1, -1};
int moveY[4] = {1, -1, 0, 0};
bool visited[50][50][2501] = {false, };

struct Pos {
    int x, y, pass, around;
    bool operator<(const Pos a) const {
        if(this->pass == a.pass) return this->around > a.around;
        return this->pass > a.pass;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    string s[N];
    for(int i=0;i<N;i++) {
        cin >> s[i];
    }

    pair<int, int> start, end;
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            if(s[i][j]=='S') start={i, j};
            else if(s[i][j]=='F') end={i, j};
        }
    }

    priority_queue<Pos> pq; pq.push({start.first, start.second, 0, 0});
    while(!pq.empty()) {
        Pos cur = pq.top(); pq.pop();
        if(visited[cur.x][cur.y][cur.pass]) continue;
        for(int i=cur.pass;i<=2500;i++) visited[cur.x][cur.y][i]=true;
        if(cur.x==end.first && cur.y==end.second) {
            cout << cur.pass << ' ' << cur.around;
            return 0;
        }

        for(int i=0;i<4;i++) {
            int nextX = cur.x+moveX[i];
            int nextY = cur.y+moveY[i];
            if(nextX<0 || nextX>=N || nextY<0 || nextY>=M) continue;
            int nextPass = cur.pass;
            int nextAround = cur.around;
            if(s[nextX][nextY]=='g') nextPass++;
            if(s[nextX][nextY]=='.') {
                for(int j=0;j<4;j++) {
                    int xx = nextX+moveX[j];
                    int yy = nextY+moveY[j];
                    if(xx<0 || xx>=N || yy<0 || yy>=M) continue;
                    if(s[xx][yy]=='g') {
                        nextAround++;
                        break;
                    }
                }
            }
            if(visited[nextX][nextY][nextPass]) continue;
            pq.push({nextX, nextY, nextPass, nextAround});
        }
    }
}