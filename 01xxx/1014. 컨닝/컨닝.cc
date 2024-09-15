#include <bits/stdc++.h>
using namespace std;

int A[100];
bool visited[100];
int moveX[6] = {1, 1, 0, 0, -1, -1};
int moveY[6] = {-1, 1, -1, 1, -1, 1};
vector<vector<int>> conn;

bool dfs(int cur) {
    visited[cur]=true;
    for(int next:conn[cur]) {
        if(A[next]==-1 || !visited[A[next]] && dfs(A[next])) {
            A[cur]=next;
            A[next]=cur;
            return true;
        }
    }
    return false;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int C; cin >> C;
    while(C-->0) {
        int N, M; cin >> N >> M;
        string s[N];
        for(int i=0;i<N;i++) cin >> s[i];

        int totalSeat=0;
        conn = vector<vector<int>>(N*M);
        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                if(s[i][j]=='.') {
                    totalSeat++;
                    for(int k=0;k<6;k++) {
                        int nextX = i+moveX[k];
                        int nextY = j+moveY[k];
                        if(nextX<0 || nextX>=N || nextY<0 || nextY>=M || s[nextX][nextY]=='x') continue;
                        conn[i*M+j].push_back(nextX*M+nextY);
                    }
                }
            }
        }

        int match=0;
        fill(A, A+N*M, -1);
        for(int i=0;i<N*M;i++) {
            if(A[i]==-1) {
                fill(visited, visited+N*M, false);
                if(dfs(i)) match++;
            }
        }
        cout << totalSeat - match << '\n';
    }
}