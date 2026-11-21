#include<bits/stdc++.h>
#define MAX 1001

using namespace std;

int A[MAX*2] = {0, };
int B[MAX] = {0, };
bool visited[MAX*2];
vector<vector<int>> connect = vector<vector<int>>(MAX*2);

bool dfs(int a) {
    visited[a]=true;
    for(int b:connect[a]) {
        if(B[b]==0 || !visited[B[b]] && dfs(B[b])) {
            A[a]=b;
            B[b]=a;
            return true;
        }
    }
    return false;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M, K; cin >> N >> M >> K;

    for(int i=1;i<=N;i++) {
        int cnt; cin >> cnt;
        while(cnt-->0) {
            int j; cin >> j;
            connect[i*2-1].push_back(j);
            connect[i*2].push_back(j);
        }
    }

    int match1=0, match2=0;
    for(int i=1;i<=2*N;i+=2) {
        if(A[i]==0) {
            fill(visited, visited+MAX*2, false);
            if(dfs(i)) match1++;
        }
    }
    for(int i=2;i<=2*N;i+=2) {
        if(A[i]==0) {
            fill(visited, visited+MAX*2, false);
            if(dfs(i)) {
                if(++match2==K) {
                    break;
                }
            }
        }
    }
    cout << match1+match2;
}