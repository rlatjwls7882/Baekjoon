#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'000;
const int INF = 0x3f3f3f3f;

int n, m, k, q;
int parent[MAX], cost[MAX], festival[MAX];

struct e {
    int idx, cost;
    bool operator<(const e e) const {
        return cost > e.cost;
    }
};

struct edge {
    int a, b, c;
    bool operator<(const edge e) const {
        return c > e.c;
    }
};

struct query {
    int s, e;
};

struct mid {
    int val, i;
    bool operator<(const mid m) const {
        return val > m.val;
    }
};

vector<vector<e>> conn(MAX);

int _find(int x) {
    if(parent[x]==x) return x;
    return parent[x] = _find(parent[x]);
}

void _union(int x, int y) {
    x = _find(x);
    y = _find(y);
    if(x<y) parent[y]=x;
    else parent[x]=y;
}

void dijkstra() {
    priority_queue<e> pq;
    fill(cost, cost+n, INF);
    while(k--) {
        int idx; cin >> idx;
        cost[idx-1]=0;
        pq.push({idx-1, 0});
    }

    while(!pq.empty()) {
        auto cur = pq.top(); pq.pop();
        if(cur.cost>cost[cur.idx]) continue;
        cost[cur.idx] = cur.cost;

        for(auto next : conn[cur.idx]) {
            if(cost[next.idx]>cost[cur.idx]+next.cost) {
                pq.push({next.idx, cost[cur.idx]+next.cost});
            }
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m >> k >> q;

    vector<edge> edges;
    while(m--) {
        int a, b, c; cin >> a >> b >> c;
        edges.push_back({a-1, b-1, c});
        conn[a-1].push_back({b-1, c});
        conn[b-1].push_back({a-1, c});
    }
    dijkstra();
    for(edge &e : edges) {
        e.c = min(cost[e.a], cost[e.b]);
    }
    sort(edges.begin(), edges.end());

    vector<query> queries(q);
    for(int i=0;i<q;i++) {
        cin >> queries[i].s >> queries[i].e;
        queries[i].s--;
        queries[i].e--;
    }

    vector<int> left(n, 0), right(n, 100'000'000); // 경로와 축제 도시의 최소 거리
    while(true) {
        vector<mid> mids;
        for(int i=0;i<q;i++) {
            if(left[i]<right[i]) {
                mids.push_back({(left[i]+right[i]+1)/2, i});
            }
        }
        if(mids.empty()) break;
        sort(mids.begin(), mids.end());

        for(int i=0;i<n;i++) parent[i]=i;

        // 거리가 mid 이상인 도시를 연결한 간선은 모두 연결
        int idx=0;
        for(int i=0;i<edges.size() && idx<q;i++) {
            while(idx<mids.size() && (mids[idx].val>edges[i].c || i==edges.size()-1)) {
                if(i==edges.size()-1 && edges[i].c>=mids[idx].val) _union(edges[i].a, edges[i].b); // 마지막 인덱스 예외처리
                if(_find(queries[mids[idx].i].s)==_find(queries[mids[idx].i].e)) left[mids[idx].i] = mids[idx].val;
                else right[mids[idx].i] = mids[idx].val-1;
                idx++;
            }
            _union(edges[i].a, edges[i].b);
        }
    }
    for(int i=0;i<q;i++) cout << left[i] << '\n';
}