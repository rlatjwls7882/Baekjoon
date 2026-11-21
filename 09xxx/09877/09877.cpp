#include<bits/stdc++.h>
using namespace std;

int grid[500][500], parent[250000], _size[250000];

int _find(int x) {
    if(x==parent[x]) return x;
    return parent[x] = _find(parent[x]);
}

void _union(int x, int y) {
    x = _find(x);
    y = _find(y);
    if(x<y) {
        parent[y]=x;
        _size[x] += _size[y];
    } else if(x>y) {
        parent[x]=y;
        _size[y] += _size[x];
    }
}

struct edge {
    int a, b, c;
    bool operator<(const edge e) const {
        return c < e.c;
    }
    bool operator==(const edge e) const {
        return a == e.a && b == e.b && c == e.c;
    }
};

struct mid {
    int val, idx;
    bool operator<(const mid m) const {
        return val < m.val;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int m, n, t; cin >> m >> n >> t;
    for(int i=0;i<m;i++) for(int j=0;j<n;j++) cin >> grid[i][j];

    vector<edge> edges;
    for(int i=0;i<m;i++) {
        for(int j=0;j<n;j++) {
            if(i+1<m) edges.push_back({i*n+j, (i+1)*n+j, abs(grid[i][j]-grid[i+1][j])});
            if(j+1<n) edges.push_back({i*n+j, i*n+j+1, abs(grid[i][j]-grid[i][j+1])});
        }
    }
    sort(edges.begin(), edges.end());

    vector<int> query;
    for(int i=0;i<m;i++) {
        for(int j=0;j<n;j++) {
            int start; cin >> start;
            if(start) query.push_back(i*n+j);
        }
    }

    vector<int> left(query.size()), right(query.size(), 1'000'000'000);
    while(true) {
        vector<mid> mids;
        for(int i=0;i<query.size();i++) {
            if(left[i]<right[i]) {
                mids.push_back({(left[i]+right[i])/2, i});
            }
        }
        if(mids.empty()) break;
        sort(mids.begin(), mids.end());

        for(int i=0;i<n*m;i++) {
            parent[i]=i;
            _size[i]=1;
        }

        int idx=0;
        for(edge e:edges) {
            while(idx<mids.size() && (mids[idx].val<e.c || e == edges.back())) {
                mid cur = mids[idx];
                if(cur.val>=e.c) _union(e.a, e.b); // 마지막 간선 예외처리
                if(_size[_find(query[cur.idx])]>=t) right[cur.idx] = cur.val;
                else left[cur.idx] = cur.val+1;
                idx++;
            }
            _union(e.a, e.b);
        }
    }

    long long sum=0;
    for(int e : left) sum += e;
    cout << sum;
}