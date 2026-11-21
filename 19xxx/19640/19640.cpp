#include<bits/stdc++.h>
using namespace std;

const int MAX = 100000;

int d[MAX], h[MAX];

struct element {
    int idx, d, h, lineNo;
    bool operator<(const element e) const {
        if(d != e.d) return d < e.d;
        if(h != e.h) return h < e.h;
        return lineNo > e.lineNo;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, k; cin >> n >> m >> k;
    for(int i=0;i<n;i++) cin >> d[i] >> h[i];

    priority_queue<element> pq;
    for(int i=0;i<m && i<n;i++) {
        pq.push({i, d[i], h[i], i});
    }

    int cnt=0;
    while(true) {
        element cur = pq.top(); pq.pop();
        if(cur.idx == k) {
            cout << cnt++;
            return 0;
        }
        cnt++;
        if(cur.idx+m<n) pq.push({cur.idx+m, d[cur.idx+m], h[cur.idx+m], cur.lineNo});
    }
}