#include <bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio; cin.tie(); cout.tie();
    int N; cin >> N;
    
    priority_queue<long, vector<long>, greater<long>> pq;
    while(N-->0) {
        int cnt; cin >> cnt;
        long sum=0;
        while(cnt-->0) {
            long tmp; cin >> tmp;
            sum += tmp;
        }
        pq.push(sum);
    }

    long last=0, min=0;
    while(!pq.empty()) {
        long cur=pq.top(); pq.pop();
        min += last+cur;
        last += cur;
    }
    cout << min;
}