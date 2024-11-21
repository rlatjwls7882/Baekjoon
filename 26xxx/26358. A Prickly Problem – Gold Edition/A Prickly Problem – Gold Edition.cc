#include<bits/stdc++.h>
using namespace std;

const int MAX = 100;
typedef pair<int, int> P;
vector<vector<int>> conn(MAX);
vector<vector<P>> BCCs;
int idx, parent[MAX];
stack<P> stk;

int dfs(int cur, int prev=-1) {
    int remember = parent[cur] = ++idx;
    for(int next:conn[cur]) {
        if(prev==next) continue;
        if(parent[cur]>parent[next]) stk.push({cur, next});
        if(parent[next]) {
            remember = min(remember, parent[next]);
        } else {
            int tmp = dfs(next, cur);
            remember = min(remember, tmp);
            if(tmp>=parent[cur]) {
                BCCs.push_back(vector<P>());
                while(true) {
                    P top = stk.top(); stk.pop();
                    BCCs.back().push_back(top);
                    if(top == P(cur, next)) break;
                }
            }
        }
    }
    return remember;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    for(int t=1;t<=T;t++) {
        int V, E; cin >> V >> E;
        while(E-->0) {
            int a, b; cin >> a >> b;
            conn[a-1].push_back(b-1);
            conn[b-1].push_back(a-1);
        }
        for(int i=0;i<V;i++) if(!parent[i]) dfs(i);

        int total=1;
        for(auto bcc:BCCs) {
            total = total*bcc.size()%1007;
        }
        cout << "Case #" << t << ": " << total << "\n\n";

        // clear
        BCCs.clear();
        for(int i=0;i<V;i++) {
            conn[i].clear();
            parent[i]=0;
        }
        idx=0;
    }
}