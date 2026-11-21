#include<bits/stdc++.h>
using namespace std;

const int MAX = 100'001;

int n, m;
bool canGoFrom1[MAX], canGoToN[MAX];
vector<vector<int>> conn(MAX), inverseConn(MAX);

void dfs1(int cur=1) {
    canGoFrom1[cur]=true;
    for(int next:conn[cur]) {
        if(!canGoFrom1[next]) dfs1(next);
    }
}

void dfs2(int cur=n) {
    canGoToN[cur]=true;
    for(int next:inverseConn[cur]) {
        if(!canGoToN[next]) dfs2(next);
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m;
    while(m--) {
        int x, y; cin >> x >> y;
        conn[x].push_back(y);
        inverseConn[y].push_back(x);
    }
    dfs1();
    dfs2();

    int t; cin >> t;
    while(t--) {
        int c; cin >> c;
        cout << (canGoFrom1[c] && canGoToN[c] ? "Defend the CTP\n" : "Destroyed the CTP\n");
    }
}