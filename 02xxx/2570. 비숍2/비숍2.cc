#include<bits/stdc++.h>
using namespace std;

bool visited[10000];
int A[10000], B[10000];
vector<vector<int>> conn(10000);

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
    int N, M; cin >> N >> M;
    bool block[N][N];
    memset(block, false, sizeof(block));
    while(M-->0) {
        int a, b; cin >> a >> b;
        block[a-1][b-1]=true;
    }

    int leftUp_rightDown[N][N];
    int rightUp_leftDown[N][N];
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            leftUp_rightDown[i][j]=rightUp_leftDown[i][j]=i*N+j;
        }
    }

    for(int i=1;i<N;i++) {
        for(int j=0;j<N;j++) {
            if(j-1>=0 && !block[i-1][j-1]) leftUp_rightDown[i][j]=leftUp_rightDown[i-1][j-1];
            if(j+1<N && !block[i-1][j+1]) rightUp_leftDown[i][j]=rightUp_leftDown[i-1][j+1];
        }
    }

    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            if(!block[i][j]) conn[leftUp_rightDown[i][j]].push_back(rightUp_leftDown[i][j]);
        }
    }

    int match=0;
    fill(A, A+N*N, -1);
    fill(B, B+N*N, -1);
    for(int i=0;i<N*N;i++) {
        if(A[i]==-1) {
            fill(visited, visited+N*N, false);
            if(dfs(i)) match++;
        }
    }
    cout << match;
}