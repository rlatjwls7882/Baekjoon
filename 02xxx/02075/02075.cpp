#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    priority_queue<int, vector<int>, greater<int>> pq;
    for(int i=0;i<N*N;i++) {
        int tmp; cin >> tmp;
        pq.push(tmp);
        if(pq.size()>N) {
            pq.pop();
        }
    }
    cout << pq.top();
}