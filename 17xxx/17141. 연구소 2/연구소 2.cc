#include<bits/stdc++.h>
using namespace std;
typedef pair<int, int> P;

int N, M, minCost = 25000;
int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};
int m[50][50];
bool visited[50][50] = {false, };

struct Pos {
    int x, y, cost;
};
vector<Pos> virus, active;

void back(int depth, int pos) {
    if(depth==M) {
        queue<Pos> q;
        for(int i=0;i<M;i++) {
            q.push(active[i]);
            visited[active[i].x][active[i].y]=true;
        }
        int t=0, remain=0;
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                if(m[i][j]==0 && !visited[i][j]) {
                    remain++;
                }
            }
        }
        while(!q.empty()) {
            Pos cur = q.front(); q.pop();
            if(remain==0) {
                minCost = min(minCost, t);
                break;
            }

            for(int i=0;i<4;i++) {
                int nextX = cur.x+moveX[i];
                int nextY = cur.y+moveY[i];
                if(nextX<0 || nextX>=N || nextY<0 || nextY>=N || visited[nextX][nextY] || m[nextX][nextY]==1) continue;
                q.push({nextX, nextY, cur.cost+1});
                if(m[nextX][nextY]==0) remain--;
                visited[nextX][nextY]=true;
                t = max(t, cur.cost+1);
            }
        }
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                visited[i][j]=false;
            }
        }
        return;
    }
    for(int i=pos;i<virus.size();i++) {
        active.push_back(virus[i]);
        back(depth+1, i+1);
        active.pop_back();
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N >> M;
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            cin >> m[i][j];
            if(m[i][j]==2) {
                virus.push_back({i, j, 0});
                m[i][j]=0;
            }
        }
    }
    back(0, 0);

    if(minCost==25000) cout << -1;
    else cout << minCost;
}