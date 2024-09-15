#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

int moveX[8] = {1, -1, 0, 0, 1, -1, 1, -1};
int moveY[8] = {0, 0, 1, -1, 1, 1, -1, -1};
bool visited[100][70] = {false, };

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;

    int m[N][M];
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            cin >> m[i][j];
        }
    }

    int cnt=0;
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            if(!visited[i][j] && m[i][j]!=0) {
                bool chk=true;
                queue<P> q; q.push(P(i, j));
                visited[i][j]=true;
                while(!q.empty()) {
                    P cur = q.front(); q.pop();
                    for(int k=0;k<8;k++) {
                        P next = P(cur.first+moveX[k], cur.second+moveY[k]);
                        if(next.first<0 || next.first>=N || next.second<0 || next.second>=M) continue;
                        if(m[next.first][next.second]>m[i][j]) {
                            chk=false;
                        } else if(m[next.first][next.second]==m[i][j] && !visited[next.first][next.second]) {
                            q.push(next);
                            visited[next.first][next.second]=true;
                        }
                    }
                }
                if(chk) cnt++;
            }
        }
    }
    cout << cnt;
}