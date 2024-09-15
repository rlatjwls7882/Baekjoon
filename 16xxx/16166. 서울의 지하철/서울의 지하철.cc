#include<bits/stdc++.h>
using namespace std;

struct Node {
    int v, cost, subwayNum;
    bool operator<(const Node a) const {
        return this->cost>a.cost;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    map<int, vector<Node>> connect;
    for(int i=0;i<N;i++) {
        int k; cin >> k;
        int first; cin >> first;
        while(k-->1) {
            int next; cin >> next;
            connect[first].push_back({next, 0, i});
            connect[next].push_back({first, 0, i});
        }
    }
    int E; cin >> E;
    if(E==0) {
        cout << 0;
        return 0;
    }

    set<int> visited;
    priority_queue<Node> pq; pq.push({0, -1, -1});
    while(!pq.empty()) {
        Node cur = pq.top(); pq.pop();
        if(visited.count(cur.v)) continue;
        visited.insert(cur.v);
        if(cur.v==E) {
            cout << cur.cost;
            return 0;
        }

        for(Node next:connect[cur.v]) {
            if(visited.count(next.v)) continue;
            if(next.subwayNum==cur.subwayNum) pq.push({next.v, cur.cost, cur.subwayNum});
            else pq.push({next.v, cur.cost+1, next.subwayNum});
        }
    }
    cout << -1;
}