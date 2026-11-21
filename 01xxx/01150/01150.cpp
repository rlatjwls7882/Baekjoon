#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

struct element {
    int l, r, dist;
    bool operator<(const element e) const {
        return dist > e.dist;
    }
} pos[100'003];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, k; cin >> n >> k;

    int last; cin >> last;
    priority_queue<element> pq;
    for(int i=1;i<n;i++) {
        int cur; cin >> cur;
        pos[i].l=i-1;
        pos[i].r=i+1;
        pos[i].dist=cur-last;
        pq.push({i, i+1, cur-last});
        last=cur;
    }
    pos[n] = {n-1, n+1, 0};

    int res=0;
    while(k) {
        auto cur = pq.top(); pq.pop();
        int cl=cur.l, cr=cur.r;
        if(cl>=1 && cr<=n && cr==pos[cl].r && cl==pos[cr].l) {
            res+=cur.dist;
            k--;
            int nl = pos[cl].l, nr = pos[cr].r;
            pos[nl].dist=pos[nl].dist+pos[cr].dist-cur.dist;
            cur.l=nl; cur.r=nr;
            cur.dist = pos[nl].dist;
            pq.push(cur);
            pos[nl].r=nr;
            pos[nr].l=nl;
        }
    }
    cout << res;
}