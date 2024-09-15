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
    int t; cin >> t;
    while(t-->0) {
        int w, h; cin >> w >> h;
        string m[h];
        for(int i=0;i<h;i++) {
            cin >> m[i];
        }

        bool visited[h][w];
        for(int i=0;i<h;i++) {
            for(int j=0;j<w;j++) {
                visited[i][j]=false;
            }
        }

        priority_queue<Pos> q;
        for(int i=0;i<h;i++) {
            for(int j=0;j<w;j++) {
                if(m[i][j]=='@') {
                    visited[i][j]=true;
                    q.push({i, j, 0, 0});
                } else if(m[i][j]=='*') {
                    m[i][j]='#';
                    q.push({i, j, 1, 0});
                }
            }
        }

        bool chk=true;
        while(!q.empty()) {
            Pos cur = q.top(); q.pop();
            if(cur.type==0 && m[cur.x][cur.y]=='#') continue;
            if(cur.type==0 && (cur.x==0 || cur.x==h-1 || cur.y==0 || cur.y==w-1)) {
                cout << cur.t+1 << '\n';
                chk=false;
                break;
            }

            for(int i=0;i<4;i++) {
                int nextX = cur.x+moveX[i];
                int nextY = cur.y+moveY[i];
                if(nextX<0 || nextX>=h || nextY<0 || nextY>=w || m[nextX][nextY]=='#') continue;
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
        if(chk) cout << "IMPOSSIBLE\n";
    }
}