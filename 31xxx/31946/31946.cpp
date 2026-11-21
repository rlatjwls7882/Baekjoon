#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);\
    int N, M; cin >> N >> M;
    int arr[N][M];
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            cin >> arr[i][j];
        }
    }
    int X; cin >> X;

    bool visited[N][M];
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            visited[i][j]=false;
        }
    }

    queue<P> q; q.push(P(0, 0));
    while(!q.empty()) {
        P cur = q.front(); q.pop();
        if(visited[cur.first][cur.second]) continue;
        visited[cur.first][cur.second]=true;

        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                if(abs(cur.first-i)+abs(cur.second-j)<=X && arr[i][j]==arr[0][0]) {
                    q.push(P(i, j));
                }
            }
        }
    }
    
    if(visited[N-1][M-1]) cout << "ALIVE";
    else cout << "DEAD";
}