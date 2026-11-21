#include <bits/stdc++.h>
using namespace std;

int parent[1000];

int _find(int x) {
    if(parent[x]==x) return x;
    return parent[x] = _find(parent[x]);
}

bool _union(int x, int y) {
    x = _find(x);
    y = _find(y);

    if(x==y) return false;
    else if(x<y) parent[y]=x;
    else parent[x]=y;
    return true;
}

struct Connect {
    int a, b, c;
    Connect(int a, int b, int c) {
        this->a=a;
        this->b=b;
        this->c=c;
    }
};

struct Edges {
    int a, c;
    Edges(int a, int c) {
        this->a=a;
        this->c=c;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;
    for(int i=0;i<N;i++) {
        parent[i]=i;
    }

    vector<Connect> v;
    for(int i=0;i<K;i++) {
        int a, b, c; cin >> a >> b >> c;
        v.push_back(Connect(a, b, c));
    }
    sort(v.begin(), v.end(), [](Connect a, Connect b){ return a.c<b.c; } );

    int cost=0;
    vector<vector<Edges>> E = vector<vector<Edges>>(N);
    for(int i=0;i<K;i++) {
        if(_union(v[i].a, v[i].b)) {
            cost += v[i].c;
            E[v[i].a].push_back(Edges(v[i].b, v[i].c));
            E[v[i].b].push_back(Edges(v[i].a, v[i].c));
        }
    }
    cout << cost << '\n';

    int maxCost=0;
    for(int i=0;i<N;i++) {
        bool visited[N] = {false, };
        visited[i]=true;
        queue<Edges> q; q.push(Edges(i, 0));
        while(!q.empty()) {
            Edges cur = q.front(); q.pop();
            for(Edges next:E[cur.a]) {
                if(!visited[next.a]) {
                    visited[next.a]=true;
                    q.push(Edges(next.a, cur.c+next.c));
                }
            }
            maxCost = max(maxCost, cur.c);
        }
    }
    cout << maxCost;
}