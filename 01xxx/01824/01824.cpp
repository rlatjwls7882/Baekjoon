#include<bits/stdc++.h>
using namespace std;

int A[10000];
int moveX[4] = {1, -1, 0, 0};
int moveY[4] = {0, 0, 1, -1};
bool visited[10000];
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
    int N, M, L; cin >> N >> M >> L;
    set<pair<int, int>> del;
    while(L-->0) {
        int a, b; cin >> a >> b;
        del.insert({a-1, b-1});
        del.insert({b-1, a-1});
    }

    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            for(int k=0;k<4;k++) {
                int nextX = i+moveX[k];
                int nextY = j+moveY[k];
                if(nextX<0 || nextX>=N || nextY<0 || nextY>=M || del.count({i*M+j, nextX*M+nextY})) continue;
                conn[i*M+j].push_back(nextX*M+nextY);
            }
        }
    }

    fill(A, A+N*M, -1);
    for(int i=0;i<N*M;i++) {
        if(A[i]==-1) {
            fill(visited, visited+N*M, false);
            dfs(i);
        }
    }
    fill(visited, visited+N*M, false);
    for(int i=0;i<N*M;i++) {
        if(!visited[i]) {
            cout << i+1 << ' ' << A[i]+1 << '\n';
            visited[i]=visited[A[i]]=true;
        }
    }
}