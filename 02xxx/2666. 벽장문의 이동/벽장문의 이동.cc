#include <bits/stdc++.h>
using namespace std;

int n, m, minCnt=INT_MAX;
int open[20];

void dfs(int a, int b, int cnt, int depth) {
    if(depth==m) {
        minCnt = min(minCnt, cnt);
        return;
    }
    if(open[depth]<=a) dfs(open[depth], b, cnt + a-open[depth], depth+1);
    else if(open[depth]>=b) dfs(a, open[depth], cnt + open[depth]-b, depth+1);
    else {
        dfs(open[depth], b, cnt + open[depth]-a, depth+1);
        dfs(a, open[depth], cnt + b-open[depth], depth+1);
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int a, b; cin >> n >> a >> b >> m;
    for(int i=0;i<m;i++) cin >> open[i];

    if(a>b) swap(a, b);
    dfs(a, b, 0, 0);
    cout << minCnt;
}