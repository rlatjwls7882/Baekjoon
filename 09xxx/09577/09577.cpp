#include<bits/stdc++.h>
using namespace std;

bool visited[100];
int A[100], B[100];
vector<set<int>> conn;

bool dfs(int cur) {
    visited[cur]=true;
    for(int next:conn[cur]) {
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
    int T; cin >> T;
    while(T-->0) {
        int n, m; cin >> n >> m;
        conn = vector<set<int>>(100);

        while(m-->0) {
            int t1, t2, a; cin >> t1 >> t2 >> a;
            while(a-->0) {
                int q; cin >> q;
                for(int i=t1;i<t2;i++) {
                    conn[q-1].insert(i);
                }
            }
        }

        bool chk=true;
        fill(A, A+n, -1);
        fill(B, B+100, -1);
        for(int i=0;i<n;i++) {
            if(A[i]==-1) {
                fill(visited, visited+100, false);
                if(!dfs(i)) {
                    chk=false;
                    break;
                }
            }
        }

        if(!chk) {
            cout << "-1\n";
        } else {
            for(int i=99;i>=0;i--) {
                if(B[i]!=-1) {
                    cout << i+1 << '\n';
                    break;
                }
            }
        }
    }
}