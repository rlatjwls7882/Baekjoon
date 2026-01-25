#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acosl(-1);

int dx[] = {-1, 0, 1, 0};
int dy[] = {0, -1, 0, 1};

string s[1000];
ll vis[500][500][4];

struct element {
    ll x, y, t, dir;
    bool operator<(const element e) const {
        return t > e.t;
    }
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    ll n, m, t; cin >> n >> m >> t;

    priority_queue<element> pq;
    for(int i=0;i<n;i++) {
        cin >> s[i];
        for(int j=0;j<m;j++) {
            if('0'<=s[i][j] && s[i][j]<='3') {
                pq.push({i, j, 0, s[i][j]-'0'});
            }
        }
    }

    fill(&vis[0][0][0], &vis[499][499][4], LINF);
    while(!pq.empty()) {
        auto [x, y, tt, dir] = pq.top(); pq.pop();
        if(vis[x][y][dir]<=tt) continue;
        vis[x][y][dir]=tt;
        if(s[x][y]=='S') return !(cout << tt);

        for(int i=1;i<=3;i++) {
            element next = {x, y, tt+t*i, (dir+i)%4};
            if(vis[next.x][next.y][next.dir]<=next.t) continue;
            pq.push(next);
        }
        for(int i=1;i<=3;i+=2) {
            element next = {x+dx[(dir+i)%4], y+dy[(dir+i)%4], tt+1, dir};
            if(next.x<0 || next.x>=n || next.y<0 || next.y>=m || vis[next.x][next.y][next.dir]<=next.t) continue;
            while(s[next.x][next.y]=='T') {
                vis[next.x][next.y][next.dir]=next.t;
                next.dir=(next.dir+1)%4;
                next.x+=dx[next.dir];
                next.y+=dy[next.dir];
                if(next.x<0 || next.x>=n || next.y<0 || next.y>=m || vis[next.x][next.y][next.dir]<=next.t) break;
            }
            if(next.x<0 || next.x>=n || next.y<0 || next.y>=m) continue;
            if(s[next.x][next.y]!='T' && vis[next.x][next.y][next.dir]>next.t) pq.push(next);
        }
    }
    cout << -1;
}