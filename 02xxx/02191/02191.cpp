#include<bits/stdc++.h>
using namespace std;

int A[100], B[100];
bool visited[100];
vector<vector<int>> connect(100);

bool dfs(int cur) {
    visited[cur]=true;
    for(int next:connect[cur]) {
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
    int N, M, S, V; cin >> N >> M >> S >> V;
    double pos[N][2];
    for(int i=0;i<N;i++) {
        for(int j=0;j<2;j++) {
            cin >> pos[i][j];
        }
    }

    double housePos[M][2];
    for(int i=0;i<M;i++) {
        for(int j=0;j<2;j++) {
            cin >> housePos[i][j];
        }
    }

    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            if(pow(pos[i][0]-housePos[j][0], 2)+pow(pos[i][1]-housePos[j][1], 2) <= pow(S*V, 2)) {
                connect[i].push_back(j);
            }
        }
    }

    int cnt=0;
    fill(A, A+N, -1);
    fill(B, B+M, -1);
    for(int i=0;i<N;i++) {
        if(A[i]==-1) {
            fill(visited, visited+N, false);
            if(!dfs(i)) cnt++;
        }
    }
    cout << cnt;
}