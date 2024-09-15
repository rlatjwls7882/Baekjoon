#include<bits/stdc++.h>

using namespace std;

int moveX[8] = {-1, 0, 1, -1, -1, 0, 1};
int moveY[8] = {1, 1, 1, 0, -1, -1, -1};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    string map[N];
    for(int i=0;i<N;i++) {
        cin >> map[i];
    }

    queue<pair<int, int>> q;
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            if(map[i][j]=='F') {
                q.push(make_pair(i, j));
                break;
            }
        }
        if(!q.empty()) {
            break;
        }
    }

    bool visited[N][N];
    for(int i=0;i<N;i++) {
        fill(visited[i], visited[i]+N, false);
    }

    int cnt=-1;
    while(!q.empty()) {
        pair<int, int> cur = q.front(); q.pop();
        if(visited[cur.first][cur.second]) {
            continue;
        }
        cnt++;
        visited[cur.first][cur.second]=true;

        for(int i=0;i<8;i++) {
            pair<int, int> next = make_pair(cur.first+moveX[i], cur.second+moveY[i]);
            if(next.first<0 || next.first>=N || next.second<0 || next.second>=N || visited[next.first][next.second] || map[next.first][next.second]=='#') {
                continue;
            }
            q.push(next);
        }
    }
    cout << cnt;
}