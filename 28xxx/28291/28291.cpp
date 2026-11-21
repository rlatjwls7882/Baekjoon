#include<bits/stdc++.h>
using namespace std;

int block[50][50], visited[50][50];

int dx[4] = {1, -1, 0, 0};
int dy[4] = {0, 0, 1, -1};

struct pos {
    int x, y;
};

vector<pos> lamp;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int w, h, n; cin >> w >> h >> n;

    queue<pos> q;
    while(n--) {
        string s; int x, y; cin >> s >> x >> y;
        if(s[9]=='b') {
            block[x][y]=1;
            q.push({x, y});
            visited[x][y]=16;
        } else if(s[9]=='d') {
            block[x][y]=2;
        } else {
            block[x][y]=3;
            lamp.push_back({x, y});
        }
    }

    while(!q.empty()) {
        auto cur = q.front(); q.pop();

        for(int i=0;i<4;i++) {
            pos next = {cur.x + dx[i], cur.y + dy[i]};
            if(next.x<0 || next.x>=w || next.y<0 || next.y>=h || visited[next.x][next.y]) continue;
            visited[next.x][next.y] = visited[cur.x][cur.y]-1;
            if(visited[next.x][next.y] && block[next.x][next.y]==2) q.push(next);
        }
    }

    for(auto l : lamp) {
        if(!visited[l.x][l.y]) {
            cout << "failed";
            return 0;
        }
    }
    cout << "success";
}