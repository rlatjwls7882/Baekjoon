#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;

    while(T-->0) {
        int V, E; cin >> V >> E;
        vector<vector<int>> connect = vector<vector<int>>(V+1);
        while(E-->0) {
            int u, v; cin >> u >> v;
            connect[u].push_back(v);
            connect[v].push_back(u);
        }

        bool chk=true;
        int visited[V+1] = {0, };
        for(int i=1;i<=V;i++) {
            if(!visited[i]) {
                queue<int> q; q.push(i);
                visited[i]=1;
                while(!q.empty()) {
                    int cur = q.front(); q.pop();
                    for(int next:connect[cur]) {
                        if(visited[next]) {
                            if(visited[cur]==visited[next]) {
                                chk=false;
                                break;
                            }
                        } else {
                            if(visited[cur]==1) visited[next]=2;
                            else visited[next]=1;
                            q.push(next);
                        }
                    }
                    if(!chk) break;
                }
            }
            if(!chk) break;
        }
        if(chk) cout << "YES\n";
        else cout << "NO\n";
    }
}