#include<bits/stdc++.h>
using namespace std;

const int MAX = 200001;

vector<vector<int>> conn(MAX);
int parent[MAX];
long long curWater[MAX], dam[MAX], need[MAX], minNeed=LONG_LONG_MAX;

void dfs(int cur) {
    need[cur] = dam[cur] - curWater[cur] + (parent[cur]!=-1 ? max(need[parent[cur]]-dam[cur], 0LL) : 0);
    minNeed = min(minNeed, need[cur]);
    for(int next:conn[cur]) {
        if(need[next]==0) {
            dfs(next);
        }
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    long long n, w; cin >> n >> w;
    dam[0] = w;
    parent[0] = -1;

    for(int i=1;i<=n;i++) {
        long long d, c, u; cin >> d >> c >> u;
        conn[d].push_back(i);
        parent[i] = d;
        curWater[i] = u;
        dam[i] = c;
    }
    dfs(0);
    cout << minNeed;
}