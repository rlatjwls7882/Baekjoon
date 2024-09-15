#include<bits/stdc++.h>
using namespace std;

struct Pos {
    long long e, d;
    bool operator<(const Pos a) const {
        return this->d > a.d;
    }
};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    long long N, K, X, Y; cin >> N >> K >> X >> Y;
    vector<vector<Pos>> walk(N), road(N);
    while(X-->0) {
        int s, e, d; cin >> s >> e >> d;
        walk[s-1].push_back({e-1, d});
        walk[e-1].push_back({s-1, d});
    }
    while(Y-->0) {
        int s, e, d; cin >> s >> e >> d;
        road[s-1].push_back({e-1, d});
        road[e-1].push_back({s-1, d});
    }

    bool visited[N] = {false, };
    priority_queue<Pos> pq; pq.push({0, 0});
    while(!pq.empty()) {
        Pos cur = pq.top(); pq.pop();
        if(visited[cur.e]) continue;
        visited[cur.e]=true;
        if(cur.e==N-1) {
            cout << cur.d;
            return 0;
        }

        for(Pos next:walk[cur.e]) {
            if(!visited[next.e]) {
                pq.push({next.e, cur.d+next.d});
            }
        }
        for(Pos next:road[cur.e]) {
            if(!visited[next.e]) {
                pq.push({next.e, max(0LL, K-cur.d) + cur.d+next.d});
            }
        }
    }
}