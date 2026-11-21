#include<bits/stdc++.h>
using namespace std;

int cnt=0;
bool visited[1000000] = {false, };
vector<vector<int>> conn(1000000);

bool dfs(int cur) {
    visited[cur]=true;
    bool ret=true;
    for(int next:conn[cur]) {
        if(!visited[next]) {
            ret &= dfs(next);
        }
    }
    if(!ret) cnt++;
    return !ret;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    while(n-->1) {
        int u, v; cin >> u >> v;
        conn[u-1].push_back(v-1);
        conn[v-1].push_back(u-1);
    }
    dfs(0);
    cout << cnt;
}