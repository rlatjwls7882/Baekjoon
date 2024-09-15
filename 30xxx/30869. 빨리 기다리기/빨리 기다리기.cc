#include <bits/stdc++.h>
using namespace std;

bool visited[501][501] = {false, };

struct Bus {
    int e, t, g;
    Bus(int e, int t, int g) {
        this->e=e;
        this->t=t;
        this->g=g;
    }
};

struct Node {
    int cur, cost, use;
    Node(int cur, int cost, int use) {
        this->cur=cur;
        this->cost=cost;
        this->use=use;
    }

    bool operator<(Node n) const {
        return this->cost>n.cost;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M, K; cin >> N >> M >> K;

    vector<vector<Bus>> connect = vector<vector<Bus>>(N+1);
    while(M-->0) {
        int s, e, t, g; cin >> s >> e >> t >> g;
        connect[s].push_back(Bus(e, t, g));
    }

    priority_queue<Node> pq; pq.push(Node(1, 0, 0));
    while(!pq.empty()) {
        Node cur = pq.top(); pq.pop();
        if(visited[cur.cur][cur.use]) continue;
        for(int i=cur.use;i<=K;i++) {
            visited[cur.cur][i]=true;
        }
        if(cur.cur==N) {
            cout << cur.cost;
            return 0;
        }

        for(Bus next:connect[cur.cur]) {
            if(!visited[next.e][cur.use]) pq.push(Node(next.e, (cur.cost+next.g-1)/next.g*next.g+next.t, cur.use));
            if(cur.use<K && !visited[next.e][cur.use+1]) pq.push(Node(next.e, cur.cost+next.t, cur.use+1));
        }
    }
    cout << -1;
}