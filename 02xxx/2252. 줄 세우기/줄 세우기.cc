#include<bits/stdc++.h>
using namespace std;

const int MAX = 32'001;

int inBound[MAX];
vector<vector<int>> conn(MAX);

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    while(m--) {
        int a, b; cin >> a >> b;
        inBound[b]++;
        conn[a].push_back(b);
    }

    queue<int> q;
    for(int i=1;i<=n;i++) {
        if(!inBound[i]) {
            q.push(i);
        }
    }

    while(!q.empty()) {
        int cur = q.front(); q.pop();
        cout << cur << ' ';
        for(int next:conn[cur]) {
            if(--inBound[next]==0) q.push(next);
        }
    }
}