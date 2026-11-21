#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, m, k; cin >> n >> m >> k;
    priority_queue<int, vector<int>, greater<int>> pq;
    for(int i=0;i<m;i++) pq.push(0);

    while(n--) {
        int t; cin >> t;
        pq.push(pq.top() + t); pq.pop();
    }
    cout << (pq.top()<=k ? "WAIT" : "GO");
}