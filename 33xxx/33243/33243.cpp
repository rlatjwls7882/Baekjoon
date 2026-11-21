#include<bits/stdc++.h>
using namespace std;

int idx;
bool visited[100000];
int maxCnt, cnt[1000000];
vector<vector<int>> conn(1000000);
map<string, int> nodeNum;

void dfs(int cur, int depth) {
    visited[cur]=true;
    maxCnt = max(maxCnt, ++cnt[depth]);
    for(int next:conn[cur]) {
        if(!visited[next]) {
            dfs(next, depth+1);
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    string par; cin >> par;
    nodeNum[par]=idx++;

    while(n-->1) {
        string u, tmp, v; cin >> u >> tmp >> v;
        if(!nodeNum.count(u)) nodeNum[u]=idx++;
        if(!nodeNum.count(v)) nodeNum[v]=idx++;
        conn[nodeNum[u]].push_back(nodeNum[v]);
        conn[nodeNum[v]].push_back(nodeNum[u]);
    }
    dfs(0, 0);
    cout << maxCnt;
}