#include<bits/stdc++.h>
using namespace std;

int D;
long long cnt=0;
bool visited[100000] = {false, };
vector<vector<int>> connect(100000);

int dfs(int cur, int depth) {
    int maxDepth=depth;
    visited[cur]=true;
    for(int next:connect[cur]) {
        if(!visited[next]) {
            maxDepth = max(maxDepth, dfs(next, depth+1));
        }
    }
    if(maxDepth>=depth+D) cnt+=2;
    return maxDepth;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, S; cin >> N >> S >> D;
    for(int i=0;i<N-1;i++) {
        int x, y; cin >> x >> y;
        connect[x-1].push_back(y-1);
        connect[y-1].push_back(x-1);
    }
    dfs(S-1, 0);
    cout << max(0LL, cnt-2);
}