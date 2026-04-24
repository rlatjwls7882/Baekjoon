#include<bits/stdc++.h>
using namespace std;
typedef long long ll;

vector<vector<int>> child(100'000);
vector<ll> c(100'000), depth(100'000);
vector<priority_queue<ll>> pq(100'000);

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n >> c[0];
    for(int i=1;i<n;i++) {
        int p; cin >> p >> c[i];
        child[p-1].push_back(i);
        depth[i]=depth[p-1]+1;
        c[i]+=depth[i];
    }

    ll res=0;
    for(int cur=n-1;cur>=0;cur--) {
        for(int nxt:child[cur]) {
            if(pq[nxt].size()>pq[cur].size()) swap(pq[nxt], pq[cur]);
            while(!pq[nxt].empty()) {
                pq[cur].push(pq[nxt].top());
                pq[nxt].pop();
            }
        }
        pq[cur].push(c[cur]); pq[cur].push(c[cur]);
        res+=max(0LL, pq[cur].top()-c[cur]);
        pq[cur].pop();
    }
    cout << res;
}