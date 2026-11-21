#include<bits/stdc++.h>
using namespace std;

int parent[100000];

struct Pipe {
    int a, b; double p;
    bool operator<(const Pipe a) const {
        return this->p > a.p;
    }
};

int search(int x) {
    if(parent[x]==x) return x;
    return parent[x] = search(parent[x]);
}

bool merge(int x, int y) {
    x = search(x);
    y = search(y);

    if(x==y) return false;
    if(x<y) parent[y]=x;
    else parent[x]=y;
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;

    vector<Pipe> v;
    for(int i=0;i<M;i++) {
        int a, b; double p; cin >> a >> b >> p;
        v.push_back({a, b, p});
    }
    sort(v.begin(), v.end());

    int Q; cin >> Q;
    vector<pair<double, int>> query;
    for(int i=0;i<Q;i++) {
        double p; cin >> p;
        query.push_back({p, i});
    }
    sort(query.begin(), query.end(), [](pair<double, int> a, pair<double, int> b) {return a.first > b.first;});

    for(int i=0;i<N;i++) {
        parent[i]=i;
    }

    int cnt=N, idx=0;
    vector<pair<int, int>> res;
    for(int i=0;i<Q;i++) {
        while(idx<M && v[idx].p>=query[i].first) {
            if(merge(v[idx].a-1, v[idx].b-1)) cnt--;
            idx++;
        }
        res.push_back({cnt, query[i].second});
    }

    sort(res.begin(), res.end(), [](pair<int, int> a, pair<int, int> b) {return a.second < b.second;});
    for(auto val:res) {
        cout << val.first << '\n';
    }
}