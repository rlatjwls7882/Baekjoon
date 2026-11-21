#include<bits/stdc++.h>
using namespace std;

struct Emo {
    int val, clipBoard, cnt;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int S; cin >> S;

    int visited[S+1][S+1];
    for(int i=0;i<=S;i++) {
        for(int j=0;j<=S;j++) {
            visited[i][j]=false;
        }
    }
    visited[1][0]=true;
    queue<Emo> q; q.push({1, 0, 0});
    while(!q.empty()) {
        Emo cur = q.front(); q.pop();
        if(cur.val==S) {
            cout << cur.cnt;
            return 0;
        }
        if(!visited[cur.val][cur.val]) {
            visited[cur.val][cur.val]=true;
            q.push({cur.val, cur.val, cur.cnt+1});
        }
        if(cur.val+cur.clipBoard<=S && !visited[cur.val+cur.clipBoard][cur.clipBoard]) {
            visited[cur.val+cur.clipBoard][cur.clipBoard]=true;
            q.push({cur.val+cur.clipBoard, cur.clipBoard, cur.cnt+1});
        }
        if(cur.val>1 && !visited[cur.val-1][cur.clipBoard]) {
            visited[cur.val-1][cur.clipBoard]=true;
            q.push({cur.val-1, cur.clipBoard, cur.cnt+1});
        }
    }
}