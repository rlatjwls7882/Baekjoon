#include<bits/stdc++.h>
using namespace std;

bool visited[10001];
int A[10001], B[10001];
vector<set<int>> conn(10001);

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
    int N, M; cin >> N >> M;
    int m[N][M];
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            cin >> m[i][j];
        }
    }

    int cnt=0;
    int leftToRight[N][M];
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            if(m[i][j]==2) cnt++;
            leftToRight[i][j]=cnt;
        }
        cnt++;
    }

    cnt=0;
    int upToDown[N][M];
    for(int i=0;i<M;i++) {
        for(int j=0;j<N;j++) {
            if(m[j][i]==2) cnt++;
            upToDown[j][i]=cnt;
        }
        cnt++;
    }

    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            if(m[i][j]==0) {
                conn[leftToRight[i][j]].insert(upToDown[i][j]);
            }
        }
    }

    cnt=0;
    fill(A, A+10001, -1);
    fill(B, B+10001, -1);
    for(int i=0;i<=10000;i++) {
        if(A[i]==-1) {
            fill(visited, visited+10001, false);
            if(dfs(i)) cnt++;
        }
    }
    cout << cnt;
}