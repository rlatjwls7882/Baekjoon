#include<bits/stdc++.h>
using namespace std;

int a[8];
int n, k, minCnt=INT_MAX;
vector<vector<int>> conn(8);

void dfs(int depth, int cnt) {
    if(depth==k) {
        for(int i=0;i<n-1;i++) {
            if(a[i]!=a[i+1]) return;
        }
        minCnt = min(minCnt, cnt);
        return;
    }

    for(int i=1;i<=5;i++) {
        for(int next:conn[depth]) a[next] = (a[next]+depth+1)%5;
        dfs(depth+1, cnt+i%5);
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> n >> k;
    for(int i=0;i<n;i++) cin >> a[i];

    for(int i=0;i<k;i++) {
        int cnt; cin >> cnt;
        while(cnt-->0) {
            int b; cin >> b;
            conn[i].push_back(b-1);
        }
    }
    dfs(0, 0);
    if(minCnt==INT_MAX) cout << -1;
    else cout << minCnt;
}