#include<bits/stdc++.h>
using namespace std;

struct Problem {
    int deadLine, cnt;
    bool operator<(const Problem a) const {
        return this->cnt<a.cnt;
    }
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    vector<Problem> problems;
    int curDeadLine=0;
    for(int i=0;i<N;i++) {
        int a, b; cin >> a >> b;
        problems.push_back({a, b});
        curDeadLine = max(curDeadLine, a);
    }
    sort(problems.begin(), problems.end(), [](auto a, auto b){return a.deadLine>b.deadLine;});

    priority_queue<Problem> pq;
    int cnt=0, problemIdx=0;
    while(curDeadLine>0) {
        while(problemIdx<N && problems[problemIdx].deadLine==curDeadLine) {
            pq.push(problems[problemIdx++]);
        }

        if(!pq.empty()) {
            cnt += pq.top().cnt;
            pq.pop();
        }
        curDeadLine--;
    }
    cout << cnt;
}