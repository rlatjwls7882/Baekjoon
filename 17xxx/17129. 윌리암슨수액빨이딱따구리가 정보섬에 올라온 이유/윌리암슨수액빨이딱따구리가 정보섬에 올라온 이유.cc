#include<bits/stdc++.h>
using namespace std;

int moveX[] = {1, -1, 0, 0};
int moveY[] = {0, 0, 1, -1};
bool visited[3000][3000];
string board[3000];

struct pos {
    int x, y, cost;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;

    queue<pos> q;
    for(int i=0;i<n;i++) {
        cin >> board[i];
        for(int j=0;j<m;j++) {
            if(board[i][j]=='2') {
                q.push({i, j, 0});
                visited[i][j]=true;
            }
        }
    }

    while(!q.empty()) {
        pos cur = q.front(); q.pop();
        for(int i=0;i<4;i++) {
            pos next = {cur.x+moveX[i], cur.y+moveY[i], cur.cost+1};
            if(next.x<0 || next.x>=n || next.y<0 || next.y>=m || visited[next.x][next.y] || board[next.x][next.y]=='1') continue;
            if(board[next.x][next.y]>='3') {
                cout << "TAK\n" << next.cost;
                return 0;
            }
            visited[next.x][next.y]=true;
            q.push(next);
        }
    }
    cout << "NIE";
}