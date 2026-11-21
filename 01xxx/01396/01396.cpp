#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'000;

int parent[MAX], cnt[MAX], queries[MAX][2], res[MAX][2];

int _find(int x) {
    if(x==parent[x]) return x;
    return parent[x] = _find(parent[x]);
}

void _union(int x, int y) {
    x = _find(x);
    y = _find(y);
    if(x==y) return;
    if(x<y) {
        parent[y] = x;
        cnt[x] += cnt[y];
    } else {
        parent[x] = y;
        cnt[y] += cnt[x];
    }
}

struct edge {
    int a, b, c;
    bool operator<(const edge q) const {
        return c < q.c;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;

    vector<edge> edges;
    for(int i=0;i<m;i++) {
        int a, b, c; cin >> a >> b >> c;
        edges.push_back({a-1, b-1, c});
    }
    sort(edges.begin(), edges.end());

    int q; cin >> q;
    for(int i=0;i<q;i++) {
        cin >> queries[i][0] >> queries[i][1];
        queries[i][0]--;
        queries[i][1]--;
    }

    int left[MAX] = {0, }, right[MAX];
    fill(right, right+q, m);

    while(true) {
        bool chk=false;
        vector<vector<int>> mids(m);
        for(int i=0;i<q;i++) {
            if(left[i]<m && left[i]<right[i]) {
                chk=true;
                mids[(left[i]+right[i])/2].push_back(i);
            }
        }
        if(!chk) break;

        for(int i=0;i<n;i++) {
            parent[i]=i;
            cnt[i]=1;
        }

        for(int i=0;i<m;i++) {
            _union(edges[i].a, edges[i].b);
            for(int idx : mids[i]) {
                if(_find(queries[idx][0]) == _find(queries[idx][1])) {
                    right[idx] = i;
                    res[idx][0] = edges[i].c;
                    res[idx][1] = cnt[_find(queries[idx][0])];
                } else {
                    left[idx] = i+1;
                }
            }
        }
    }
    for(int i=0;i<q;i++) {
        if(left[i]==m) cout << "-1\n";
        else cout << res[i][0] << ' ' << res[i][1] << '\n';
    }
}