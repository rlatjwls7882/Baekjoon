#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;

struct pos {
    int x, y;
};

int cost[100][100];
int dx[] = {0, 0, 1, -1};
int dy[] = {1, -1, 0, 0};
vector<string> board(100);
vector<vector<pos>> prv(100, vector<pos>(100));

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int h, w; cin >> h >> w;

    pos start;
    for(int i=0;i<h;i++) {
        cin >> board[i];
        for(int j=0;j<w;j++) {
            if(board[i][j]=='@') {
                start = {i, j};
            }
        }
    }

    pos finish = {-1, -1};
    fill(&cost[0][0], &cost[99][100], INF);
    queue<pos> q; q.push(start);
    cost[start.x][start.y]=0;
    while(!q.empty()) {
        auto cur = q.front(); q.pop();
        if(cur.x==0 || cur.x==h-1 || cur.y==0 || cur.y==w-1) {
            finish = cur;
            break;
        }
        for(int i=0;i<4;i++) {
            pos next = {cur.x+dx[i], cur.y+dy[i]};
            if(next.x<0 || next.x>=h || next.y<0 || next.y>=w || cost[next.x][next.y]!=INF || board[next.x][next.y]!='.') continue;
            prv[next.x][next.y] = cur;
            cost[next.x][next.y] = cost[cur.x][cur.y]+1;
            q.push(next);
        }
    }

    if(finish.x==-1) {
        cout << "-1\n";
    } else {
        cout << cost[finish.x][finish.y] << '\n';
        while(finish.x!=start.x || finish.y!=start.y) {
            board[finish.x][finish.y]='*';
            finish = prv[finish.x][finish.y];
        }
    }
    for(int i=0;i<h;i++) cout << board[i] << '\n';
}