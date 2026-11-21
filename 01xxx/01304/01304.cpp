#include<bits/stdc++.h>
using namespace std;

int parent[3001], _size[3001];

int _find(int x) {
    if(parent[x]==x) return x;
    return parent[x] = _find(parent[x]);
}

void merge(int x, int y) {
    x = _find(x);
    y = _find(y);
    if(x<y) {
        parent[y] = x;
        _size[x] += _size[y];
    } else if(x>y) {
        parent[x] = y;
        _size[y] += _size[x];
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;

    // union find로 크기 계산
    for(int i=1;i<=n;i++) {
        parent[i]=i;
        _size[i]=1;
    }

    while(m--) {
        int s, e; cin >> s >> e;
        if(s>e) {
            for(int i=e+1;i<=s;i++) merge(e, i);
        }
    }

    vector<int> sizes;
    for(int i=1;i<=n;i++) {
        if(parent[i]==i) {
            sizes.push_back(_size[i]);
        }
    }

    // 그리디 누적으로 최대 집합수 계산
    for(int i=1;i<=n;i++) {
        int sum=0;
        for(int size : sizes) {
            if(sum==i) sum=0;
            if(sum+size>i) break;
            sum += size;
        }
        if(sum==i) {
            cout << n/i;
            return 0;
        }
    }
}