#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    priority_queue<int> pq;
    while(n-->0) {
        int cur; cin >> cur;
        pq.push(cur);
    }

    int cnt=0;
    while(!pq.empty()) {
        if(pq.size()>=2) {
            int t1 = pq.top(); pq.pop();
            int t2 = pq.top(); pq.pop();
            if(t1>1) pq.push(t1-1);
            if(t2>1) pq.push(t2-1);
        } else {
            int t = pq.top(); pq.pop();
            if(t>1) pq.push(t-1);
        }
        cnt++;
    }
    if(cnt>1440) cout << -1;
    else cout << cnt;
}