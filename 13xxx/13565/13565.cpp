#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

int moveX[4] = {0, 0, 1, -1};
int moveY[4] = {1, -1, 0, 0};
bool visited[1000][1000] = {0, };

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int M, N; cin >> M >> N;
    string m[M];
    for(int i=0;i<M;i++) {
        cin >> m[i];
    }

    queue<P> q;
    for(int i=0;i<N;i++) {
        if(m[0][i]=='0') q.push(P(0, i));
    }

    while(!q.empty()) {
        P cur = q.front(); q.pop();
        if(visited[cur.first][cur.second]) continue;
        visited[cur.first][cur.second]=true;

        for(int i=0;i<4;i++) {
            P next = P(cur.first+moveX[i], cur.second+moveY[i]);
            if(next.first<0 || next.first>=M || next.second<0 || next.second>=N || visited[next.first][next.second] || m[next.first][next.second]=='1') continue;
            q.push(next);
        }
    }

    for(int i=0;i<N;i++) {
        if(visited[M-1][i]) {
            cout << "YES";
            return 0;
        }
    }
    cout << "NO";
}