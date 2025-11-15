#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const int MAX = 300'000;

ll parent[MAX], _size[MAX], w[MAX], res[MAX], dp[MAX];
vector<vector<int>> conn(MAX), child(MAX);

int find(int x) {
    if(parent[x]==x) return x;
    return parent[x] = find(parent[x]);
}

void dfs(int curConned) {
    for(int next:child[curConned]) {
        dp[next] += dp[curConned];
        dfs(next);
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<n;i++) cin >> w[i];
    while(m--) {
        int u, v; cin >> u >> v;
        conn[u-1].push_back(v-1);
        conn[v-1].push_back(u-1);
    }

    vector<int> node(n);
    for(int i=0;i<n;i++) {
        node[i]=parent[i]=i;
        _size[i]=1;
    }
    sort(node.begin(), node.end(), [](int a, int b){return w[a]<w[b];});

    int root=0;
    unordered_set<int> inTree;
    for(int e:node) {
        ll sum=1;
        bool chk=true;
        unordered_set<int> curConned;
        for(int next:conn[e]) {
            next = find(next);
            if(find(e)==next) {
                chk=false;
                break;
            }
            if(inTree.count(next) && !curConned.count(next)) {
                sum += _size[next];
                curConned.insert(next);
            }
        }
        if(!chk) continue;

        res[e] += sum*w[e];
        for(int next:curConned) {
            dp[next] += (sum-_size[next])*w[e];
            parent[next]=e;
            _size[e] += _size[next];
            child[e].push_back(next);
        }
        inTree.insert(e);
        root=e;
    }
    dfs(root);
    for(int i=0;i<n;i++) cout << res[i]+dp[i] << ' ';
}