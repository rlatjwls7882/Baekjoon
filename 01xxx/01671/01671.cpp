#include<bits/stdc++.h>
using namespace std;

int A[100], B[50];
bool visited[100];
vector<vector<int>> conn(100);

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
    int shark[N][3];
    for(int i=0;i<N;i++) {
        for(int j=0;j<3;j++) {
            cin >> shark[i][j];
        }
    }

    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            if(shark[i][0]==shark[j][0] && shark[i][1]==shark[j][1] && shark[i][2]==shark[j][2]) {
                if(i<j) {
                    conn[i*2].push_back(j);
                    conn[i*2+1].push_back(j);
                }
            } else if(shark[i][0]>=shark[j][0] && shark[i][1]>=shark[j][1] && shark[i][2]>=shark[j][2]) {
                conn[i*2].push_back(j);
                conn[i*2+1].push_back(j);
            }
        }
    }

    int cnt=N;
    fill(A, A+2*N, -1);
    fill(B, B+N, -1);
    for(int i=0;i<2*N;i++) {
        if(A[i]==-1) {
            fill(visited, visited+2*N, false);
            if(dfs(i)) cnt--;
        }
    }
    cout << cnt;
}