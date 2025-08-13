#include<bits/stdc++.h>
using namespace std;

const int INF = 0x3f3f3f3f;
const int MAX = 501;

struct element {
    int pos, cost;
};

int n, m;
long long minCost[MAX];
vector<vector<element>> conn(MAX);

bool bellman_ford() {
    fill(minCost, minCost+MAX, INF);
    minCost[1]=0;
    for(int i=0;i<n;i++) {
        bool change=false;
        for(int cur=1;cur<=n;cur++) {
            if(minCost[cur]==INF) continue;
            for(auto next:conn[cur]) {
                long long nextCost = minCost[cur] + next.cost;
                if(nextCost<minCost[next.pos]) {
                    minCost[next.pos] = nextCost;
                    change=true;
                }
            }
        }
        if(!change) return true;
    }
    return false;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m;
    while(m--) {
        int a, b, c; cin >> a >> b >> c;
        conn[a].push_back({b, c});
    }

    if(!bellman_ford()) {
        cout << -1;
        return 0;
    }

    for(int i=2;i<=n;i++) {
        if(minCost[i]==INF) cout << "-1\n";
        else cout << minCost[i] << '\n';
    }
}