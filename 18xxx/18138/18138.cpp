#include<bits/stdc++.h>
using namespace std;

int A[200], B[200];
bool visited[200];
vector<vector<int>> conn(200);

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

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;
    int nw[n];
    for(int i=0;i<n;i++) cin >> nw[i];
    int mw[m];
    for(int i=0;i<m;i++) cin >> mw[i];
    
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            if(nw[i]/2.<=mw[j] && mw[j]<=nw[i]/4.*3 || nw[i]<=mw[j] && mw[j]<=nw[i]/4.*5) {
                conn[i].push_back(j);
            }
        }
    }
    
    int cnt=0;
    fill(A, A+n, -1);
    fill(B, B+m, -1);
    for(int i=0;i<n;i++) {
        if(A[i]==-1) {
            fill(visited, visited+200, false);
            if(dfs(i)) cnt++;
        }
    }
    cout << cnt;
}