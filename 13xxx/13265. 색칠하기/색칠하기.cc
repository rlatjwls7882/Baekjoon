#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        int n, m; cin >> n >> m;
        vector<vector<int>> connect = vector<vector<int>>(n+1);

        while(m-->0) {
            int x, y; cin >> x >> y;
            connect[x].push_back(y);
            connect[y].push_back(x);
        }

        bool chk=true;
        int parent[n+1] = {0, };
        for(int i=1;i<=n;i++) {
            if(!parent[i]) {
                queue<int> q; q.push(i);
                parent[i]=1;
                while(!q.empty()) {
                    int cur = q.front(); q.pop();
                    for(int next:connect[cur]) {
                        if(parent[cur]==parent[next]) {
                            chk=false;
                            break;
                        }
                        if(parent[next]) continue;

                        if(parent[cur]==1) parent[next]=2;
                        else parent[next]=1;
                        q.push(next);
                    }
                    if(!chk) break;
                }
                if(!chk) break;
            }
        }
        if(chk) cout << "possible\n";
        else cout << "impossible\n";
    }
}