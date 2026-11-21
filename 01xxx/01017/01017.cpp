#include<bits/stdc++.h>
using namespace std;

int A[50];
bool visited[50];
vector<vector<int>> conn(50);

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
    int arr[N];
    for(int i=0;i<N;i++) {
        cin >> arr[i];
    }

    bool notSosu[2000] = {true, true, false, };
    for(int i=2;i*i<2000;i++) {
        if(!notSosu[i]) {
            for(int j=i*i;j<2000;j+=i) {
                notSosu[j]=true;
            }
        }
    }
    for(int i=0;i<N;i++) {
        for(int j=i+1;j<N;j++) {
            if(!notSosu[arr[i]+arr[j]]) {
                conn[i].push_back(j);
                conn[j].push_back(i);
            }
        }
    }

    fill(A, A+N, -1);
    for(int i=1;i<N;i++) {
        if(A[i]==-1) {
            fill(visited, visited+N, false);
            dfs(i);
        }
    }

    for(int i=0;i<N;i++) {
        if(A[i]==-1) {
            cout << -1;
            return 0;
        }
    }

    set<int> s;
    for(int next:conn[0]) {
        fill(visited, visited+N, false);
        if(A[0]!=-1) {
            A[A[0]]=-1;
            A[0]=-1;
        }
        if(A[next]==-1 || !visited[A[next]] && dfs(A[next])) {
            A[next]=0;
            A[0]=next;
            s.insert(arr[next]);
        }
    }

    for(int res:s) {
        cout << res << ' ';
    }
}