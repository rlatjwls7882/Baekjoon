#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, D; cin >> N >> D;
    vector<vector<pair<int, int>>> conn(D+1);
    while(N-->0) {
        int s, e, l; cin >> s >> e >> l;
        if(e<=D) conn[s].push_back({e, l});
    }

    int visited[D+1]; fill(visited, visited+D+1, 1000000000);
    visited[0]=0;
    for(int i=0;i<D;i++) {
        visited[i+1] = min(visited[i+1], visited[i]+1);
        for(auto next:conn[i]) {
            visited[next.first] = min(visited[next.first], visited[i]+next.second);
        }
    }
    cout << visited[D];
}