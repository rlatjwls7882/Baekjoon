#include<bits/stdc++.h>
using namespace std;

int n, m, k;
int dx[] = {0, 0, 1, -1};
int dy[] = {-1, 1, 0, 0};
int parent[250000], cnt[250000];

int _find(int x) {
    if(parent[x]==x) return x;
    return parent[x] = _find(parent[x]);
}

bool _union(int x, int y) {
    x = _find(x);
    y = _find(y);
    if(x==y) return false;
    if(x<y) {
        parent[y] = x;
        cnt[x] += cnt[y];
    } else {
        parent[x] = y;
        cnt[y] += cnt[x];
    }
    return true;
}

int getPos(int x, int y) {
    return x*m+y;
}

void dfs(int x, int y) {
    for(int i=0;i<4;i++) {
        int nx = x+dx[i];
        int ny = y+dy[i];
        if(nx<0 || nx>=n || ny<0 || ny>=m || cnt[getPos(nx, ny)]==-1) continue;
        if(!_union(getPos(x, y), getPos(nx, ny))) continue;
        dfs(nx, ny);
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m >> k;

    for(int i=0;i<n*m;i++) {
        parent[i]=i;
        cnt[i]=1;
    }
    while(k--) {
        int x, y; cin >> x >> y;
        cnt[getPos(x-1, y-1)]=-1;
    }
    int x1, y1, x2, y2, x3, y3, x4, y4;
    cin >> x1 >> y1 >> x2 >> y2 >> x3 >> y3 >> x4 >> y4;
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            if(cnt[getPos(i, j)]!=-1 && !(x3-1<=i && i<=x4-1 && y3-1<=j && j<=y4-1)) {
                cnt[getPos(i, j)]=0;
            }
        }
    }

    long long total=0;
    for(int i=x1-1;i<x2;i++) {
        for(int j=y1-1;j<y2;j++) {
            if(cnt[getPos(i, j)]!=-1) {
                dfs(i, j);
                total += cnt[_find(getPos(i, j))];
            }
        }
    }
    cout << total;
}