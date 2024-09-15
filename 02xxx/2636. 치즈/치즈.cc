#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

int N, M;
int m[100][100];
bool outside[100][100];
int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};
void bfs() {
    queue<P> q; q.push(P(0, 0));
    outside[0][0]=true;
    while(!q.empty()) {
        P cur = q.front(); q.pop();
        for(int i=0;i<4;i++) {
            int nextX = cur.first+moveX[i];
            int nextY = cur.second+moveY[i];
            if(nextX<0 || nextX>=N || nextY<0 || nextY>=M || outside[nextX][nextY] || m[nextX][nextY]) continue;
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

    int lastSize=0;
    for(int t=0;;t++) {
        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                outside[i][j]=false;
            }
        }
        bfs();

        int cnt=0;
        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                if(m[i][j]) cnt++;
            }
        }

        if(cnt==0) {
            cout << t << '\n' << lastSize;
            return 0;
        }
        lastSize=cnt;

        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                if(m[i][j]) {
                    bool chk=false;
                    for(int k=0;k<4;k++) {
                        int nextX = i+moveX[k];
                        int nextY = j+moveY[k];
                        if(nextX<0 || nextX>=N || nextY<0 || nextY>=M || !outside[nextX][nextY]) continue;
                        chk=true;
                        break;
                    }
                    if(chk) m[i][j]=0;
                }
            }
        }
    }
}