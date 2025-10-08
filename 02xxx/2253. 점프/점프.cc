#include<bits/stdc++.h>
using namespace std;

bool notUse[10001];
bool visited[10001][10001];

struct element {
    int pos, cnt, x;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    while(m--) {
        int small; cin >> small;
        notUse[small]=true;
    }

    queue<element> q; q.push({1, 0, 0});
    while(!q.empty()) {
        auto cur = q.front(); q.pop();
        if(cur.pos==n) {
            cout << cur.cnt;
            return 0;
        }

        int nextPos = cur.pos+cur.x-1;
        if(cur.x>=2 && nextPos<=n && !notUse[nextPos] && !visited[nextPos][cur.x-1]) {
            visited[nextPos][cur.x-1]=true;
            q.push({nextPos, cur.cnt+1, cur.x-1});
        }

        nextPos = cur.pos+cur.x;
        if(cur.x>=1 && nextPos<=n && !notUse[nextPos] && !visited[nextPos][cur.x]) {
            visited[nextPos][cur.x]=true;
            q.push({nextPos, cur.cnt+1, cur.x});
        }

        nextPos = cur.pos+cur.x+1;
        if(nextPos<=n && !notUse[nextPos] && !visited[nextPos][cur.x+1]) {
            visited[nextPos][cur.x+1]=true;
            q.push({nextPos, cur.cnt+1, cur.x+1});
        }
    }
    cout << -1;
}