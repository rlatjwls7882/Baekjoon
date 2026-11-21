#include<bits/stdc++.h>
using namespace std;

bool visited[300];
int A[300], B[300];
vector<vector<int>> conn(300);

int dfs(int cur) {
    visited[cur]=true;
    for(int next:conn[cur]) {
        if(B[next]==-1 || !visited[B[next]] && dfs(B[next])) {
            A[cur]=next;
            B[next]=cur;
            return true;
        }
    }
    return false;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int R, C, N; cin >> R >> C >> N;

    bool blank[R][C];
    memset(blank, false, sizeof(blank));
    while(N-->0) {
        int a, b; cin >> a >> b;
        blank[a-1][b-1]=true;
    }

    for(int i=0;i<R;i++) {
        for(int j=0;j<C;j++) {
            if(!blank[i][j]) conn[i].push_back(j);
        }
    }

    int cnt=0;
    fill(A, A+R, -1);
    fill(B, B+C, -1);
    for(int i=0;i<R;i++) {
        if(A[i]==-1) {
            fill(visited, visited+300, false);
            if(dfs(i)) cnt++;
        }
    }
    cout << cnt;
}