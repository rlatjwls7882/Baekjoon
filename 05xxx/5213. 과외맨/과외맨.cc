#include<bits/stdc++.h>
using namespace std;

struct tile {
    int a, b, tileNum;
};

tile tiles[500][500];
bool visited[500][500];

struct pos {
    int x, y, cnt;
};

pos prv[500][500];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    int tileCnt=0;
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            if(i%2==1 && j==n-1) break;
            cin >> tiles[i][j].a >> tiles[i][j].b;
            tiles[i][j].tileNum = ++tileCnt;
        }
    }

    queue<pos> q; q.push({0, 0, 1});
    visited[0][0]=true;
    prv[0][0] = {-1, -1};
    pos remMaxNum = {-1, -1};
    while(!q.empty()) {
        pos cur = q.front(); q.pop();
        if(remMaxNum.x==-1 || tiles[remMaxNum.x][remMaxNum.y].tileNum<tiles[cur.x][cur.y].tileNum) remMaxNum = cur;

        // 오른쪽
        if(cur.y+1<n && tiles[cur.x][cur.y].b==tiles[cur.x][cur.y+1].a && !visited[cur.x][cur.y+1]) {
            q.push({cur.x, cur.y+1, cur.cnt+1});
            prv[cur.x][cur.y+1] = {cur.x, cur.y};
            visited[cur.x][cur.y+1]=true;
        }

        // 왼쪽
        if(cur.y-1>=0 && tiles[cur.x][cur.y].a==tiles[cur.x][cur.y-1].b && !visited[cur.x][cur.y-1]) {
            q.push({cur.x, cur.y-1, cur.cnt+1});
            prv[cur.x][cur.y-1] = {cur.x, cur.y};
            visited[cur.x][cur.y-1]=true;
        }

        // 위쪽
        if(cur.x%2==0) {
            if(cur.x-1>=0 && tiles[cur.x][cur.y].b==tiles[cur.x-1][cur.y].a && !visited[cur.x-1][cur.y]) {
                q.push({cur.x-1, cur.y, cur.cnt+1});
                prv[cur.x-1][cur.y] = {cur.x, cur.y};
                visited[cur.x-1][cur.y]=true;
            }
            if(cur.x-1>=0 && cur.y-1>=0 && tiles[cur.x][cur.y].a==tiles[cur.x-1][cur.y-1].b && !visited[cur.x-1][cur.y-1]) {
                q.push({cur.x-1, cur.y-1, cur.cnt+1});
                prv[cur.x-1][cur.y-1] = {cur.x, cur.y};
                visited[cur.x-1][cur.y-1]=true;
            }
        } else {
            if(cur.x-1>=0 && tiles[cur.x][cur.y].a==tiles[cur.x-1][cur.y].b && !visited[cur.x-1][cur.y]) {
                q.push({cur.x-1, cur.y, cur.cnt+1});
                prv[cur.x-1][cur.y] = {cur.x, cur.y};
                visited[cur.x-1][cur.y]=true;
            }
            if(cur.x-1>=0 && cur.y+1<n && tiles[cur.x][cur.y].b==tiles[cur.x-1][cur.y+1].a && !visited[cur.x-1][cur.y+1]) {
                q.push({cur.x-1, cur.y+1, cur.cnt+1});
                prv[cur.x-1][cur.y+1] = {cur.x, cur.y};
                visited[cur.x-1][cur.y+1]=true;
            }
        }

        // 아래쪽
        if(cur.x%2==0) {
            if(cur.x+1<n && tiles[cur.x][cur.y].b==tiles[cur.x+1][cur.y].a && !visited[cur.x+1][cur.y]) {
                q.push({cur.x+1, cur.y, cur.cnt+1});
                prv[cur.x+1][cur.y] = {cur.x, cur.y};
                visited[cur.x+1][cur.y]=true;
            }
            if(cur.x+1<n && cur.y-1>=0 && tiles[cur.x][cur.y].a==tiles[cur.x+1][cur.y-1].b && !visited[cur.x+1][cur.y-1]) {
                q.push({cur.x+1, cur.y-1, cur.cnt+1});
                prv[cur.x+1][cur.y-1] = {cur.x, cur.y};
                visited[cur.x+1][cur.y-1]=true;
            }
        } else {
            if(cur.x+1<n && tiles[cur.x][cur.y].a==tiles[cur.x+1][cur.y].b && !visited[cur.x+1][cur.y]) {
                q.push({cur.x+1, cur.y, cur.cnt+1});
                prv[cur.x+1][cur.y] = {cur.x, cur.y};
                visited[cur.x+1][cur.y]=true;
            }
            if(cur.x+1<n && cur.y+1<n && tiles[cur.x][cur.y].b==tiles[cur.x+1][cur.y+1].a && !visited[cur.x+1][cur.y+1]) {
                q.push({cur.x+1, cur.y+1, cur.cnt+1});
                prv[cur.x+1][cur.y+1] = {cur.x, cur.y};
                visited[cur.x+1][cur.y+1]=true;
            }
        }
    }

    stack<pos> stk;
    pos cur = remMaxNum;
    while(true) {
        stk.push(cur);
        cur = prv[cur.x][cur.y];
        if(cur.x==-1 && cur.y==-1) break;
    }

    cout << stk.size() << '\n';
    while(!stk.empty()) {
        cout << tiles[stk.top().x][stk.top().y].tileNum << ' '; stk.pop();
    }
}