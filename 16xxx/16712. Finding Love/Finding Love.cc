#include<bits/stdc++.h>
using namespace std;

int q[500];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<n;i++) cin >> q[i];

    priority_queue<int, vector<int>, greater<int>> pq, tmp;
    for(int i=0;i<n;i++) {
        pq.push(q[i]);
        if(pq.size()>m-1) {
            int v; cin >> v;
            while(v-->1) {
                tmp.push(pq.top()); pq.pop();
            }
            pq.pop();
            while(!tmp.empty()) {
                pq.push(tmp.top()); tmp.pop();
            }
        }
    }

    while(!pq.empty()) {
        cout << pq.top() << ' '; pq.pop();
    }
}