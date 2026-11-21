#include<bits/stdc++.h>
using namespace std;

bool visited[10000];
int A[10000], B[10000];
vector<vector<int>> conn(10000);

bool dfs(int cur) {
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
    int N; cin >> N;
    string m[N];
    for(int i=0;i<N;i++) {
        cin >> m[i];
    }

    int cur=0;
    int LtoR[N][N];
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            if(m[i][j]=='X') cur++;
            LtoR[i][j]=cur;
        }
        cur++;
    }

    cur=0;
    int UtoD[N][N];
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            if(m[j][i]=='X') cur++;
            UtoD[j][i]=cur;
        }
        cur++;
    }

    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            if(m[i][j]!='X') {
                conn[LtoR[i][j]].push_back(UtoD[i][j]);
            }
        }
    }

    int cnt=0;
    fill(A, A+N*N, -1);
    fill(B, B+N*N, -1);
    for(int i=0;i<N*N;i++) {
        if(A[i]==-1) {
            fill(visited, visited+N*N, false);
            if(dfs(i)) cnt++;
        }
    }
    cout << cnt;
}