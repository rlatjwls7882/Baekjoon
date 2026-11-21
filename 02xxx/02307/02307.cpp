#include<bits/stdc++.h>
using namespace std;

int N;

struct Edge {
    int v, t, edgeNum, beforeNode;
    Edge(int v, int t) {
        this->v=v;
        this->t=t;
    }
    Edge(int v, int t, int edgeNum) {
        this->v=v;
        this->t=t;
        this->edgeNum=edgeNum;
    }
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

vector<vector<Edge>> connect = vector<vector<Edge>>(1001);

int dijkstra(int prohibit) {
    priority_queue<Edge> pq; pq.push(Edge(1, 0));
    bool visited[N+1] = {false, };
    while(!pq.empty()) {
        Edge cur = pq.top(); pq.pop();
        if(visited[cur.v]) continue;
        visited[cur.v]=true;
        if(cur.v==N) return cur.t;

        for(Edge next:connect[cur.v]) {
            if(!visited[next.v] && next.edgeNum!=prohibit) {
                pq.push(Edge(next.v, cur.t+next.t));
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
        connect[a].push_back(Edge(b, t, i));
        connect[b].push_back(Edge(a, t, i));
    }

    int minTime = INT_MAX;
    priority_queue<Edge> pq; pq.push(Edge(1, 0, -1));
    int visit[N+1][2];
    for(int i=0;i<=N;i++) {
        for(int j=0;j<2;j++) {
            visit[i][j]=-2;
        }
    }
    while(!pq.empty()) {
        Edge cur = pq.top(); pq.pop();
        if(visit[cur.v][0]!=-2) continue;
        visit[cur.v][0] = cur.beforeNode;
        visit[cur.v][1] = cur.edgeNum;
        if(cur.v==N) {
            minTime = cur.t;
            break;
        }

        for(Edge next:connect[cur.v]) {
            if(visit[next.v][0]==-2) {
                pq.push(Edge(next.v, cur.t+next.t, next.edgeNum, cur.v));
            }
        }
    }

    if(minTime==INT_MAX) {
        cout << -1;
        return 0;
    }

    int delay=0;
    for(int i=N;i!=1;i=visit[i][0]) {
        int cur = dijkstra(visit[i][1]);
        if(cur==-1) {
            cout << -1;
            return 0;
        }
        delay = max(delay, cur-minTime);
    }
    cout << delay;
}