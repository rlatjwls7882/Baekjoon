#include<bits/stdc++.h>
using namespace std;

bool visited[500][500] = {false, };
struct Pos {
    int x, y, c;
    bool operator<(const Pos a) const {
        return this->c > a.c;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int W, H; cin >> W >> H;
    string m[H];
    for(int i=0;i<H;i++) {
        cin >> m[i];
    }

    priority_queue<Pos> pq;
    for(int i=0;i<H;i++) {
        for(int j=0;j<W;j++) {
            if(m[i][j]=='T') pq.push({i, j, 0});
        }
    }

    while(!pq.empty()) {
        Pos cur = pq.top(); pq.pop();
        if(visited[cur.x][cur.y]) continue;
        visited[cur.x][cur.y]=true;

        if(m[cur.x][cur.y]=='E') {
            cout << cur.c;
            return 0;
        }

        int sum=0;
        Pos next = cur;
        next.x--;
        while(next.x>=0) {
            if(m[next.x][next.y]=='H' || m[next.x][next.y]=='E' || m[next.x][next.y]=='R') break;
            if(m[next.x][next.y]!='T') sum += m[next.x][next.y]-'0';
            next.x--;
        }
        if(next.x>=0 && m[next.x][next.y]!='H') {
            if(m[next.x][next.y]=='E') pq.push({next.x, next.y, cur.c+sum});
            else if(!visited[next.x+1][next.y]) pq.push({next.x+1, next.y, cur.c+sum});
        }

        sum=0;
        next = cur;
        next.x++;
        while(next.x<H) {
            if(m[next.x][next.y]=='H' || m[next.x][next.y]=='E' || m[next.x][next.y]=='R') break;
            if(m[next.x][next.y]!='T') sum += m[next.x][next.y]-'0';
            next.x++;
        }
        if(next.x<H && m[next.x][next.y]!='H') {
            if(m[next.x][next.y]=='E') pq.push({next.x, next.y, cur.c+sum});
            else if(!visited[next.x-1][next.y]) pq.push({next.x-1, next.y, cur.c+sum});
        }

        sum=0;
        next = cur;
        next.y--;
        while(next.y>=0) {
            if(m[next.x][next.y]=='H' || m[next.x][next.y]=='E' || m[next.x][next.y]=='R') break;
            if(m[next.x][next.y]!='T') sum += m[next.x][next.y]-'0';
            next.y--;
        }
        if(next.y>=0 && m[next.x][next.y]!='H') {
            if(m[next.x][next.y]=='E') pq.push({next.x, next.y, cur.c+sum});
            else if(!visited[next.x][next.y+1]) pq.push({next.x, next.y+1, cur.c+sum});
        }

        sum=0;
        next = cur;
        next.y++;
        while(next.y<W) {
            if(m[next.x][next.y]=='H' || m[next.x][next.y]=='E' || m[next.x][next.y]=='R') break;
            if(m[next.x][next.y]!='T') sum += m[next.x][next.y]-'0';
            next.y++;
        }
        if(next.y<W && m[next.x][next.y]!='H') {
            if(m[next.x][next.y]=='E') pq.push({next.x, next.y, cur.c+sum});
            else if(!visited[next.x][next.y-1]) pq.push({next.x, next.y-1, cur.c+sum});
        }
    }
    cout << -1;
}