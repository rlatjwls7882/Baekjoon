#include<bits/stdc++.h>
using namespace std;

struct Lecture {
    int t, cost;
    Lecture(int t, int cost) {
        this->t=t;
        this->cost=cost;
    }

    bool operator<(const Lecture a) const {
        if(this->t!=a.t) return this->t>a.t;
        return this->cost>a.cost;
    }
};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    priority_queue<Lecture> pq;
    while(N-->0) {
        int a, b, c; cin >> a >> b >> c;
        pq.push(Lecture(b, +1));
        pq.push(Lecture(c, -1));
    }

    int maxCost=0, curCost=0;
    while(!pq.empty()) {
        curCost += pq.top().cost; pq.pop();
        maxCost = max(maxCost, curCost);
    }
    cout << maxCost;
}