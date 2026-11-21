#include<bits/stdc++.h>
using namespace std;

int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};

struct Node {
    int x, y, t;
    bool operator<(const Node a) const {
        return this->t>a.t;
    }
};

int N, M, T, D;
int h[25][25];
bool visited[25][25] = {false, };
int goBack[25][25];

void setGoBack() {
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            goBack[i][j]=100000000;
        }
    }
    priority_queue<Node> pq; pq.push({0, 0, 0});
    while(!pq.empty()) {
        Node cur = pq.top(); pq.pop();
        if(goBack[cur.x][cur.y]!=100000000) continue;
        goBack[cur.x][cur.y]=cur.t;
        for(int i=0;i<4;i++) {
            Node next = {cur.x+moveX[i], cur.y+moveY[i], cur.t};
            int move = h[next.x][next.y]-h[cur.x][cur.y];
            if(move>=0) next.t++;
            else next.t += pow(move, 2);
            if(next.x<0 || next.x>=N || next.y<0 || next.y>=M || goBack[next.x][next.y]!=100000000 || abs(move)>T || next.t>D) continue;
            pq.push(next);
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N >> M >> T >> D;
    string m[N];
    for(int i=0;i<N;i++) {
        cin >> m[i];
    }

    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            if(m[i][j]<='Z') h[i][j] = m[i][j]-'A';
            else h[i][j] = m[i][j]-'a'+26;
        }
    }
    setGoBack();

    int maxH = h[0][0];
    priority_queue<Node> q; q.push({0, 0, 0});
    while(!q.empty()) {
        Node cur = q.top(); q.pop();
        if(visited[cur.x][cur.y]) continue;
        maxH = max(maxH, h[cur.x][cur.y]);
        visited[cur.x][cur.y]=true;
        for(int i=0;i<4;i++) {
            Node next = {cur.x+moveX[i], cur.y+moveY[i], cur.t};
            int move = h[next.x][next.y]-h[cur.x][cur.y];
            if(move<=0) next.t++;
            else next.t += pow(move, 2);
            if(next.x<0 || next.x>=N || next.y<0 || next.y>=M || visited[next.x][next.y] || abs(move)>T || next.t+goBack[next.x][next.y]>D) continue;
            q.push(next);
        }
    }
    cout << maxH;
}