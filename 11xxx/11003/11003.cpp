#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n, l; cin >> n >> l;

    priority_queue<pair<int, int>, vector<pair<int, int>>, greater<pair<int, int>>> pq;
    for(int i=0;i<n;i++) {
        int A; cin >> A;
        pq.push({A, i});
        while(pq.top().second<i-l+1) pq.pop();
        cout << pq.top().first << ' ';
    }
}