#include <bits/stdc++.h>
using namespace std;

vector<vector<pair<int, int>>> connect;
bool visited[1001];

int dfs(int cur) {
    if(visited[cur]) return 0;
    visited[cur]=true;
    if(cur!=1 && connect[cur].size()==1) return connect[cur][0].second;

    int sum=0;
    for(pair<int, int> next:connect[cur]) {
        sum += min(dfs(next.first), next.second);
    }
    return sum;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        int N, M; cin >> N >> M;
        connect = vector<vector<pair<int, int>>>(N+1);
        fill(visited, visited+N+1, false);

        while(M-->0) {
            int a, b, c; cin >> a >> b >> c;
            connect[a].push_back(make_pair(b, c));
            connect[b].push_back(make_pair(a, c));
        }
        cout << dfs(1) << '\n';
    }
}