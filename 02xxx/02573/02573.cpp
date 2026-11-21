#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

int N, M;
int m[90000];
int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};
bool visited[90000];

void bfs(int x, int y) {
    queue<P> q; q.push(P(x, y));
    while(!q.empty()) {
        P cur = q.front(); q.pop();
        for(int i=0;i<4;i++) {
            P next = P(cur.first+moveX[i], cur.second+moveY[i]);
            if(next.first<0 || next.first>=N || next.second<0 || next.second>=M || visited[next.first*M+next.second] || !m[next.first*M+next.second]) continue;
            q.push(next);
            visited[next.first*M+next.second]=true;
        }
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N >> M;
    for(int i=0;i<N*M;i++) {
        cin >> m[i];
    }

    for(int t=1;;t++) {
        int nextM[N*M] = {0, };
        for(int i=0;i<N*M;i++) {
            if(m[i]) {
                int cnt=0;
                for(int j=0;j<4;j++) {
                    int nextX = i/M+moveX[j];
                    int nextY = i%M+moveY[j];
                    if(nextX<0 || nextX>=N || nextY<0 || nextY>=M || m[nextX*M+nextY]) continue;
                    cnt++;
                }
                nextM[i] = max(0, m[i]-cnt);
            }
        }

        fill(visited, visited+N*M, false);
        memcpy(&m, &nextM, sizeof(nextM));
        int cnt=0;
        for(int i=0;i<N*M;i++) {
            if(nextM[i] && !visited[i]) {
                bfs(i/M, i%M);
                cnt++;
            }
        }

        if(cnt==0) {
            cout << 0;
            return 0;
        } else if(cnt>=2) {
            cout << t;
            return 0;
        }
    }
}