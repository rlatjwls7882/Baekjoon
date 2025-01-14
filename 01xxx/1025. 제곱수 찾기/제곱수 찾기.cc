#include<bits/stdc++.h>
using namespace std;

int N, M, res=-1;
int moveX[8] = {1, 1, 1, 0, 0, -1, -1, -1};
int moveY[8] = {-1, 0, 1, -1, 1, -1, 0, 1};
string s[9];

void back(int x, int y, int dir, int val, int weightX, int weightY) {
    int nx = x+moveX[dir]*weightX;
    int ny = y+moveY[dir]*weightY;
    if(pow((int)sqrt(val), 2)==val) res = max(res, val);
    if(nx<0 || nx>=N || ny<0 || ny>=M) return;
    back(nx, ny, dir, val*10+s[nx][ny]-'0', weightX, weightY);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> N >> M;
    for(int i=0;i<N;i++) cin >> s[i];
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            for(int k=0;k<8;k++) {
                for(int weightX=1;weightX<=N;weightX++) {
                    for(int weightY=1;weightY<=M;weightY++) {
                        back(i, j, k, s[i][j]-'0', weightX, weightY);
                    }
                }
            }
        }
    }
    cout << res;
}