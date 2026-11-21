#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;

int minCost[100][100][3], board[100][100];
int dx[4] = {0, 0, 1, -1};
int dy[4] = {1, -1, 0, 0};

struct element {
    int x, y, cnt, cost;
    bool operator<(const element e) const {
        return cost > e.cost;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, t; cin >> n >> t;
    for(int i=0;i<n;i++) for(int j=0;j<n;j++) cin >> board[i][j];

    fill(&minCost[0][0][0], &minCost[99][99][3], INF);
    priority_queue<element> pq; pq.push({0, 0, 0, 0});
    while(!pq.empty()) {
        auto [x, y, cnt, cost] = pq.top(); pq.pop();
        if(cost>=minCost[x][y][cnt]) continue;
        minCost[x][y][cnt]=cost;
        for(int i=0;i<4;i++) {
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx<0 || nx>=n || ny<0 || ny>=n) continue;
            int nCost = minCost[x][y][cnt] + (cnt+1==3 ? board[nx][ny] : 0) + t;
            if(minCost[nx][ny][(cnt+1)%3]>nCost) pq.push({nx, ny, (cnt+1)%3, nCost});
        }
    }
    cout << *min_element(minCost[n-1][n-1], minCost[n-1][n-1]+3);
}