#include<bits/stdc++.h>
using namespace std;

priority_queue<int> pq[11];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, k; cin >> n >> k;

    while(n--) {
        int p, w; cin >> p >> w;
        pq[p-1].push(w);
    }

    int last=0;
    while(k-->-1) {
        int cur=0;
        for(int i=0;i<11;i++) {
            if(!pq[i].empty()) {
                int top = pq[i].top(); pq[i].pop();
                cur += top;
                pq[i].push(max(top-1, 1));
            }
        }
        last = cur;
    }
    cout << last;
}