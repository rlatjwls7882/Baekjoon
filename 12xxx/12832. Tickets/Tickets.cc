#include<bits/stdc++.h>
using namespace std;

int parent[100'001], mapping[100'001];

int _find(int x) {
    if(x==parent[x]) return x;
    return parent[x] = _find(parent[x]);
}

struct element {
    int l, r, idx;
    bool operator<(const element e) const {
        if(r!=e.r) return r<e.r;
        return r-l>e.r-e.l;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=1;i<=n;i++) parent[i]=i;

    vector<element> v(m);
    for(int i=0;i<m;i++) {
        cin >> v[i].l >> v[i].r;
        v[i].idx=i+1;
    }
    sort(v.begin(), v.end());

    for(auto e:v) {
        int first = _find(e.l);
        if(first<=e.r) {
            parent[first]=_find(first+1);
            mapping[first]=e.idx;
        }
    }

    vector<int> res;
    for(int i=1;i<=n;i++) {
        if(mapping[i]) res.push_back(i);
    }
    cout << res.size() << '\n';
    for(int e:res) cout << e << ' ' << mapping[e] << '\n';
}