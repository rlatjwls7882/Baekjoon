#include <bits/stdc++.h>
using namespace std;

int N, M, K;
int A[100000], B[1000];
bool visited[100000] = {false, };
vector<vector<int>> conn(1000);

bool dfs(int cur) {
    visited[cur]=true;
    for(int next:conn[cur%N]) {
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
    cin >> N >> M >> K;
    for(int i=0;i<N;i++) {
        int cnt; cin >> cnt;
        while(cnt-->0) {
            int j; cin >> j;
            conn[i].push_back(j-1);
        }
    }

    int cnt=0;
    fill(A, A+100000, -1);
    fill(B, B+1000, -1);
    for(int i=0;i<N;i++) {
        if(A[i]==-1) {
            fill(visited, visited+100000, false);
            if(dfs(i)) cnt++;
        }
    }

    for(int i=0;i<N && K>0;i++) {
        for(int j=1;K>0;j++) {
            fill(visited, visited+100000, false);
            if(dfs(i+N*j)) {
                cnt++;
                K--;
            } else {
                break;
            }
        }
    }
    cout << cnt;
}