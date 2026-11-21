#include<bits/stdc++.h>
using namespace std;

int dx[] = {1, -1, 0, 0};
int dy[] = {0, 0, 1, -1};
bool cow[10000], vis[10000];
vector<unordered_set<int>> notConn(10000);

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k, r; cin >> n >> k >> r;
    while(r--) {
        int a, b, c, d; cin >> a >> b >> c >> d;
        int u = (a-1)*n+b-1;
        int v = (c-1)*n+d-1;
        notConn[u].insert(v);
        notConn[v].insert(u);
    }

    while(k--) {
        int a, b; cin >> a >> b;
        cow[(a-1)*n+b-1]=true;
    }

    int cnt=0;
    for(int i=0;i<n*n;i++) {
        if(cow[i]) {
            memset(vis, 0, sizeof vis);
            vis[i]=true;
            queue<int> q; q.push(i);
            while(!q.empty()) {
                int cur = q.front(); q.pop();
                int x=cur/n, y=cur%n;
                for(int j=0;j<4;j++) {
                    int nx = x+dx[j];
                    int ny = y+dy[j];
                    int next = nx*n+ny;
                    if(nx<0 || nx>=n || ny<0 || ny>=n || vis[next] || notConn[cur].count(next)) continue;
                    vis[next]=true;
                    q.push(next);
                }
            }

            for(int j=0;j<n*n;j++) {
                if(cow[j] && !vis[j]) cnt++;
            }
        }
    }
    cout << cnt/2;
}