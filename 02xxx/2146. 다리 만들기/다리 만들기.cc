#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

int N;
int m[100][100];
int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};
int visited[100][100] = {0, };
void bfs(int x, int y, int cnt) {
    queue<P> q; q.push(P(x, y));
    visited[x][y]=cnt;
    while(!q.empty()) {
        P cur = q.front(); q.pop();
        for(int i=0;i<4;i++) {
            int nextX = cur.first+moveX[i];
            int nextY = cur.second+moveY[i];
            if(nextX<0 || nextX>=N || nextY<0 || nextY>=N || !m[nextX][nextY] || visited[nextX][nextY]) continue;
            visited[nextX][nextY]=cnt;
            q.push(P(nextX, nextY));
        }
    }
}


int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N;
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            cin >> m[i][j];
        }
    }

    int cnt=0;
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            if(m[i][j] && !visited[i][j]) {
                bfs(i, j, ++cnt);
            }
        }
    }

    int minLen=10000;
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            if(visited[i][j]) {
                for(int k=i;k<N;k++) {
                    for(int l=0;l<N;l++) {
                        if(k==i && l==0) {
                            l=j+1;
                            if(l>=N) break;
                        }
                        if(visited[k][l] && visited[i][j]!=visited[k][l]) {
                            minLen = min(abs(i-k)+abs(j-l)-1, minLen);
                        }
                    }
                }
            }
        }
    }
    cout << minLen;
}