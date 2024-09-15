#include<bits/stdc++.h>
using namespace std;

bool visited[50][50][2] = {false, };

struct Pos {
    int x, y, type, move;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    string m[N];
    for(int i=0;i<N;i++) {
        cin >> m[i];
    }

    Pos S = {-1, -1, -1, -1}, E = {-1, -1, -1, -1};
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            if(S.x==-1 && m[i][j]=='B') {
                if(i+1<N && m[i+1][j]=='B') S = {i, j, 0, 0};
                else S = {i, j, 1, 0};
            } else if(E.x==-1 && m[i][j]=='E') {
                if(i+1<N && m[i+1][j]=='E') E = {i, j, 0, 0};
                else E = {i, j, 1, 0};
            }
        }
    }
    queue<Pos> q; q.push(S);
    visited[S.x][S.y][S.type]=true;
    while(!q.empty()) {
        Pos cur = q.front(); q.pop();
        if(cur.x==E.x && cur.y==E.y && cur.type==E.type) {
            cout << cur.move;
            return 0;
        }
        if(cur.type==0) {
            // 오른쪽
            if(cur.x+2<N && cur.y+1<N && !visited[cur.x][cur.y+1][0] && m[cur.x][cur.y+1]!='1' && m[cur.x+1][cur.y+1]!='1' && m[cur.x+2][cur.y+1]!='1') {
                visited[cur.x][cur.y+1][0]=true;
                q.push({cur.x, cur.y+1, 0, cur.move+1});
            }
            // 왼쪽
            if(cur.x+2<N && cur.y-1>=0 && !visited[cur.x][cur.y-1][0] && m[cur.x][cur.y-1]!='1' && m[cur.x+1][cur.y-1]!='1' && m[cur.x+2][cur.y-1]!='1') {
                visited[cur.x][cur.y-1][0]=true;
                q.push({cur.x, cur.y-1, 0, cur.move+1});
            }
            // 위쪽
            if(cur.x-1>=0 && !visited[cur.x-1][cur.y][0] && m[cur.x-1][cur.y]!='1') {
                visited[cur.x-1][cur.y][0]=true;
                q.push({cur.x-1, cur.y, 0, cur.move+1});
            }
            // 아래쪽
            if(cur.x+3<N && !visited[cur.x+1][cur.y][0] && m[cur.x+3][cur.y]!='1') {
                visited[cur.x+1][cur.y][0]=true;
                q.push({cur.x+1, cur.y, 0, cur.move+1});
            }
            // 회전
            if(0<=cur.y-1 && cur.y+1<N && cur.x+2<N && !visited[cur.x+1][cur.y-1][1] && m[cur.x][cur.y-1]!='1' && m[cur.x][cur.y+1]!='1' && m[cur.x+1][cur.y-1]!='1' && m[cur.x+1][cur.y+1]!='1' && m[cur.x+2][cur.y-1]!='1' && m[cur.x+2][cur.y+1]!='1') {
                visited[cur.x+1][cur.y-1][1]=true;
                q.push({cur.x+1, cur.y-1, 1, cur.move+1});
            }
        } else {
            // 오른쪽
            if(cur.y+3<N && !visited[cur.x][cur.y+1][1] && m[cur.x][cur.y+3]!='1') {
                visited[cur.x][cur.y+1][1]=true;
                q.push({cur.x, cur.y+1, 1, cur.move+1});
            }
            // 왼쪽
            if(cur.y-1>=0 && !visited[cur.x][cur.y-1][1] && m[cur.x][cur.y-1]!='1') {
                visited[cur.x][cur.y-1][1]=true;
                q.push({cur.x, cur.y-1, 1, cur.move+1});
            }
            // 위쪽
            if(cur.y<N && cur.x-1>=0 && !visited[cur.x-1][cur.y][1] && m[cur.x-1][cur.y]!='1' && m[cur.x-1][cur.y+1]!='1' && m[cur.x-1][cur.y+2]!='1') {
                visited[cur.x-1][cur.y][1]=true;
                q.push({cur.x-1, cur.y, 1, cur.move+1});
            }
            // 아래쪽
            if(cur.y+2<N && cur.x+1<N && !visited[cur.x+1][cur.y][1] && m[cur.x+1][cur.y]!='1' && m[cur.x+1][cur.y+1]!='1' && m[cur.x+1][cur.y+2]!='1') {
                visited[cur.x+1][cur.y][1]=true;
                q.push({cur.x+1, cur.y, 1, cur.move+1});
            }
            // 회전
            if(0<=cur.x-1 && cur.x+1<N && cur.y+2<N && !visited[cur.x-1][cur.y+1][0] && m[cur.x-1][cur.y]!='1' && m[cur.x+1][cur.y]!='1' && m[cur.x-1][cur.y+1]!='1' && m[cur.x+1][cur.y+1]!='1' && m[cur.x-1][cur.y+2]!='1' && m[cur.x+1][cur.y+2]!='1') {
                visited[cur.x-1][cur.y+1][0]=true;
                q.push({cur.x-1, cur.y+1, 0, cur.move+1});
            }
        }
    }
    cout << 0;
}