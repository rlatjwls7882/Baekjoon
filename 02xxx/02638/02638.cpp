#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

int N, M;
int m[100][100];
int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};
bool outside[100][100];

void bfs(int x, int y) {
    queue<P> q; q.push(P(x, y));
    outside[x][y]=true;
    while(!q.empty()) {
        P cur = q.front(); q.pop();
        for(int i=0;i<4;i++) {
            int nextX = cur.first+moveX[i];
            int nextY = cur.second+moveY[i];
            if(nextX<0 || nextX>=N || nextY<0 || nextY>=M || m[nextX][nextY]==1 || outside[nextX][nextY]) continue;
            outside[nextX][nextY]=true;
            q.push(P(nextX, nextY));
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N >> M;

    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            cin >> m[i][j];
        }
    }

    for(int t=0;;t++) {
        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                outside[i][j]=false;
            }
        }
        bfs(0, 0);

        bool finish=true;
        for(int i=0;i<N && finish;i++) {
            for(int j=0;j<M && finish;j++) {
                if(m[i][j]) finish=false;
            }
        }
        if(finish) {
            cout << t;
            return 0;
        }

        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                if(m[i][j]) {
                    int cnt=0;
                    for(int k=0;k<4;k++) {
                        int nextX = i+moveX[k];
                        int nextY = j+moveY[k];
                        if(nextX<0 || nextX>=N || nextY<0 || nextY>=M || !outside[nextX][nextY]) continue;
                        cnt++;
                    }
                    if(cnt>=2) m[i][j]=0;
                }
            }
        }
    }
}