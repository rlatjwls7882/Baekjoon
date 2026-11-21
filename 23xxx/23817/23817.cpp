#include<bits/stdc++.h>
using namespace std;

int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};

struct Pos {
    int x, c, match;
    set<int> visited;

    bool operator<(const Pos a) const {
        return this->c > a.c;
    }
};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    string s[N];
    for(int i=0;i<N;i++) {
        cin >> s[i];
    }

    vector<vector<Pos>> conn(N*M);
    int start;
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            if(s[i][j]=='S') start=i*M+j;
            if(s[i][j]=='S'|| s[i][j]=='K') {
                queue<Pos> q; q.push({i*M+j, 0});
                bool visited[N][M]; memset(visited, false, sizeof(visited));
                visited[i][j]=true;
                while(!q.empty()) {
                    Pos cur = q.front(); q.pop();
                    int x = cur.x/M;
                    int y = cur.x%M;
                    if((x!=i || y!=j) && (s[x][y]=='S' || s[x][y]=='K')) {
                        conn[i*M+j].push_back({x*M+y, cur.c});
                    }
                    for(int k=0;k<4;k++) {
                        int nextX = x+moveX[k];
                        int nextY = y+moveY[k];
                        if(nextX<0 || nextX>=N || nextY<0 || nextY>=M || visited[nextX][nextY] || s[nextX][nextY]=='X') continue;
                        visited[nextX][nextY]=true;
                        q.push({nextX*M+nextY, cur.c+1});
                    }
                }
            }
        }
    }

    priority_queue<Pos> pq;
    Pos cur = {start, 0, 0};
    cur.visited.insert(start);
    pq.push(cur);
    while(!pq.empty()) {
        cur = pq.top(); pq.pop();
        if(cur.match==5) {
            cout << cur.c;
            return 0;
        }
        for(Pos next:conn[cur.x]) {
            if(cur.visited.count(next.x)) continue;
            Pos nextPos = {next.x, cur.c+next.c, cur.match+1};
            nextPos.visited = cur.visited;
            nextPos.visited.insert(next.x);
            pq.push(nextPos);
        }
    }
    cout << -1;
}