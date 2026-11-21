#include<bits/stdc++.h>
using namespace std;

typedef pair<int, int> P;
const int MAX = 100000;
vector<vector<int>> conn(MAX);
int idx, parent[MAX];
vector<vector<P>> BCCs;
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
                    auto top = stk.top(); stk.pop();
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
    int V, E; cin >> V >> E;
    while(E-->0) {
        int A, B; cin >> A >> B;
        conn[A-1].push_back(B-1);
        conn[B-1].push_back(A-1);
    }
    for(int i=0;i<V;i++) if(!parent[i]) dfs(i);

    set<P> res;
    for(auto bcc:BCCs) {
        if(bcc.size()==1) res.insert({min(bcc[0].first, bcc[0].second)+1, max(bcc[0].first, bcc[0].second)+1});
    }
    cout << res.size() << '\n';
    for(auto e:res) cout << e.first << ' ' << e.second << '\n';
}