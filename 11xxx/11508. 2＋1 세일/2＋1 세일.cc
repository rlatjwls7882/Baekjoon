#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N; cin >> N;

    priority_queue<int> pq;
    while(N-->0) {
        int C; cin >> C;
        pq.push(C);
    }

    int sum=0;
    while(pq.size()>=3) {
        sum += pq.top(); pq.pop();
        sum += pq.top(); pq.pop(); pq.pop();
    }
    while(!pq.empty()) {
        sum += pq.top(); pq.pop();
    }
    cout << sum;
}