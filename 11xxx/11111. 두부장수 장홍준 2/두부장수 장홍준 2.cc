#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;
const int MAX = 2502;
const int S = MAX-2;
const int E = MAX-1;
const int score[6][6] = {
    {10, 8, 7, 5, 0, 1},
    {8, 6, 4, 3, 0, 1},
    {7, 4, 3, 2, 0, 1},
    {5, 3, 2, 2, 0, 1},
    {0, 0, 0, 0, 0, 0}, // E는 없음
    {1, 1, 1, 1, 0, 0},
};
char arr[50][50];
int f[MAX][MAX], cost[MAX][MAX], curCost[MAX], prv[MAX], inQueue[MAX];
vector<vector<int>> conn(MAX);
int dx[4] = {1, -1, 0, 0};
int dy[4] = {0, 0, 1, -1};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            cin >> arr[i][j];
        }
    }

    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            int cur = i*m+j;
            if(i%2==j%2) {
                conn[S].push_back(cur); // 순방향
                conn[cur].push_back(S); // 역방향
                f[S][cur]=-1;
                for(int k=0;k<4;k++) {
                    int nx = i+dx[k];
                    int ny = j+dy[k];
                    if(nx<0 || nx>=n || ny<0 || ny>=m) continue;

                    int next = nx*m+ny;
                    conn[cur].push_back(next); // 순방향
                    conn[next].push_back(cur); // 역방향
                    f[cur][next] = -1;
                    cost[cur][next] = -score[arr[i][j]-'A'][arr[nx][ny]-'A']; // 순방향
                    cost[next][cur] = score[arr[i][j]-'A'][arr[nx][ny]-'A']; // 역방향
                }
            } else {
                conn[cur].push_back(E); // 순방향
                conn[E].push_back(cur); // 역방향
                f[cur][E]=-1;
            }
        }
    }

    int totalCost=0;
    while(true) {
        queue<int> q; q.push(S);
        memset(prv, -1, sizeof prv);
        fill(curCost, curCost+MAX, INF);
        inQueue[S]=true;
        curCost[S]=0;
        while(!q.empty()) {
            int cur = q.front(); q.pop();
            inQueue[cur] = false;
            for(int next:conn[cur]) {
                if(-f[cur][next]>0 && curCost[next]>curCost[cur]+cost[cur][next]) {
                    prv[next] = cur;
                    curCost[next] = curCost[cur]+cost[cur][next];
                    if(!inQueue[next]) {
                        inQueue[next]=true;
                        q.push(next);
                    }
                }
            }
        }
        if(curCost[E]>0) break;

        for(int i=E;i!=S;i=prv[i]) {
            f[prv[i]][i]++;
            f[i][prv[i]]--;
        }
        totalCost += curCost[E];
    }
    cout << -totalCost;
}