#include<bits/stdc++.h>
#define MAX 101

using namespace std;

int A[MAX], B[MAX];
bool visited[MAX];
vector<vector<int>> connect = vector<vector<int>>(MAX);

int dfs(int a) {
    visited[a]=true;
    for(int b:connect[a]) {
        if(B[b]==-1 || !visited[B[b]] && dfs(B[b])) {
            A[a]=b;
            B[b]=a;
            return true;
        }
    }
    return false;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    while(M-->0) {
        int a, b; cin >> a >> b;
        connect[a].push_back(b);
    }

    fill(A, A+MAX, -1);
    fill(B, B+MAX, -1);
    int match=0;
    for(int i=1;i<=N;i++) {
        if(A[i]==-1) {
            fill(visited, visited+MAX, false);
            if(dfs(i)) match++;
        }
    }
    cout << match;
}