#include<bits/stdc++.h>
using namespace std;

const int MAX = 10000;

typedef pair<int, int> P;
int parent[MAX], cnt;
vector<vector<int>> conn(MAX);
vector<vector<P>> BCCs;
stack<P> stk;

int dfs(int cur, int prev=-1) {
    int remember = parent[cur] = ++cnt;
    for(int next:conn[cur]) {
        if(prev == next) continue;
        // 아직 방문하지 않은 간선이면 스택에 push
        if(parent[cur]>parent[next]) stk.push({cur, next});
        if(parent[next]>0) { // 역방향 간선
            remember = min(remember, parent[next]);
        } else { // 순방향 간선
            int tmp = dfs(next, cur);
            remember = min(remember, tmp);
            // next가 cur의 조상으로 갈 수 없는 경우(새 BCC 발견)
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
        int u, v; cin >> u >> v;
        conn[u-1].push_back(v-1);
        conn[v-1].push_back(u-1);
    }
    for(int i=0;i<V;i++) if(parent[i]==0) dfs(i);

    set<int> ArPoint, AllNode;
    for(auto bcc:BCCs) {
        set<int> curNode;
        for(auto edge:bcc) {
            curNode.insert(edge.first+1);
            curNode.insert(edge.second+1);
        }
        for(int n:curNode) if(AllNode.count(n)) ArPoint.insert(n);
        for(int n:curNode) AllNode.insert(n);
    }

    cout << ArPoint.size() << '\n';
    for(int e:ArPoint) cout << e << ' ';
}