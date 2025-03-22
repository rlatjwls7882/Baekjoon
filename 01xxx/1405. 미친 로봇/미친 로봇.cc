#include<bits/stdc++.h>
using namespace std;

typedef long double ld;

bool visited[29][29]; // 방문했는지 확인할 배열
int moveX[4] = {1, -1, 0, 0}; // (동, 서, 남, 북)
int moveY[4] = {0, 0, 1, -1};
ld n, percent[4], total;

void back(int depth, int x, int y, ld cur) {
    if(depth==n) { // 방문 횟수가 끝나면 이번 단순 이동의 확률 추가
        total += cur;
        return;
    }

    visited[x][y]=true;
    for(int i=0;i<4;i++) { // 직접 움직여보면서 단순한 이동 찾기
        int nx = x+moveX[i];
        int ny = y+moveY[i];
        if(!visited[nx][ny]) {
            back(depth+1, nx, ny, cur*percent[i]);
        }
    }
    visited[x][y]=false;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n;
    for(int i=0;i<4;i++) { // 네 방향의 확률 입력
        cin >> percent[i];
        percent[i] /= 100;
    }
    back(0, 14, 14, 1);
    cout << setprecision(9) << fixed << total;
}