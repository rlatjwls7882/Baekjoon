#include<bits/stdc++.h>
using namespace std;

struct element {
    int idx, a, p;
    bool operator<(const element e) const { // pq
        return a < e.a;
    }
};

const int MAX = 100'001;

vector<element> v(MAX);
vector<priority_queue<element>> pq(10);

int chk(int idx, int k) {
    int sum=0;
    for(int i=1;i<=9;i++) {
        while(!pq[i].empty() && idx-pq[i].top().idx+1>k) pq[i].pop();
        if(pq[i].empty()) return 0;
        sum += pq[i].top().a;
    }
    return sum;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        int n, k; cin >> n >> k;
        for(int i=0;i<n;i++) cin >> v[i].p >> v[i].a;

        for(int i=1;i<=9;i++) pq[i] = {};

        int maxSum=0;
        for(int i=0;i<n;i++) {
            pq[v[i].p].push({i, v[i].a});
            maxSum = max(maxSum, chk(i, k));
        }
        cout << maxSum << '\n';
    }
}