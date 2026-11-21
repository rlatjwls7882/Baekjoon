#include<bits/stdc++.h>
using namespace std;

int A[300], B[300];
bool visited[300];

int dfs(int cur, vector<vector<int>> conn) {
    visited[cur]=true;
    for(int next:conn[cur]) {
        if(B[next]==-1 || !visited[B[next]] && dfs(B[next], conn)) {
            A[cur]=next;
            B[next]=cur;
            return true;
        }
    }
    return false;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m, k1, k2; cin >> n >> m >> k1 >> k2;
    vector<vector<int>> connA(n), connB(n);
    while(k1-->0) {
        int i, j; cin >> i >> j;
        connA[i-1].push_back(j-1);
    }
    while(k2-->0) {
        int i, j; cin >> i >> j;
        connB[i-1].push_back(j-1);
    }
    
    int cnt1=0;
    fill(A, A+n, -1);
    fill(B, B+m, -1);
    for(int i=0;i<n;i++) {
        if(A[i]==-1) {
            fill(visited, visited+300, false);
            if(dfs(i, connA)) cnt1++;
        }
    }
    
    int cnt2=0;
    fill(A, A+n, -1);
    fill(B, B+m, -1);
    for(int i=0;i<n;i++) {
        if(A[i]==-1) {
            fill(visited, visited+300, false);
            if(dfs(i, connB)) cnt2++;
        }
    }

    if(cnt1<cnt2) cout << "네 다음 힐딱이";
    else cout << "그만 알아보자";
}