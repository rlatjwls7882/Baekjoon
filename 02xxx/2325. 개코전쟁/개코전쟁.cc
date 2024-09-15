#include<bits/stdc++.h>
using namespace std;

struct Edge {
    int v, t, edgeNum, beforeNode;
    Edge(int v, int t, int edgeNum, int beforeNode) {
        this->v=v;
        this->t=t;
        this->edgeNum=edgeNum;
        this->beforeNode=beforeNode;
    }

    bool operator<(const Edge a) const {
        return this->t>a.t;
    }
};

int N;
int prevNode[1001][2];
vector<vector<Edge>> connect = vector<vector<Edge>>(1001);

void construct() {
    priority_queue<Edge> pq; pq.push(Edge(1, 0, -1, -1));
    while(!pq.empty()) {
        Edge cur = pq.top(); pq.pop();
        if(prevNode[cur.v][0]!=-2) continue;
        prevNode[cur.v][0] = cur.beforeNode;
        prevNode[cur.v][1] = cur.edgeNum;
        if(cur.v==N) break;

        for(Edge next:connect[cur.v]) {
            if(prevNode[next.v][0]==-2) {
                pq.push(Edge(next.v, cur.t+next.t, next.edgeNum, cur.v));
            }
        }
    }
}

int dijkstra(int prohibit) {
    priority_queue<Edge> pq; pq.push(Edge(1, 0, -1, -1));
    bool visited[N+1] = {false, };
    while(!pq.empty()) {
        Edge cur = pq.top(); pq.pop();
        if(visited[cur.v]) continue;
        visited[cur.v]=true;
        if(cur.v==N) return cur.t;

        for(Edge next:connect[cur.v]) {
            if(!visited[next.v] && next.edgeNum!=prohibit) {
                pq.push(Edge(next.v, cur.t+next.t, -1, -1));
            }
        }
    }
    return -1;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int M; cin >> N >> M;
    for(int i=0;i<M;i++) {
        int a, b, t; cin >> a >> b >> t;
        connect[a].push_back(Edge(b, t, i, -1));
        connect[b].push_back(Edge(a, t, i, -1));
    }

    for(int i=1;i<=N;i++) {
        for(int j=0;j<2;j++) {
            prevNode[i][j]=-2;
        }
    }
    construct();

    int maxTime=0;
    for(int i=N;i!=1;i=prevNode[i][0]) {
        maxTime = max(maxTime, dijkstra(prevNode[i][1]));
    }
    cout << maxTime;
}