#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, k; cin >> n >> k;

    priority_queue<int, vector<int>, less<int>> pq[3];
    while(n-->0) {
        int a, b, c; cin >> a >> b >> c;
        pq[0].push(a+b);
        pq[1].push(b+c);
        pq[2].push(a+c);
    }

    int maxSum[3] = {0, };
    while(k-->0) {
        for(int i=0;i<3;i++) {
            maxSum[i] += pq[i].top(); pq[i].pop();
        }
    }
    cout << max(max(maxSum[0], maxSum[1]), maxSum[2]);
}