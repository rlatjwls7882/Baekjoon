#include<bits/stdc++.h>
using namespace std;

int N, sharkX, sharkY, sharkSize=2, curCnt=0;
int arr[20][20] = {0, };
int moveX[4] = {-1, 0, 0, 1};
int moveY[4] = {0, -1, 1, 0};

struct Pos {
    int x, y, cost;
    Pos(int x, int y, int cost) {
        this->x=x;
        this->y=y;
        this->cost=cost;
    }
};

Pos findNear() {
    bool visited[N*N] = {false, };
    queue<Pos> q; q.push(Pos(sharkX, sharkY, 0));
    visited[sharkX*N+sharkY]=true;
    int curCost=0, posX=1000, posY=-1;
    while(!q.empty()) {
        Pos curPos = q.front(); q.pop();
        // 같은 거리에 있는 작은 물고기 전부 탐색 후 제일 왼쪽 위에 있는 물고기의 위치 반환
        if(curPos.cost==curCost && posY!=-1) {
            if(++curCnt==sharkSize) {
                curCnt=0;
                sharkSize++;
            }
            return Pos(posX, posY, curCost);
        }
        for(int i=0;i<4;i++) {
            Pos nextPos = Pos(curPos.x+moveX[i], curPos.y+moveY[i], curPos.cost+1);
            if(nextPos.x<0 || nextPos.x>=N || nextPos.y<0 || nextPos.y>=N || visited[nextPos.x*N+nextPos.y] || arr[nextPos.x][nextPos.y]>sharkSize) continue;
            if(0<arr[nextPos.x][nextPos.y] && arr[nextPos.x][nextPos.y]<sharkSize) {
                if(posX>nextPos.x || posX==nextPos.x && posY>nextPos.y) {
                    posX=nextPos.x;
                    posY=nextPos.y;
                }
            }
            curCost = nextPos.cost;
            visited[nextPos.x*N+nextPos.y]=true;
            q.push(nextPos);
        }
    }
    return Pos(-1, -1, -1);
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N;
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            cin >> arr[i][j];
            if(arr[i][j]==9) {
                sharkX=i;
                sharkY=j;
                arr[i][j]=0;
            }
        }
    }

    int t=0;
    while(true) {
        Pos nextPos = findNear();
        if(nextPos.cost==-1) {
            cout << t;
            return 0;
        }
        
        arr[nextPos.x][nextPos.y]=0;
        sharkX = nextPos.x;
        sharkY = nextPos.y;
        t += nextPos.cost;
    }
}