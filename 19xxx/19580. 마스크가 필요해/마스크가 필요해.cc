#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef pair<ll, ll> P;

struct citizen {
    ll s, e;
    bool operator<(const citizen c) const {
        if(s!=c.s) return s < c.s;
        return e < c.e;
    }
};

struct citizenPQ {
    ll s, e;
    citizenPQ(citizen c) {
        s = c.s;
        e = c.e;
    }
    bool operator<(const citizenPQ c) const {
        if(e!=c.e) return e > c.e;
        return s > c.s;
    }
};

struct store {
    ll p, x;
    bool operator<(const store s) const {
        return p < s.p;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    vector<citizen> citizens(n);
    for(int i=0;i<n;i++) cin >> citizens[i].s >> citizens[i].e;
    sort(citizens.begin(), citizens.end());

    vector<store> stores(m);
    for(int i=0;i<m;i++) cin >> stores[i].p >> stores[i].x;
    sort(stores.begin(), stores.end());

    int cnt=0, citizenIdx=0;
    priority_queue<citizenPQ> pq;
    for(store s : stores) {
        while(citizenIdx<n && citizens[citizenIdx].s<=s.p) {
            pq.push(citizens[citizenIdx++]);
        }
        while(s.x && !pq.empty()) {
            auto cur = pq.top(); pq.pop();
            if(cur.s<=s.p && s.p<=cur.e) {
                cnt++;
                s.x--;
            }
        }
    }
    cout << cnt;
}