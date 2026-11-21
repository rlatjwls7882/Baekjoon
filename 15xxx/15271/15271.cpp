#include <bits/stdc++.h>
using namespace std;

int A[201];
bool visited[201];
vector<vector<int>> conn(201);

bool dfs(int cur) {
    visited[cur]=true;
    for(int next:conn[cur]) {
        if(A[next]==-1 || !visited[A[next]] && dfs(A[next])) {
            A[next]=cur;
            A[cur]=next;
            return true;
        }
    }
    return false;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, M; cin >> N >> M;
    while(M--) {
        int u, v; cin >> u >> v;
        if(u%2!=v%2) {
            conn[u].push_back(v);
            conn[v].push_back(u);
        }
    }

    int cnt=0;
    memset(A, -1, sizeof A);
    for(int i=1;i<=N;i++) {
        if(A[i]==-1) {
            memset(visited, 0, sizeof visited);
            A[i]=i;
            if(dfs(i)) cnt+=2;
            else A[i]=-1;
        }
    }
    cout << min(cnt+1, N);
}