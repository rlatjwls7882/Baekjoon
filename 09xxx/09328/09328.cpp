#include<bits/stdc++.h>
using namespace std;

string board[100];
bool visited[100][100];
int dx[] = {0, 0, 1, -1};
int dy[] = {1, -1, 0, 0};

struct pos {
    int x, y;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n, m; cin >> n >> m;
        for(int i=0;i<n;i++) cin >> board[i];
        string inputed_keys; cin >> inputed_keys;
        memset(visited, 0, sizeof visited);

        vector<pos> locked; // 갈 수 없는 잠긴 곳
        set<char> keys; // 가지고 있는 열쇠
        if(inputed_keys[0]!='0') for(char key : inputed_keys) keys.insert(key);
        queue<pos> q;
        for(int i=0;i<n;i++) {
            if(board[i][0]!='*') {
                q.push({i, 0});
                visited[i][0]=true;
            }
            if(board[i][m-1]!='*') {
                q.push({i, m-1});
                visited[i][m-1]=true;
            }
        }
        for(int i=1;i<m-1;i++) {
            if(board[0][i]!='*') {
                q.push({0, i});
                visited[0][i]=true;
            }
            if(board[n-1][i]!='*') {
                q.push({n-1, i});
                visited[n-1][i]=true;
            }
        }

        int cnt=0;
        while(true) {
            while(!q.empty()) {
                pos cur = q.front(); q.pop();
                if(board[cur.x][cur.y]=='$') cnt++;
                else if('a'<=board[cur.x][cur.y] && board[cur.x][cur.y]<='z') keys.insert(board[cur.x][cur.y]);
                else if('A'<=board[cur.x][cur.y] && board[cur.x][cur.y]<='Z' && !keys.count(board[cur.x][cur.y]+32)) {
                    locked.push_back({cur.x, cur.y});
                    continue;
                }
                for(int i=0;i<4;i++) {
                    pos next = {cur.x+dx[i], cur.y+dy[i]};
                    if(next.x<0 || next.x>=n || next.y<0 || next.y>=m || board[next.x][next.y]=='*' || visited[next.x][next.y]) continue;
                    visited[next.x][next.y]=true;
                    q.push(next);
                }
            }
            bool change=false;
            for(int i=0;i<locked.size();i++) {
                if(keys.count(board[locked[i].x][locked[i].y]+32)) {
                    change=true;
                    q.push({locked[i].x, locked[i].y});
                    locked.erase(locked.begin()+i);
                    i--;
                }
            }
            if(!change) break;
        }
        cout << cnt << '\n';
    }
}