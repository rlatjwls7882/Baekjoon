#include<bits/stdc++.h>
using namespace std;

struct Present {
    int t, m;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int A, B, N; cin >> A >> B >> N;

    queue<Present> remainA, remainB;
    while(N-->0) {
        int t, m; char c; cin >> t >> c >> m;
        if(c=='B') remainA.push({t, m});
        else remainB.push({t, m});
    }

    int cnt=1;
    vector<int> cntList[2];
    while(!remainA.empty() || !remainB.empty()) {
        if(remainB.empty() || !remainA.empty() && remainA.front().t<=remainB.front().t) {
            cntList[0].push_back(cnt++);
            int t = remainA.front().t+A;
            if(--remainA.front().m==0) remainA.pop();
            if(!remainA.empty()) remainA.front().t = max(remainA.front().t, t);
        } else {
            cntList[1].push_back(cnt++);
            int t = remainB.front().t+B;
            if(--remainB.front().m==0) remainB.pop();
            if(!remainB.empty()) remainB.front().t = max(remainB.front().t, t);
        }
    }

    for(int i=0;i<2;i++) {
        cout << cntList[i].size() << '\n';
        for(int e:cntList[i]) cout << e << ' ';
        cout << '\n';
    }
}