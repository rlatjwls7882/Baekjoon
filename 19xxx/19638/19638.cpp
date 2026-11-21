#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, Hcenti, T; cin >> N >> Hcenti >> T;
    priority_queue<int> pq;
    while(N-->0) {
        int H; cin >> H;
        pq.push(H);
    }

    int cnt=0;
    while(cnt<T) {
        if(pq.top()<Hcenti) break;
        int top = pq.top(); pq.pop();
        pq.push(max(1, top/2));
        cnt++;
    }
    if(pq.top()<Hcenti) cout << "YES\n" << cnt;
    else cout << "NO\n" << pq.top();
}