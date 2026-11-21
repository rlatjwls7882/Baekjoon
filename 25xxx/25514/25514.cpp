#include<bits/stdc++.h>
using namespace std;

int arr[5][5];
int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};

struct Node {
    int x, y, c;
};

Node bfs(Node in) {
    queue<Node> q; q.push(in);
    bool visited[5][5]; fill(&visited[0][0], &visited[4][5], false);
    visited[in.x][in.y]=true;
    while(!q.empty()) {
        auto cur = q.front(); q.pop();
        if(arr[cur.x][cur.y] == arr[in.x][in.y]+1) return cur;

        // 한칸 이동
        for(int i=0;i<4;i++) {
            Node next = {cur.x+moveX[i], cur.y+moveY[i], cur.c+1};
            if(next.x<0 || next.x>=5 || next.y<0 || next.y>=5 || visited[next.x][next.y] || arr[next.x][next.y]==-1) continue;
            visited[next.x][next.y]=true;
            q.push(next);
        }

        // 뛰어가기
        for(int i=0;i<4;i++) {
            Node next = {cur.x+moveX[i], cur.y+moveY[i], cur.c+1};
            while(0<=next.x && next.x<=4 && 0<=next.y && next.y<=4 && arr[next.x][next.y]!=7 && arr[next.x][next.y]!=-1) next.x+=moveX[i], next.y+=moveY[i];
            if(next.x<0 || next.x>=5 || next.y<0 || next.y>=5 || arr[next.x][next.y]==-1) next.x-=moveX[i], next.y-=moveY[i];
            if(visited[next.x][next.y] || arr[next.x][next.y]==-1) continue;
            visited[next.x][next.y]=true;
            q.push(next);
        }
    }
    return {-1, -1, -1};
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    for(int i=0;i<5;i++) for(int j=0;j<5;j++) cin >> arr[i][j];
    int r, c; cin >> r >> c;

    Node node = {r, c, 0};
    for(int i=0;i<6;i++) {
        node = bfs(node);
        if(node.c==-1) break;
    }
    cout << node.c;
}