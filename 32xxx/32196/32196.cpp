#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    long long N, M, K, X, Y; cin >> N >> M >> K >> X >> Y;
    priority_queue<long long, vector<long long>, greater<long long>> pq;
    while(N-->0) {
        long long A, B; cin >> A >> B;
        pq.push(A*X-B*Y);
    }

    long long sum=K*(X+Y);
    while(M-->0) {
        sum += pq.top(); pq.pop();
    }
    cout << sum;
}