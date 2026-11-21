#include<bits/stdc++.h>
using namespace std;

const int MAX = 400;

bool visited[MAX];
int Girls[MAX], Boys[MAX];
vector<vector<int>> conn(MAX);

int dfs(int cur) {
    visited[cur]=true;
    for(int next:conn[cur]) {
        if(Boys[next]==-1 || !visited[Boys[next]] && dfs(Boys[next])) {
            Boys[next]=cur;
            Girls[cur]=next;
            return true;
        }
    }
    return false;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    int G[N], B[M], L[N], U[M];
    for(int i=0;i<N;i++) cin >> G[i];
    for(int i=0;i<M;i++) cin >> B[i];
    for(int i=0;i<N;i++) cin >> L[i];
    for(int i=0;i<M;i++) cin >> U[i];

    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            if(B[j]<L[i] && G[i]>U[j]) conn[i].push_back(j);
        }
    }

    int pairs=0;
    fill(Girls, Girls+N, -1);
    fill(Boys, Boys+M, -1);
    for(int i=0;i<N;i++) {
        if(Girls[i]==-1) {
            fill(visited, visited+MAX, false);
            if(dfs(i)) pairs++;
        }
    }
    cout << pairs;
}