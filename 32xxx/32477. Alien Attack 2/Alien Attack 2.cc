#include<bits/stdc++.h>
using namespace std;

int maxCnt;
bool visited[200000];
vector<vector<int>> conn(200000);

int dfs(int cur) {
    visited[cur]=true;
    int sum=1;
    for(int next:conn[cur]) {
        if(!visited[next]) sum += dfs(next);
    }
    return sum;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    while(m-->0) {
        int i, j; cin >> i >> j;
        conn[i-1].push_back(j-1);
        conn[j-1].push_back(i-1);
    }

    for(int i=0;i<n;i++) {
        if(!visited[i]) maxCnt = max(maxCnt, dfs(i));
    }
    cout << maxCnt;
}