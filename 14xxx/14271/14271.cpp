#include<bits/stdc++.h>
using namespace std;

int dx[] = {1, -1, 0, 0};
int dy[] = {0, 0, 1, -1};
bool vis[3051][3051];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;

    int cnt=0;
    queue<pair<int, int>> q;
    for(int i=0;i<n;i++) {
        string s; cin >> s;
        for(int j=0;j<m;j++) {
            if(s[j]=='o') {
                q.push({i+1500, j+1500});
                vis[i+1500][j+1500]=true;
                cnt++;
            }
        }
    }

    int k; cin >> k;
    while(k--) {
        queue<pair<int, int>> nq;
        while(!q.empty()) {
            auto [x, y] = q.front(); q.pop();
            for(int i=0;i<4;i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                if(!vis[nx][ny]) {
                    nq.push({nx, ny});
                    vis[nx][ny]=true;
                    cnt++;
                }
            }
        }
        q=nq;
    }
    cout << cnt;
}