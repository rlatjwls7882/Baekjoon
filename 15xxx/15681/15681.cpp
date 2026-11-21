#include <bits/stdc++.h>
using namespace std;

vector<vector<int>> connect = vector<vector<int>>(100001);
int cnt[100001] = {0, };

int dfs(int cur) {
    cnt[cur]++;
    for(int next:connect[cur]) {
        if(!cnt[next]) {
            cnt[cur] += dfs(next);
        }
    }
    return cnt[cur];
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, R, Q; cin >> N >> R >> Q;
    for(int i=0;i<N-1;i++) {
        int u, v; cin >> u >> v;
        connect[u].push_back(v);
        connect[v].push_back(u);
    }

    dfs(R);

    while(Q-->0) {
        int u; cin >> u;
        cout << cnt[u] << '\n';
    }
}