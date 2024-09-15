#include<bits/stdc++.h>
using namespace std;

int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};

struct Pos {
    int x, y, type, t;
    bool operator<(const Pos a) const {
        if(this->t==a.t) return this->type>a.type;
        return this->t>a.t;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int R, C; cin >> R >> C;
    string m[R];
    for(int i=0;i<R;i++) {
        cin >> m[i];
    }

    bool visited[R][C];
    for(int i=0;i<R;i++) {
        for(int j=0;j<C;j++) {
            visited[i][j]=false;
        }
    }

    priority_queue<Pos> q;
    for(int i=0;i<R;i++) {
        for(int j=0;j<C;j++) {
            if(m[i][j]=='J') {
                visited[i][j]=true;
                q.push({i, j, 0, 0});
            } else if(m[i][j]=='F') {
                m[i][j]='#';
                q.push({i, j, 1, 0});
            }
        }
    }

    while(!q.empty()) {
        Pos cur = q.top(); q.pop();
        if(cur.type==0 && m[cur.x][cur.y]=='#') continue;
        if(cur.type==0 && (cur.x==0 || cur.x==R-1 || cur.y==0 || cur.y==C-1)) {
            cout << cur.t+1;
            return 0;
        }

        for(int i=0;i<4;i++) {
            int nextX = cur.x+moveX[i];
            int nextY = cur.y+moveY[i];
            if(nextX<0 || nextX>=R || nextY<0 || nextY>=C || m[nextX][nextY]=='#') continue;
            if(cur.type==0) {
                if(!visited[nextX][nextY]) {
                    visited[nextX][nextY]=true;
                    q.push({nextX, nextY, 0, cur.t+1});
                }
            } else {
                m[nextX][nextY]='#';
                q.push({nextX, nextY, 1, cur.t+1});
            }
        }
    }
    cout << "IMPOSSIBLE";
}