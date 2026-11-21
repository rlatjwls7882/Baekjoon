#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

#define sz(x) (int)(x).size()
#define all(x) x.begin(), x.end()

typedef long long ll;

struct element {
    ll sum, r, c;
    bool operator<(const element e) const {
        return sum > e.sum;
    }
};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, k; cin >> n >> k;
    vector<vector<ll>> v;
    ll res=0;
    for(int i=0;i<n;i++) {
        int m; cin >> m;
        vector<ll> cur(m);
        for(int j=0;j<m;j++) cin >> cur[j];
        sort(all(cur));
        res+=cur[0];
        if(m>1) {
            v.push_back({});
            for(int j=1;j<m;j++) v.back().push_back(cur[j]-cur[j-1]);
        }
    }
    res*=k;
    sort(all(v));
    if(k!=1) {
        priority_queue<element> pq; pq.push({v[0][0], 0, 0});
        for(int i=1;i<k;i++) {
            auto [sum, r, c] = pq.top(); pq.pop();
            res+=sum;
            if(c+1<sz(v[r])) pq.push({sum+v[r][c+1], r, c+1});
            if(r+1<sz(v)) {
                pq.push({sum+v[r+1][0], r+1, 0});
                if(c==0) pq.push({sum-v[r][0]+v[r+1][0], r+1, 0});
            }
        }
    }
    cout << res;
}