#include<bits/stdc++.h>
using namespace std;

bool visited[100];
vector<vector<int>> conn(100);

struct pos {
    int x, y;
};

bool dfs(int cur, int to) {
    visited[cur]=true;
    bool chk=false;
    if(cur==to) return true;
    for(int next:conn[cur]) {
        if(!visited[next]) chk |= dfs(next, to);
    }
    return chk;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;

    vector<pos> list;
    while(n-->0) {
        int a, x, y; cin >> a >> x >> y;
        if(a==1) {
            for(int i=0;i<list.size();i++) {
                if(x<list[i].x && list[i].x<y || x<list[i].y && list[i].y<y) conn[i].push_back(list.size());
                if(list[i].x<x && x<list[i].y || list[i].x<y && y<list[i].y) conn[list.size()].push_back(i);
            }
            list.push_back({x, y});
        } else {
            memset(visited, false, sizeof(visited));
            cout << dfs(x-1, y-1) << '\n';
        }
    }
}