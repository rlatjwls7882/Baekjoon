#include<bits/stdc++.h>
using namespace std;

int parent[100000], _size[100000];
vector<vector<int>> connect(100000);

int _find(int x) {
    if(x==parent[x]) return x;
    return parent[x] = _find(parent[x]);
}

void _union(int x, int y) {
    x = _find(x);
    y = _find(y);

    if(x<y) {
        parent[y]=x;
        _size[x]+=_size[y];
    } else if(x>y) {
        parent[x]=y;
        _size[y]+=_size[x];
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    for(int i=0;i<N;i++) {
        parent[i]=i;
        _size[i]=1;
    }

    for(int i=0;i<N-1;i++) {
        int u, v; cin >> u >> v;
        connect[u-1].push_back(v-1);
        connect[v-1].push_back(u-1);
    }

    string C; cin >> C;
    for(int cur=0;cur<N;cur++) {
        if(C[cur]=='R') {
            for(int next:connect[cur]) {
                if(C[next]=='R') {
                    _union(cur, next);
                }
            }
        }
    }

    long long cnt=0;
    for(int cur=0;cur<N;cur++) {
        if(C[cur]=='B') {
            for(int next:connect[cur]) {
                if(C[next]=='R') {
                    cnt += _size[_find(next)];
                }
            }
        }
    }
    cout << cnt;
}