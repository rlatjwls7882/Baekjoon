#include <bits/stdc++.h>
using namespace std;

struct Pos {
    int x, cnt, last;
    bool operator<(const Pos a) const {
        return this->cnt > a.cnt;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;

    vector<vector<pair<int, int>>> conn(N);
    while(M-->0) {
        int S, E, T; cin >> S >> E >> T;
        conn[S-1].push_back({E-1, T});
        conn[E-1].push_back({S-1, T});
    }

    int A, B; cin >> A >> B;
    bool visited[N] = {false, };
    priority_queue<Pos> pq; pq.push({A-1, -1, -1});
    while(!pq.empty()) {
        Pos cur = pq.top(); pq.pop();
        if(visited[cur.x]) continue;
        visited[cur.x]=true;
        if(cur.x==B-1) {
            cout << cur.cnt;
            return 0;
        }
        for(auto nextX:conn[cur.x]) {
            Pos next = {nextX.first, cur.cnt, nextX.second};
            if(cur.last != next.last) next.cnt++;
            if(visited[next.x]) continue;
            pq.push(next);
        }
    }
}