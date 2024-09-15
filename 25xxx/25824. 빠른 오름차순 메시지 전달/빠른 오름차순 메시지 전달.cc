#include <bits/stdc++.h>
using namespace std;

int minCost = INT_MAX;
int m[12][12];

void dfs(int depth, int cur, int cost) {
    if(depth==6) {
        minCost = min(minCost, cost);
        return;
    }
    if(cur==-1) {
        dfs(depth+1, depth*2+1, cost+m[depth*2][depth*2+1]);
        dfs(depth+1, depth*2, cost+m[depth*2+1][depth*2]);
    } else {
        dfs(depth+1, depth*2+1, cost+m[cur][depth*2]+m[depth*2][depth*2+1]);
        dfs(depth+1, depth*2, cost+m[cur][depth*2+1]+m[depth*2+1][depth*2]);
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    for(int i=0;i<12;i++) {
        for(int j=0;j<12;j++) {
            cin >> m[i][j];
        }
    }
    dfs(0, -1, 0);
    cout << minCost;
}