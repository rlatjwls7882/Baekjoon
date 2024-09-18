#include<bits/stdc++.h>
using namespace std;

int n, k;
int val[100000];
vector<vector<int>> conn(100000);

void dfs(int cur, int depth) {
    if(val[cur]==k) cout << depth;
    for(int next:conn[cur]) {
        dfs(next, depth+1);
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> n >> k;

    bool inDegree[n] = {false, };
    for(int i=0;i<n-1;i++) {
        int a, b; cin >> a >> b;
        conn[a].push_back(b);
        inDegree[b]=true;
    }
    for(int i=0;i<n;i++) cin >> val[i];

    for(int i=0;i<n;i++) {
        if(!inDegree[i]) dfs(i, 0);
    }
}