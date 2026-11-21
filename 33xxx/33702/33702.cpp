#include<bits/stdc++.h>
using namespace std;

int cnt;
bool visited[3][3];
int dx[4] = {1, -1, 0, 0};
int dy[4] = {0, 0, 1, -1};

void back(int depth, int x, int y) {
    if(depth==8) {
        cnt++;
        return;
    }

    visited[x][y]=true;
    for(int i=0;i<4;i++) {
        int nx = x+dx[i];
        int ny = y+dy[i];
        if(nx<0 || nx>=3 || ny<0 || ny>=3 || visited[nx][ny]) continue;
        back(depth+1, nx, ny);
    }
    visited[x][y]=false;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int k; cin >> k;
    back(0, (k-1)/3, (k-1)%3);
    cout << cnt;
}