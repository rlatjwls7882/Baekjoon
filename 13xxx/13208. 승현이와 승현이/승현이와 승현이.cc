#include<bits/stdc++.h>
using namespace std;

int n, m, c[40000], parent[250000];

int _find(int x) {
    if(parent[x]==x) return x;
    return parent[x] = _find(parent[x]);
}

void _union(int x, int y) {
    x = _find(x);
    y = _find(y);
    if(x<y) parent[y] = x;
    else parent[x] = y;
}

int node(int x, int y) {
    return x*n+y;
}

struct edge {
    int a, b, c;
    bool operator<(const edge e) const {
        return c < e.c;
    }
};

struct query {
    int a, b;
};

struct mid {
    long long val, queryIdx;
    bool operator<(const mid m) const {
        return val < m.val;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m;
    for(int i=0;i<n;i++) cin >> c[i];

    vector<edge> edges;
    while(m--) {
        int u, v; cin >> u >> v;
        u--; v--;
        for(int i=0;i<n;i++) {
            edges.push_back({node(i, u), node(i, v), c[i]*max(c[u], c[v])});
            edges.push_back({node(u, i), node(v, i), c[i]*max(c[u], c[v])});
        }
    }
    sort(edges.begin(), edges.end());

    int q; cin >> q;
    vector<query> queries(q);
    for(int i=0;i<q;i++) {
        cin >> queries[i].a >> queries[i].b;
        queries[i].a--;
        queries[i].b--;
    }

    vector<long long> left(q, 0), right(q, 1'600'000'000);
    while(true) {
        vector<mid> mids;
        for(int i=0;i<q;i++) {
            if(left[i]<right[i]) {
                mids.push_back({(left[i]+right[i])/2, i});
            }
        }
        if(mids.empty()) break;
        sort(mids.begin(), mids.end());

        for(int i=0;i<n*n;i++) parent[i]=i;

        int idx=0;
        for(int i=0;i<edges.size();i++) {
            while(idx<mids.size() && (mids[idx].val<edges[i].c || i==edges.size()-1)) {
                long long queryVal = mids[idx].val;
                int queryIdx = mids[idx].queryIdx;
                if(i==edges.size()-1 && edges[i].c <= queryVal) _union(edges[i].a, edges[i].b);
                if(_find(node(queries[queryIdx].a, queries[queryIdx].b)) == _find(node(queries[queryIdx].b, queries[queryIdx].a))) right[queryIdx] = queryVal;
                else left[queryIdx] = queryVal+1;
                idx++;
            }
            _union(edges[i].a, edges[i].b);
        }
    }
    for(int i=0;i<q;i++) cout << left[i] << '\n';
}