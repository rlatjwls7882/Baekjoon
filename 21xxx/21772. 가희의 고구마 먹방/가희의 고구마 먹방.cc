#include<bits/stdc++.h>
using namespace std;

int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};

struct Pos {
    int x, y, t, goguma;
    set<pair<int, int>> ateGoguma;
};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int R, C, T; cin >> R >> C >> T;
    vector<string> map(R);
    for(int i=0;i<R;i++) cin >> map[i];

    queue<Pos> q;
    for(int i=0;i<R;i++) {
        for(int j=0;j<C;j++) {
            if(map[i][j]=='G') q.push({i, j, 0, 0});
        }
    }

    int maxGoguma=0;
    while(!q.empty()) {
        Pos cur = q.front(); q.pop();
        maxGoguma = max(maxGoguma, cur.goguma);
        if(cur.t==T) continue;

        for(int i=0;i<4;i++) {
            int nextX = cur.x+moveX[i];
            int nextY = cur.y+moveY[i];
            if(nextX<0 || nextX>=R || nextY<0 || nextY>=C || map[nextX][nextY]=='#') continue;
            Pos next = {nextX, nextY, cur.t+1, cur.goguma};
            for(auto lastAte:cur.ateGoguma) next.ateGoguma.insert(lastAte);

            if(map[nextX][nextY]=='S' && !next.ateGoguma.count({nextX, nextY})) {
                next.ateGoguma.insert({nextX, nextY});
                next.goguma++;
            }
            q.push(next);
        }
    }
    cout << maxGoguma;
}