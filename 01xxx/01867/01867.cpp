#include<bits/stdc++.h>
using namespace std;

bool visited[500];
int A[500], B[500];
vector<vector<int>> conn(500);

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
    int n, k; cin >> n >> k;
    while(k-->0) {
        int r, c; cin >> r >> c;
        conn[r-1].push_back(c-1);
    }

    int cnt=0;
    fill(A, A+n, -1);
    fill(B, B+n, -1);
    for(int i=0;i<n;i++) {
        if(A[i]==-1) {
            fill(visited, visited+n, false);
            if(dfs(i)) cnt++;
        }
    }
    cout << cnt;
}