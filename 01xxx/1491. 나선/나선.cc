#include<bits/stdc++.h>
using namespace std;

bool vis[5000][5000];
int dx[] = {1, 0, -1, 0};
int dy[] = {0, 1, 0, -1};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;

    int cx=0, cy=0, idx=0, cnt=n*m-1;
    while(cnt) {
        vis[cx][cy]=true;
        int nx = cx+dx[idx];
        int ny = cy+dy[idx];
        if(nx<0 || nx>=n || ny<0 || ny>=m || vis[nx][ny]) {
            idx = (idx+1)%4;
        } else {
            cx=nx;
            cy=ny;
            cnt--;
        }
    }
    cout << cx << ' ' << cy;
}