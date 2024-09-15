#include<bits/stdc++.h>
#define MAX 1001

using namespace std;

bool visited[MAX];
int A[MAX], B[MAX];
vector<vector<int>> connect;

bool dfs(int a) {
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
    int t; cin >> t;
    while(t-->0) {
        connect = vector<vector<int>>(MAX);
        int N, M; cin >> N >> M;
        for(int i=1;i<=M;i++) {
            int a, b; cin >> a >> b;
            for(int j=a;j<=b;j++) {
                connect[i].push_back(j);
            }
        }

        fill(A, A+MAX, -1);
        fill(B, B+MAX, -1);
        int match=0;
        for(int i=1;i<=M;i++) {
            if(A[i]==-1) {
                fill(visited, visited+MAX, false);
                if(dfs(i)) {
                    match++;
                }
            }
        }
        cout << match << '\n';
    }
}