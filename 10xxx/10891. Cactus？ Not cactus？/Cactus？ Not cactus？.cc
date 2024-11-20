#include<bits/stdc++.h>
using namespace std;

const int MAX = 100000;
typedef pair<int, int> P;
vector<vector<int>> conn(MAX);
vector<vector<P>> BCCs;
stack<P> stk;
int idx, parent[MAX];

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
                    if(top==P(cur, next)) break;
                }
            }
        }
    }
    return remember;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    while(M-->0) {
        int x, y; cin >> x >> y;
        conn[x-1].push_back(y-1);
        conn[y-1].push_back(x-1);
    }
    for(int i=0;i<N;i++) if(!parent[i]) dfs(i);

    set<int> cycleNode;
    for(auto bcc:BCCs) {
        if(bcc.size()>2) {
            set<int> cur;
            for(P e:bcc) cur.insert(e.first), cur.insert(e.second);
            for(int e:cur) {
                if(cycleNode.count(e)) { // 한 정점이 두 사이클에 동시에 속하는 경우
                    cout << "Not cactus";
                    return 0;
                }
                cycleNode.insert(e);
            }
            if(bcc.size()!=cur.size()) { // 단순 사이클이 아닌 경우
                cout << "Not cactus";
                return 0;
            }
        }
    }
    cout << "Cactus";
}