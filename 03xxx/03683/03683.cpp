#include<bits/stdc++.h>
using namespace std;

int A[500];
bool visited[500];
vector<vector<int>> conn(500);

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
    int t; cin >> t;
    while(t-->0) {
        int c, d, v; cin >> c >> d >> v;
        for(int i=0;i<v;i++) conn[i].clear();
        vector<pair<string, string>> inp(v);
        for(int i=0;i<v;i++) {
            cin >> inp[i].first >> inp[i].second;
            for(int j=0;j<i;j++) {
                if(inp[i].first.compare(inp[j].second)==0 || inp[i].second.compare(inp[j].first)==0) {
                    conn[i].push_back(j);
                    conn[j].push_back(i);
                }
            }
        }

        int cut=0;
        memset(A, -1, sizeof(A));
        for(int i=0;i<v;i++) {
            if(A[i]==-1) {
                memset(visited, false, sizeof(visited));
                if(dfs(i)) cut++;
            }
        }
        cout << v-cut << '\n';
    }
}