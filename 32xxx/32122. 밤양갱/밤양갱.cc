#include<bits/stdc++.h>
using namespace std;

int A[10000];
bool visited[10000];
int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};
vector<vector<int>> conn(10000);

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
    int N; cin >> N;
    vector<pair<int, int>> v(N*N);
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            int tmp; cin >> tmp;
            v[tmp-1]={i, j};
        }
    }

    fill(A, A+N*N, -1);
    bool chk[N*N] = {false, };
    for(int i=0;i<N*N;i++) {
        int curX = v[i].first;
        int curY = v[i].second;
        chk[curX*N+curY]=true;
        for(int j=0;j<4;j++) {
            int nextX = curX+moveX[j];
            int nextY = curY+moveY[j];
            if(nextX<0 || nextX>=N || nextY<0 || nextY>=N || !chk[nextX*N+nextY]) continue;
            conn[curX*N+curY].push_back(nextX*N+nextY);
            conn[nextX*N+nextY].push_back(curX*N+curY);
        }

        fill(visited, visited+N*N, false);
        if(dfs(curX*N+curY)) cout << i+1 << '\n';
    }
}