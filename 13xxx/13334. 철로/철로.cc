#include<bits/stdc++.h>
using namespace std;

struct Pos {
    int idx, cost, anotherIdx;

    bool operator<(const Pos a) const {
        if(idx == a.idx) return cost > a.cost;
        return idx > a.idx;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    priority_queue<Pos> pq;
    while(n-->0) {
        int h, c; cin >> h >> c;
        if(h>c) swap(h, c);
        pq.push({h, 1, c});
        pq.push({c, -1, h});
    }
    int d; cin >> d;

    int maxCnt=0, cnt1=0, cnt2=0;
    queue<Pos> q;
    while(!pq.empty()) {
        Pos top = pq.top(); pq.pop();
        if(top.cost==1) cnt1++;
        else if(top.anotherIdx+d>=top.idx) cnt2++;
        while(!q.empty() && q.front().idx+d<top.idx) {
            if(q.front().cost==1) {
                cnt1--;
                if(q.front().idx+d>=q.front().anotherIdx) cnt2--;
            }
            q.pop();
        }
        maxCnt = max(maxCnt, min(cnt1, cnt2));
        q.push(top);
    }
    cout << maxCnt;
}