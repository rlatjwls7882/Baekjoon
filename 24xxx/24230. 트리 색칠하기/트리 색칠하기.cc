#include<bits/stdc++.h>
using namespace std;

const int MAX = 200'000;

int n;
int color[MAX];
bool visited[MAX];
vector<vector<int>> conn(MAX);

int dfs(int cur) {
    visited[cur]=true;
    int ret=0;
    for(int next:conn[cur]) {
        if(!visited[next]) {
            ret += dfs(next);
            if(color[next]!=color[cur]) ret++;
        }
    }
    return ret;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n;

    int root=0;
    for(int i=0;i<n;i++) {
        cin >> color[i];
        if(!color[i]) root=i;
    }

    for(int i=0;i<n-1;i++) {
        int a, b; cin >> a >> b;
        conn[a-1].push_back(b-1);
        conn[b-1].push_back(a-1);
    }

    int res = dfs(root);
    if(color[root]) res++;
    cout << res;
}