#include<bits/stdc++.h>
using namespace std;

bool visited[201], conn[201][201];
int minVal[201], maxVal[201], A[201], B[201];

bool dfs(int cur) {
    visited[cur]=true;
    for(int next=minVal[cur];next<=maxVal[cur];next++) {
        if(conn[cur][next] && (B[next]==-1 || !visited[B[next]] && dfs(B[next]))) {
            B[next]=cur;
            A[cur]=next;
            return true;
        }
    }
    return false;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, M; cin >> N >> M;
    for(int i=1;i<=N;i++) {
        for(int j=1;j<=N;j++) conn[i][j]=true;
        minVal[i]=1, maxVal[i]=N;
    }
    while(M-->0) {
        int a, x, y, v; cin >> a >> x >> y >> v;
        for(int i=1;i<=N;i++) {
            if(i<x || i>y) conn[i][v]=false;
            else if(a==1) maxVal[i] = min(maxVal[i], v);
            else minVal[i] = max(minVal[i], v);
        }
    }

    memset(A, -1, sizeof A);
    memset(B, -1, sizeof B);
    for(int i=1;i<=N;i++) {
        if(A[i]==-1) {
            memset(visited, false, sizeof visited);
            if(!dfs(i)) {
                cout << -1;
                return 0;
            }
        }
    }
    for(int i=1;i<=N;i++) cout << A[i] << ' ';
}