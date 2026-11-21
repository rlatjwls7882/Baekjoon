#include<bits/stdc++.h>
using namespace std;

int R, C, K, cnt=0;
string m[5];
bool visited[5][5] = {false, };
int moveX[4] = {0, 0, 1, -1};
int moveY[4] = {1, -1, 0, 0};

void dfs(int depth, int x, int y) {
    if(depth==K) {
        if(x==0 && y==C-1) cnt++;
        return;
    }

    for(int i=0;i<4;i++) {
        int nextX = moveX[i]+x;
        int nextY = moveY[i]+y;
        if(nextX<0 || nextX>=R || nextY<0 || nextY>=C || m[nextX][nextY]=='T' || visited[nextX][nextY]) continue;
        visited[nextX][nextY]=true;
        dfs(depth+1, nextX, nextY);
        visited[nextX][nextY]=false;
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> R >> C >> K;
    for(int i=0;i<R;i++) {
        cin >> m[i];
    }

    visited[R-1][0]=true;
    dfs(1, R-1, 0);
    cout << cnt;
}