#include<bits/stdc++.h>
using namespace std;

const int M = 1000001;
vector<vector<int>> conn(M);
vector<bool> visited(M);

int nodeCnt, edgeCnt;
void dfs(int cur) {
    visited[cur]=true;
    nodeCnt++, edgeCnt+=conn[cur].size();
    for(int next:conn[cur]) {
        if(!visited[next]) dfs(next);
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    vector<vector<int>> input(2, vector<int>(n));
    for(int i=0;i<2;i++) {
        for(int j=0;j<n;j++) {
            cin >> input[i][j];
        }
    }

    for(int i=0;i<n;i++) {
        conn[input[0][i]].push_back(input[1][i]);
        conn[input[1][i]].push_back(input[0][i]);
    }

    int total=0;
    for(int i=0;i<M;i++) {
        if(!visited[i] && conn[i].size()) {
            nodeCnt=edgeCnt=0;
            dfs(i);
            total += min(nodeCnt, edgeCnt/2);
        }
    }
    cout << total;
}