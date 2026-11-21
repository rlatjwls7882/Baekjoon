#include<bits/stdc++.h>
using namespace std;

const int MAX = 1000;
bool visited[MAX];
int A[MAX], B[MAX];
vector<vector<int>> conn(MAX);

int dfs(int cur) {
    visited[cur]=true;
    for(int next:conn[cur]) {
        if(B[next]==-1 || !visited[B[next]] && dfs(B[next])) {
            B[next]=cur;
            A[cur]=next;
            return true;
        }
    }
    return false;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    map<string, int> member;
    for(int i=0;i<M;i++) {
        string s; cin >> s;
        member[s]=i;
    }

    for(int i=0;i<N;i++) {
        int cnt; cin >> cnt;
        while(cnt-->0) {
            string s; cin >> s;
            conn[i].push_back(member[s]);
        }
    }

    int match=0;
    fill(A, A+MAX, -1);
    fill(B, B+MAX, -1);
    for(int i=0;i<N;i++) {
        if(A[i]==-1) {
            fill(visited, visited+MAX, false);
            if(dfs(i)) match++;
        }
    }
    if(match==N) cout << "YES";
    else cout << "NO\n" << match;
}