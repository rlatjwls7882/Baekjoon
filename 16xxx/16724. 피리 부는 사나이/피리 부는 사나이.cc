#include<bits/stdc++.h>
using namespace std;

const int MAX = 1'000'000;

int parent[MAX];

int _find(int x) {
    if(parent[x]==x) return x;
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
    int n, m; cin >> n >> m;
    for(int i=0;i<n*m;i++) parent[i]=i;

    for(int i=0;i<n;i++) {
        string s; cin >> s;
        for(int j=0;j<m;j++) {
            int cur = i*m+j;
            int next;
            if(s[j]=='R') next = i*m+j+1;
            else if(s[j]=='L') next = i*m+j-1;
            else if(s[j]=='D') next = (i+1)*m+j;
            else next = (i-1)*m+j;

            _union(cur, next);
        }
    }

    int cnt=0;
    for(int i=0;i<n*m;i++) {
        if(parent[i]==i) cnt++;
    }
    cout << cnt;
}