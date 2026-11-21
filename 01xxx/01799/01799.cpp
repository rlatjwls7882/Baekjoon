#include<bits/stdc++.h>
using namespace std;

int A[20], B[20];
bool visited[20];
vector<vector<int>> conn(20);

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
    int n; cin >> n;
    int m[n][n];
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            cin >> m[i][j];
        }
    }

    int leftupCross[n][n], rightdownCross[n][n];
    for(int i=0;i<n;i++) {
        leftupCross[i][0] = rightdownCross[i][n-1] = i;
        leftupCross[0][i] = rightdownCross[0][i] = n+i;
    }
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            if(i>0 && j>0) leftupCross[i][j] = leftupCross[i-1][j-1];
            if(i>0 && j<n-1) rightdownCross[i][j] = rightdownCross[i-1][j+1];
            if(m[i][j]) conn[leftupCross[i][j]].push_back(rightdownCross[i][j]);
        }
    }

    int cnt=0;
    fill(B, B+20, -1);
    fill(A, A+20, -1);
    for(int i=0;i<2*n;i++) {
        if(A[i]==-1) {
            fill(visited, visited+20, false);
            if(dfs(i)) cnt++;
        }
    }
    cout << cnt;
}