#include<bits/stdc++.h>
using namespace std;

long long _size[100000];
long long before[100000] = {0, };
int parent[100000];
const long long MOD = 1000000000;

struct Bridge {
    int x, y, w;
};

int search(int x) {
    if(parent[x]==x) return x;
    return parent[x] = search(parent[x]);
}

bool merge(int x, int y) {
    x = search(x);
    y = search(y);

    if(x==y) return false;
    if(x<y) {
        parent[y]=x;
        _size[x]+=_size[y];
        before[x]+=before[y];
    } else {
        parent[x]=y;
        _size[y]+=_size[x];
        before[y]+=before[x];
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    long long sum=0;
    vector<Bridge> v;
    for(int i=0;i<M;i++) {
        int x, y, w; cin >> x >> y >> w;
        v.push_back({x, y, w});
        sum += w;
    }
    sort(v.begin(), v.end(), [](Bridge a, Bridge b) {return a.w > b.w;});

    for(int i=0;i<N;i++) {
        parent[i]=i;
        _size[i]=1;
    }

    long long cost=0;
    for(int i=0;i<M;i++) {
        if(merge(v[i].x-1, v[i].y-1)) {
            search(v[i].x-1);
            int x = parent[v[i].x-1];
            cost = (cost+(_size[x]*(_size[x]-1)/2-before[x])*sum)%MOD;
            before[x] = _size[x]*(_size[x]-1)/2;
        }
        sum -= v[i].w;
    }
    cout << cost;
}