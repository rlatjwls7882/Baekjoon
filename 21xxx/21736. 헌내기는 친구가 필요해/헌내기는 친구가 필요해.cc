#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

bool visited[600][600] = {false, };
int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    string m[N];
    for(int i=0;i<N;i++) {
        cin >> m[i];
    }

    queue<P> q;
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            if(m[i][j]=='I') {
                q.push(P(i, j));
            }
        }
    }

    int cnt=0;
    while(!q.empty()) {
        P cur = q.front(); q.pop();
        if(visited[cur.first][cur.second]) continue;
        visited[cur.first][cur.second]=true;
        if(m[cur.first][cur.second]=='P') cnt++;

        for(int i=0;i<4;i++) {
            P next = P(cur.first+moveX[i], cur.second+moveY[i]);
            if(next.first<0 || next.first>=N || next.second<0 || next.second>=M || m[next.first][next.second]=='X') continue;
            q.push(next);
        }
    }

    if(cnt) cout << cnt;
    else cout << "TT";
}