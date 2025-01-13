#include<bits/stdc++.h>
using namespace std;

bool visited[100001];

struct pos {
    int x, cost;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int A, B, N, M; cin >> A >> B >> N >> M;

    queue<pos> q; q.push({N, 0});
    visited[N]=true;
    while(!q.empty()) {
        pos cur = q.front(); q.pop();
        if(cur.x==M) {
            cout << cur.cost;
            return 0;
        }
        if(cur.x-1>=0 && !visited[cur.x-1]) {
            visited[cur.x-1]=true;
            q.push({cur.x-1, cur.cost+1});
        }
        if(cur.x+1<=100000 && !visited[cur.x+1]) {
            visited[cur.x+1]=true;
            q.push({cur.x+1, cur.cost+1});
        }
        if(cur.x-A>=0 && !visited[cur.x-A]) {
            visited[cur.x-A]=true;
            q.push({cur.x-A, cur.cost+1});
        }
        if(cur.x+A<=100000 && !visited[cur.x+A]) {
            visited[cur.x+A]=true;
            q.push({cur.x+A, cur.cost+1});
        }
        if(cur.x-B>=0 && !visited[cur.x-B]) {
            visited[cur.x-B]=true;
            q.push({cur.x-B, cur.cost+1});
        }
        if(cur.x+B<=100000 && !visited[cur.x+B]) {
            visited[cur.x+B]=true;
            q.push({cur.x+B, cur.cost+1});
        }
        if(cur.x*A<=100000 && !visited[cur.x*A]) {
            visited[cur.x*A]=true;
            q.push({cur.x*A, cur.cost+1});
        }
        if(cur.x*B<=100000 && !visited[cur.x*B]) {
            visited[cur.x*B]=true;
            q.push({cur.x*B, cur.cost+1});
        }
    }
}