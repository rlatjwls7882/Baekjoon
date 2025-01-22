#include<bits/stdc++.h>
using namespace std;

int A[400], B[800];
bool visited[800];
vector<vector<int>> conn(800);

bool dfs(int cur) {
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

int main() {
    int N, K; cin >> N >> K;
    for(int i=0;i<N;i++) {
        for(int j=0;j<K;j++) {
            bool inp; cin >> inp;
            if(inp) conn[i].push_back(j);
        }
        sort(conn[i].begin(), conn[i].end(), greater<int>());
    }

    memset(A, -1, sizeof A);
    memset(B, -1, sizeof B);
    for(int i=0;i<N;i++) {
        if(A[i]==-1) {
            memset(visited, 0, sizeof visited);
            dfs(i);
        }
    }

    int cnt=0;
    for(int i=0;i<K;i++) {
        if(B[i]>-1) {
            bool chk=false;
            for(int j=0;j<i;j++) {
                if(B[j]==-1) {
                    B[j]=-2;
                    chk=true;
                    break;
                }
            }
            if(!chk) {
                for(int j=0;j<i;j++) {
                    if(B[j]!=-2) {
                        B[j]=-2;
                        chk=true;
                        break;
                    }
                }
            }
            if(chk) {
                B[i]=-2;
                cnt++;
            }
        }
    }
    cout << cnt;
}