#include<bits/stdc++.h>
using namespace std;

struct work {
    int d, t;
    bool operator<(const work a) const {
        return t < a.t;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    priority_queue<work> pq;
    while(n--) {
        int d, t; cin >> d >> t;
        pq.push({d, t});
    }

    int last=INT_MAX;
    while(!pq.empty()) {
        auto top = pq.top(); pq.pop();
        last = min(last, top.t)-top.d;
    }
    cout << last;
}