#include <bits/stdc++.h>
using namespace std;

struct Score {
    int b, remain;
    Score(int remain, int b) {
        this->remain=remain;
        this->b=b;
    }

    bool operator<(Score a) const {
        return min(this->remain, this->b) < min(a.remain, a.b);
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;

    int a[M];
    for(int i=0;i<M;i++) {
        cin >> a[i];
    }

    int b[M];
    for(int i=0;i<M;i++) {
        cin >> b[i];
    }

    int total=0;
    priority_queue<Score> pq;
    for(int i=0;i<M;i++) {
        if(a[i]!=100) pq.push(Score(100-a[i], b[i]));
        total += a[i];
    }

    for(int i=0;i<24*N && !pq.empty();i++) {
        Score cur = pq.top(); pq.pop();
        total += min(cur.remain, cur.b);
        cur.remain -= min(cur.remain, cur.b);
        if(cur.remain!=0) pq.push(cur);
    }
    cout << total;
}