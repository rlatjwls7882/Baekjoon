#include<bits/stdc++.h>
using namespace std;

int y[200'000];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;

    vector<int> uniqY;
    for(int i=0;i<n;i++) {
        cin >> y[i] >> y[i];
        uniqY.push_back(y[i]);
    }
    sort(uniqY.begin(), uniqY.end());
    uniqY.erase(unique(uniqY.begin(), uniqY.end()), uniqY.end());

    n = uniqY.size();
    vector<long long> total(n+1);
    while(m--) {
        int u, v, c; cin >> u >> v >> c;
        u = lower_bound(uniqY.begin(), uniqY.end(), y[u-1])-uniqY.begin();
        v = lower_bound(uniqY.begin(), uniqY.end(), y[v-1])-uniqY.begin();
        if(u>v) swap(u, v);
        total[u]+=c;
        total[v+1]-=c;
    }

    long long res=0;
    for(int i=0;i<n;i++) {
        total[i+1] += total[i];
        res = max(res, total[i]);
    }
    cout << res;
}