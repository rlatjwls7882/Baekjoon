#include<bits/stdc++.h>
#define MAX 1001

using namespace std;

int A[MAX], B[MAX];
bool visited[MAX];
vector<vector<int>> connect;

bool dfs(int a) {
    visited[a]=true;
    for(int b:connect[a]) {
        if(B[b]==-1 || !visited[B[b]] && dfs(B[b])) {
            A[a]=b;
            B[b]=a;
            return true;
        }
    }
    return false;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        int n, m; cin >> n >> m;
        connect = vector<vector<int>>(MAX);
        while(m-->0) {
            int u, v; cin >> u >> v;
            connect[u].push_back(v);
        }

        fill(A, A+MAX, -1);
        fill(B, B+MAX, -1);
        int match=0;
        for(int i=0;i<n;i++) {
            if(A[i]==-1) {
                fill(visited, visited+MAX, false);
                if(dfs(i)) match++;
            }
        }
        cout << match << '\n';
    }
}