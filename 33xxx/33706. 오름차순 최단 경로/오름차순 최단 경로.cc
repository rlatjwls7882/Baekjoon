#include<bits/stdc++.h>
using namespace std;

const int MAX = 200000;

int n, m;
int visited[MAX];
vector<vector<int>> conn(MAX);

string bfs() {
    visited[0]=true;
    queue<int> q; q.push(0);
    while(!q.empty()) {
        int cur = q.front(); q.pop();
        for(int next:conn[cur]) {
            if(!visited[next]) {
                visited[next]=true;
                q.push(next);
            }
        }
    }
    
    for(int i=0;i<n;i++) {
        if(!visited[i]) {
            return "NO";
        }
    }
    return "YES";
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m;
    while(m--) {
        int a, b; cin >> a >> b;
        conn[min(a, b)-1].push_back(max(a, b)-1);
    }
    cout << bfs();
}