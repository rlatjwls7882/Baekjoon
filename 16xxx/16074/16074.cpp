#include<bits/stdc++.h>
using namespace std;

const int MAX = 250001;

int parent[MAX], h[500][500], m, n, q;

struct edge {
    int a, b, c;
    bool operator<(const edge e) const {
        return c < e.c;
    }
    bool operator==(const edge e) const {
        return a == e.a && b == e.b && c == e.c;
    }
};

struct query {
    int x1, y1, x2, y2;
};

int _find(int x) {
    if(x==parent[x]) return x;
    return parent[x] = _find(parent[x]);
}

void _union(int x, int y) {
    x = _find(x);
    y = _find(y);
    if(x<y) parent[y]=x;
    else parent[x]=y;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> m >> n >> q;
    for(int i=0;i<m;i++) for(int j=0;j<n;j++) cin >> h[i][j];

    vector<edge> edges;
    for(int i=0;i<m;i++) {
        for(int j=0;j<n;j++) {
            if(i+1<m) {
                if(h[i][j]>=h[i+1][j]) edges.push_back({i*n+j, (i+1)*n+j, h[i][j]});
                else edges.push_back({(i+1)*n+j, i*n+j, h[i+1][j]});
            }
            if(j+1<n) {
                if(h[i][j]>=h[i][j+1]) edges.push_back({i*n+j, i*n+j+1, h[i][j]});
                else edges.push_back({i*n+j+1, i*n+j, h[i][j+1]});
            }
        }
    }
    sort(edges.begin(), edges.end());

    vector<query> queries(q);
    vector<int> left(q, 1), right(q, 1'000'000);
    for(int i=0;i<q;i++) {
        cin >> queries[i].x1 >> queries[i].y1 >> queries[i].x2 >> queries[i].y2;
        queries[i].x1--;
        queries[i].x2--;
        queries[i].y1--;
        queries[i].y2--;

        // 출발점과 도착점이 같은 경우
        if(queries[i].x1 == queries[i].x2 && queries[i].y1 == queries[i].y2) left[i] = right[i] = h[queries[i].x1][queries[i].y1];
    }

    while(true) {
        bool chk=false;
        vector<vector<int>> mids(1'000'001);
        for(int i=0;i<q;i++) {
            if(left[i]<right[i]) {
                chk=true;
                mids[(left[i]+right[i])/2].push_back(i);
            }
        }
        if(!chk) break;

        for(int i=0;i<n*m;i++) parent[i]=i;

        int mid=0;
        for(edge e : edges) {
            while(mid<e.c || mid<1'000'000 && e == edges.back()) {
                if(mid>=e.c) _union(e.a, e.b); // 마지막 간선 예외처리
                for(int i : mids[mid]) {
                    if(_find(queries[i].x1*n+queries[i].y1) == _find(queries[i].x2*n+queries[i].y2)) right[i] = mid;
                    else left[i] = mid+1;
                }
                mid++;
            }
            _union(e.a, e.b);
        }
    }
    for(int i=0;i<q;i++) cout << left[i] << '\n';
}