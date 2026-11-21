#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

int N, M;
int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};
int m[8][8];
vector<P> virus;

int bfs() {
    queue<P> q;
    for(P val:virus) {
        q.push(val);
    }
    
    bool visited[N*M] = {false, };
    while(!q.empty()) {
        P cur = q.front(); q.pop();
        
        for(int i=0;i<4;i++) {
            P next = P(cur.first+moveX[i], cur.second+moveY[i]);
            if(next.first<0 || next.first>=N || next.second<0 || next.second>=M || m[next.first][next.second]!=0 || visited[next.first*M+next.second]) continue;
            visited[next.first*M+next.second]=true;
            q.push(next);
        }
    }

    int cnt=0;
    for(int i=0;i<N*M;i++) {
        if(!visited[i] && m[i/M][i%M]==0) {
            cnt++;
        }
    }
    return cnt;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N >> M;

    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            cin >> m[i][j];
            if(m[i][j]==2) {
                virus.push_back(P(i, j));
            }
        }
    }

    int maxCnt=0;
    for(int i=0;i<N*M;i++) {
        if(m[i/M][i%M]==0) {
            m[i/M][i%M]=1;
            for(int j=i+1;j<N*M;j++) {
                if(m[j/M][j%M]==0) {
                    m[j/M][j%M]=1;
                        for(int k=j+1;k<N*M;k++) {
                            if(m[k/M][k%M]==0) {
                                m[k/M][k%M]=1;
                                maxCnt = max(maxCnt, bfs());
                                m[k/M][k%M]=0;
                            }
                        }
                    m[j/M][j%M]=0;
                }
            }
            m[i/M][i%M]=0;
        }
    }
    cout << maxCnt;
}