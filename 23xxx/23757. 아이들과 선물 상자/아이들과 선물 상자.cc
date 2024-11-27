#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;

    priority_queue<int, vector<int>, less<int>> pq;
    while(N-->0) {
        int present; cin >> present;
        pq.push(present);
    }

    while(M-->0) {
        int want; cin >> want;
        if(!pq.empty() && pq.top()>=want) {
            int top = pq.top(); pq.pop();
            if(top-want>0) pq.push(top-want);
        } else {
            cout << 0;
            return 0;
        }
    }
    cout << 1;
}