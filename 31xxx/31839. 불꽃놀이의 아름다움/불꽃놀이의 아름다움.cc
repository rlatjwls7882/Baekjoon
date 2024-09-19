#include<bits/stdc++.h>
using namespace std;

long long maxBeautiSum=0;
vector<vector<int>> conn(200000);
long long beautiSum[200000];
long long beauti[200000];
long long sum[200000];

void dfs(int cur, int depth) {
    beautiSum[cur] = beauti[cur];
    sum[cur] = beauti[cur]*depth;
    for(int next:conn[cur]) {
        if(sum[next]==-1) {
            dfs(next, depth+1);
            sum[cur] += sum[next];
            beautiSum[cur] += beautiSum[next];
        }
    }
}

void findMaxBeautiSum(int cur, long long curBeautiSum) {
    maxBeautiSum = max(maxBeautiSum, curBeautiSum);
    for(int next:conn[cur]) {
        long long nextBeautiSum = curBeautiSum-beautiSum[next]+(beautiSum[0]-beautiSum[next]);
        if(beautiSum[next]<beautiSum[cur]) findMaxBeautiSum(next, nextBeautiSum);
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    for(int i=0;i<n-1;i++) {
        int a, b; cin >> a >> b;
        conn[a-1].push_back(b-1);
        conn[b-1].push_back(a-1);
    }
    for(int i=0;i<n;i++) cin >> beauti[i];
    fill(sum, sum+n, -1);
    dfs(0, 0);
    findMaxBeautiSum(0, sum[0]);
    cout << maxBeautiSum;
}