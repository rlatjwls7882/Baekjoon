#include<bits/stdc++.h>
using namespace std;

int cnt;
bool visited[500001];
vector<vector<int>> conn(500001);

void dfs(int cur=1, int len=0) {
    visited[cur]=true;
    int child=0;
    for(int next:conn[cur]) {
        if(!visited[next]) {
            dfs(next, len+1);
            child++;
        }
    }
    if(child==0) cnt += len;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N; cin >> N;
    for(int i=0;i<N-1;i++) {
        int u, v; cin >> u >> v;
        conn[u].push_back(v);
        conn[v].push_back(u);
    }
    dfs();
    cout << (cnt%2==1?"Yes":"No");
}