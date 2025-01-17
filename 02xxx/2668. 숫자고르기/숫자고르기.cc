#include<bits/stdc++.h>
using namespace std;

int conn[100];
bool visited[100];
set<int> s;

void dfs(int cur) {
    if(visited[conn[cur]]) {
        int next = conn[cur];
        while(true) {
            s.insert(next+1);
            next = conn[next];
            if(next==cur) break;
        }
    } else {
        visited[cur]=true;
        dfs(conn[cur]);
        visited[cur]=false;
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) {
        cin >> conn[i];
        conn[i]--;
    }

    for(int i=0;i<n;i++) dfs(i);
    cout << s.size() << '\n';
    for(int e:s) cout << e << '\n';
}