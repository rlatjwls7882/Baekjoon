#include<bits/stdc++.h>

using namespace std;

int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, -1, 1};
int sheep=0, wolf=0;
int R, C;
string _map[250];
bool visited[250][250] = {false, };

void bfs(int x, int y) {
    queue<pair<int, int>> q;
    q.push(make_pair(x, y));

    int curSheep=0, curWolf=0;
    while(!q.empty()) {
        pair<int, int> cur = q.front(); q.pop();
        if(visited[cur.first][cur.second]) {
            continue;
        }
        visited[cur.first][cur.second]=true;
        
        if(_map[cur.first][cur.second]=='v') {
            curWolf++;
        } else if(_map[cur.first][cur.second]=='k') {
            curSheep++;
        }

        for(int i=0;i<4;i++) {
            int nextX = cur.first+moveX[i];
            int nextY = cur.second+moveY[i];

            if(nextX<0 || nextX>=R || nextY<0 || nextY>=C || _map[nextX][nextY]=='#' || visited[nextX][nextY]) {
                continue;
            }
            q.push(make_pair(nextX, nextY));
        }
    }
    
    if(curSheep>curWolf) {
        sheep += curSheep;
    } else {
        wolf += curWolf;
    }
}

int main(void) {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    cin >> R >> C;
    for(int i=0;i<R;i++) {
        cin >> _map[i];
    }

    for(int i=0;i<R;i++) {
        for(int j=0;j<C;j++) {
            if(_map[i][j]!='#' && !visited[i][j]) {
                bfs(i, j);
            }
        }
    }
    cout << sheep << " " << wolf;
}