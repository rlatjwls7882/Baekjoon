#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, p; cin >> n >> p;

    priority_queue<int> pq[6];
    int cnt=0;
    while(n-->0) {
        int a, b; cin >> a >> b;
        while(!pq[a-1].empty() && pq[a-1].top()>b) {
            pq[a-1].pop();
            cnt++;
        }
        if(pq[a-1].empty() || pq[a-1].top() != b) {
            pq[a-1].push(b);
            cnt++;
        }
    }
    cout << cnt;
}