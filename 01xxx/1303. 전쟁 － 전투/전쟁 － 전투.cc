#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

int N, M;
string m[100];
int moveX[4] = {0, 0, 1, -1};
int moveY[4] = {1, -1, 0, 0};
bool visited[100][100] = {false, };

int bfs(int x, int y) {
    queue<P> q; q.push(P(x, y));
    visited[x][y]=true;
    int cnt=1;
    while(!q.empty()) {
        P cur = q.front(); q.pop();
        for(int i=0;i<4;i++) {
            P next = P(cur.first+moveX[i], cur.second+moveY[i]);
            if(next.first<0 || next.first>=M || next.second<0 || next.second>=N || visited[next.first][next.second] || m[cur.first][cur.second]!=m[next.first][next.second]) continue;
            visited[next.first][next.second]=true;
            cnt++;
            q.push(next);
        }
    }
    return cnt;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N >> M;
    for(int i=0;i<M;i++) {
        cin >> m[i];
    }

    int sumW=0, sumB=0;
    for(int i=0;i<M;i++) {
        for(int j=0;j<N;j++) {
            if(!visited[i][j]) {
                int cnt = bfs(i, j);
                if(m[i][j]=='W') sumW += cnt*cnt;
                else sumB += cnt*cnt;
            }
        }
    }
    cout << sumW << ' ' << sumB;
}