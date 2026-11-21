#include <bits/stdc++.h>
using namespace std;

int A[6400];
bool visited[6400];
int moveX[6] = {-1, 0, 1, -1, 0, 1};
int moveY[6] = {1, 1, 1, -1, -1, -1};
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
    int c; cin >> c;
    while(c-->0) {
        int n, m; cin >> n >> m;
        string s[n];
        for(int i=0;i<n;i++) cin >> s[i];
        conn = vector<vector<int>>(n*m);

        int total=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(s[i][j]!='x') {
                    for(int k=0;k<6;k++) {
                        int nextX = i+moveX[k];
                        int nextY = j+moveY[k];
                        if(nextX<0 || nextX>=n || nextY<0 || nextY>=m || s[nextX][nextY]=='x') continue;
                        conn[i*m+j].push_back(nextX*m+nextY);
                    }
                    total++;
                }
            }
        }

        int match=0;
        fill(A, A+n*m, -1);
        for(int i=0;i<n*m;i++) {
            if(A[i]==-1) {
                fill(visited, visited+n*m, false);
                if(dfs(i)) match++;
            }
        }
        cout << total - match << '\n';
    }
}