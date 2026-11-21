#include <bits/stdc++.h>
using namespace std;

bool visited[2500];
int A[2500], B[2500];
vector<vector<int>> conn(2500);

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

int main(){
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    string s[N];
    for(int i=0;i<N;i++) {
        cin >> s[i];
    }

    int cnt=0;
    int leftToRight[N][M];
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            if(s[i][j]=='.') cnt++;
            leftToRight[i][j] = cnt;
        }
        cnt++;
    }

    cnt=0;
    int upToDown[N][M];
    for(int i=0;i<M;i++) {
        for(int j=0;j<N;j++) {
            if(s[j][i]=='.') cnt++;
            upToDown[j][i] = cnt;
        }
        cnt++;
    }

    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            if(s[i][j]=='*') conn[leftToRight[i][j]].push_back(upToDown[i][j]);
        }
    }

    cnt=0;
    fill(A, A+N*M, -1);
    fill(B, B+N*M, -1);
    for(int i=0;i<N*M;i++) {
        if(A[i]==-1) {
            fill(visited, visited+N*M, false);
            if(dfs(i)) cnt++;
        }
    }
    cout << cnt;
}