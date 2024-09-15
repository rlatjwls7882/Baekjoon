#include<bits/stdc++.h>
using namespace std;

int moveX[8] = {1, 1, 1, 0, 0, -1, -1, -1};
int moveY[8] = {-1, 0, 1, -1, 1, -1, 0, 1};
string m[3];
bool visited[3][3];
string minString="CCC";

void dfs(int depth, int x, int y, string s) {
    if(depth==3) {
        if(minString.compare(s)>0) minString=s;
        return;
    }
    visited[x][y]=true;
    for(int i=0;i<8;i++) {
        int nextX = x+moveX[i];
        int nextY = y+moveY[i];
        if(nextX<0 || nextX>=3 || nextY<0 || nextY>=3 || visited[nextX][nextY]) continue;
        dfs(depth+1, nextX, nextY, s+m[nextX][nextY]);
    }
    visited[x][y]=false;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    for(int i=0;i<3;i++) cin >> m[i];
    for(int i=0;i<3;i++) {
        for(int j=0;j<3;j++) {
            dfs(0, i, j, "");
        }
    }
    cout << minString;
}