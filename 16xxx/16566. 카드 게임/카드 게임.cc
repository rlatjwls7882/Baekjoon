#include<bits/stdc++.h>
using namespace std;

const int MAX = 4'000'002;

int parent[MAX];

int _find(int x) {
    if(parent[x]==x) return x;
    return parent[x] = _find(parent[x]);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, k; cin >> n >> m >> k;

    for(int i=1;i<=n;i++) parent[i]=i+1;

    while(m--) {
        int num; cin >> num;
        parent[num] = num;
    }
    while(k--) {
        int num; cin >> num;
        int val = _find(num+1);
        parent[val] = val+1;
        cout << val << '\n';
    }
}