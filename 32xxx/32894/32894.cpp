#include<bits/stdc++.h>
using namespace std;

const int MAX = 300'002;

int parent[MAX], nextBig[MAX], _size[MAX], cur[MAX];

int _find(int x) {
    if(x==parent[x]) return x;
    return parent[x] = _find(parent[x]);
}

void _union(int x, int y) {
    x = _find(x);
    y = _find(y);
    if(x>y) parent[y]=x;
    else parent[x]=y;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, q; cin >> n >> q;
    for(int i=1;i<=n;i++) {
        cin >> _size[i];
        parent[i]=i;
    }
    parent[n+1]=n+1;

    vector<int> decreasing;
    for(int i=n;i>=1;i--) {
        nextBig[i]=n+1;
        while(!decreasing.empty() && _size[decreasing.back()]<=_size[i]) decreasing.pop_back();
        if(!decreasing.empty()) nextBig[i] = decreasing.back();
        decreasing.push_back(i);
    }

    while(q--) {
        char ch; int l; cin >> ch >> l;
        if(ch=='+') {
            int x; cin >> x;
            l = _find(l);
            while(l!=n+1 && x) {
                int cnt = min(x, _size[l]-cur[l]);
                cur[l] += cnt;
                x -= cnt;
                if(cur[l]==_size[l]) {
                    _union(l, nextBig[l]);
                    l = _find(l);
                }
            }
        } else {
            cout << cur[l] << '\n';
        }
    }
}