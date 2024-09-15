#include<bits/stdc++.h>
using namespace std;

int depth;
bool finished;
int visited[1000];
vector<vector<int>> connect(1000);

void dfs(int cur, int finish, int cnt) {
    if(finish==cur) {
        finished=true;
        depth=cnt;
        return;
    }
    for(int next:connect[cur]) {
        if(finished) return;
        if(visited[next]==-1) {
            visited[next]=cur;
            dfs(next, finish, cnt+1);
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    for(int i=0;i<N-1;i++) {
        int a, b; cin >> a >> b;
        connect[a-1].push_back(b-1);
        connect[b-1].push_back(a-1);
    }

    int Q; cin >> Q;
    int cnt[N] = {0, };
    while(Q-->0) {
        int t; cin >> t;
        if(t==1) {
            int u, v; cin >> u >> v;
            fill(visited, visited+N, -1);
            visited[u-1]=0;
            finished=false;
            dfs(u-1, v-1, 0);
            for(int i=v-1;i!=u-1;i=visited[i]) {
                cnt[i]+=depth--;
            }
        } else {
            int x; cin >> x;
            cout << cnt[x-1] << '\n';
        }
    }
}