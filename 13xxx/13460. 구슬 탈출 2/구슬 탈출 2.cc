#include<bits/stdc++.h>
using namespace std;

bool visited[10][10][10][10] = {false, };

struct Pos {
    int Rx, Ry, Bx, By, move;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;

    string m[N];
    for(int i=0;i<N;i++) {
        cin >> m[i];
    }

    pair<int, int> e;
    Pos cur; cur.move=0;
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            if(m[i][j]=='R') {
                cur.Rx=i;
                cur.Ry=j;
            } else if(m[i][j]=='B') {
                cur.Bx=i;
                cur.By=j;
            } else if(m[i][j]=='O') {
                e.first=i;
                e.second=j;
            }
        }
    }

    queue<Pos> q; q.push(cur);
    visited[cur.Rx][cur.Ry][cur.Bx][cur.By]=true;
    while(!q.empty()) {
        cur = q.front(); q.pop();

        if(cur.Rx==e.first && cur.Ry==e.second && !(cur.Bx==e.first && cur.By==e.second)) {
            cout << cur.move;
            return 0;
        }
        if(cur.move>10) {
            cout << -1;
            return 0;
        }

        // 오른쪽
        Pos next = cur; next.move++;
        while(true) {
            bool change=false;
            if(cur.By>cur.Ry) {
                if(!(next.Bx==e.first && next.By==e.second) && m[next.Bx][next.By+1]!='#') {
                    next.By++;
                    change=true;
                }
                if(!(next.Rx==e.first && next.Ry==e.second) && m[next.Rx][next.Ry+1]!='#' && !(next.Rx==next.Bx && next.Ry+1==next.By)) {
                    next.Ry++;
                    change=true;
                }
            } else {
                if(!(next.Rx==e.first && next.Ry==e.second) && m[next.Rx][next.Ry+1]!='#') {
                    next.Ry++;
                    change=true;
                }
                if(!(next.Bx==e.first && next.By==e.second) && m[next.Bx][next.By+1]!='#' && !(next.Rx==next.Bx && next.Ry==next.By+1)) {
                    next.By++;
                    change=true;
                }
            }
            if(!change) break;
        }
        if(!(next.Rx==e.first && next.Ry==e.second && next.Bx==next.Rx && next.By+1==next.Ry) && !visited[next.Rx][next.Ry][next.Bx][next.By]) {
            visited[next.Rx][next.Ry][next.Bx][next.By]=true;
            q.push(next);
        }

        // 왼쪽
        next = cur; next.move++;
        while(true) {
            bool change=false;
            if(cur.By<cur.Ry) {
                if(!(next.Bx==e.first && next.By==e.second) && m[next.Bx][next.By-1]!='#') {
                    next.By--;
                    change=true;
                }
                if(!(next.Rx==e.first && next.Ry==e.second) && m[next.Rx][next.Ry-1]!='#' && !(next.Rx==next.Bx && next.Ry-1==next.By)) {
                    next.Ry--;
                    change=true;
                }
            } else {
                if(!(next.Rx==e.first && next.Ry==e.second) && m[next.Rx][next.Ry-1]!='#') {
                    next.Ry--;
                    change=true;
                }
                if(!(next.Bx==e.first && next.By==e.second) && m[next.Bx][next.By-1]!='#' && !(next.Rx==next.Bx && next.Ry==next.By-1)) {
                    next.By--;
                    change=true;
                }
            }
            if(!change) break;
        }
        if(!(next.Rx==e.first && next.Ry==e.second && next.Bx==next.Rx && next.By-1==next.Ry) && !visited[next.Rx][next.Ry][next.Bx][next.By]) {
            visited[next.Rx][next.Ry][next.Bx][next.By]=true;
            q.push(next);
        }

        // 위쪽
        next = cur; next.move++;
        while(true) {
            bool change=false;
            if(cur.Bx<cur.Rx) {
                if(!(next.Bx==e.first && next.By==e.second) && m[next.Bx-1][next.By]!='#') {
                    next.Bx--;
                    change=true;
                }
                if(!(next.Rx==e.first && next.Ry==e.second) && m[next.Rx-1][next.Ry]!='#' && !(next.Rx-1==next.Bx && next.Ry==next.By)) {
                    next.Rx--;
                    change=true;
                }
            } else {
                if(!(next.Rx==e.first && next.Ry==e.second) && m[next.Rx-1][next.Ry]!='#') {
                    next.Rx--;
                    change=true;
                }
                if(!(next.Bx==e.first && next.By==e.second) && m[next.Bx-1][next.By]!='#' && !(next.Rx==next.Bx-1 && next.Ry==next.By)) {
                    next.Bx--;
                    change=true;
                }
            }
            if(!change) break;
        }
        if(!(next.Rx==e.first && next.Ry==e.second && next.Bx-1==next.Rx && next.By==next.Ry) && !visited[next.Rx][next.Ry][next.Bx][next.By]) {
            visited[next.Rx][next.Ry][next.Bx][next.By]=true;
            q.push(next);
        }

        // 아래쪽
        next = cur; next.move++;
        while(true) {
            bool change=false;
            if(cur.Bx>cur.Rx) {
                if(!(next.Bx==e.first && next.By==e.second) && m[next.Bx+1][next.By]!='#') {
                    next.Bx++;
                    change=true;
                }
                if(!(next.Rx==e.first && next.Ry==e.second) && m[next.Rx+1][next.Ry]!='#' && !(next.Rx+1==next.Bx && next.Ry==next.By)) {
                    next.Rx++;
                    change=true;
                }
            } else {
                if(!(next.Rx==e.first && next.Ry==e.second) && m[next.Rx+1][next.Ry]!='#') {
                    next.Rx++;
                    change=true;
                }
                if(!(next.Bx==e.first && next.By==e.second) && m[next.Bx+1][next.By]!='#' && !(next.Rx==next.Bx+1 && next.Ry==next.By)) {
                    next.Bx++;
                    change=true;
                }
            }
            if(!change) break;
        }
        if(!(next.Rx==e.first && next.Ry==e.second && next.Bx+1==next.Rx && next.By==next.Ry) && !visited[next.Rx][next.Ry][next.Bx][next.By]) {
            visited[next.Rx][next.Ry][next.Bx][next.By]=true;
            q.push(next);
        }
    }
    cout << -1;
}