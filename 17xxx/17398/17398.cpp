#include<bits/stdc++.h>
using namespace std;

long long _size[100000];
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

long long merge(int x, int y) {
    x = search(x);
    y = search(y);

    if(x==y) return 0;
    long long tmp=_size[x]*_size[y];
    if(x<y) {
        parent[y]=x;
        _size[x]+=_size[y];
    } else {
        parent[x]=y;
        _size[y]+=_size[x];
    }
    return tmp;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M, Q; cin >> N >> M >> Q;
    vector<pair<int, int>> bridge;
    for(int i=0;i<M;i++) {
        int a, b; cin >> a >> b;
        bridge.push_back({a-1, b-1});
    }

    bool destroy[M] = {false, };
    int query[Q];
    for(int i=0;i<Q;i++) {
        cin >> query[i];
        query[i]--;
        destroy[query[i]]=true;
    }

    for(int i=0;i<N;i++) {
        parent[i]=i;
        _size[i]=1;
    }
    for(int i=0;i<M;i++) {
        if(!destroy[i]) {
            merge(bridge[i].first, bridge[i].second);
        }
    }

    long long cost=0;
    for(int i=Q-1;i>=0;i--) {
        cost += merge(bridge[query[i]].first, bridge[query[i]].second);
    }
    cout << cost;
}