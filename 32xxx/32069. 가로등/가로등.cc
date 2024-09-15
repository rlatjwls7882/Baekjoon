#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    long long L; int N, K; cin >> L >> N >> K;

    queue<pair<long long, int>> q; 
    for(int i=0;i<N;i++) {
        long long A; cin >> A;
        q.push(make_pair(A, 0));
    }

    set<long long> visited;
    while(!q.empty()) {
        pair<long long, int> cur = q.front(); q.pop();
        if(visited.count(cur.first)) continue;
        cout << cur.second << '\n';
        K--;
        if(K==0) break;
        visited.insert(cur.first);
        if(cur.first-1>=0 && !visited.count(cur.first-1)) q.push(make_pair(cur.first-1, cur.second+1));
        if(cur.first+1<=L && !visited.count(cur.first+1)) q.push(make_pair(cur.first+1, cur.second+1));
    }
}