#include<bits/stdc++.h>
using namespace std;

struct Node {
    int val, idx;
    bool operator<(const Node n) const {
        return val < n.val;
    }
};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    priority_queue<Node> pq;
    for(int i=1;i<=n;i++) {
        int a; cin >> a;
        if(a) pq.push({a, i});
    }

    vector<pair<int, int>> ret;
    while(pq.size()>=2) {
        Node top1 = pq.top(); pq.pop();
        Node top2 = pq.top(); pq.pop();
        ret.push_back({top1.idx, top2.idx});
        if(top1.val>1) pq.push({top1.val-1, top1.idx});
        if(top2.val>1) pq.push({top2.val-1, top2.idx});
    }

    if(pq.empty()) {
        cout << "yes\n";
        for(auto e:ret) cout << e.first << ' ' << e.second << '\n';
    } else {
        cout << "no";
    }
}