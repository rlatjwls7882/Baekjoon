#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    long long N; cin >> N;

    set<long long> s;
    queue<pair<long long, int>> q; q.push(make_pair(N, 0));
    s.insert(N);
    while(!q.empty()) {
        pair<long long, int> cur = q.front(); q.pop();
        if(cur.first==1) {
            cout << cur.second;
            return 0;
        }

        if(cur.first%2==0) {
            if(!s.count(cur.first/2)) {
                q.push(make_pair(cur.first/2, cur.second+1));
                s.insert(cur.first/2);
            }
        }
        if(cur.first%3==0) {
            if(!s.count(cur.first/3)) {
                q.push(make_pair(cur.first/3, cur.second+1));
                s.insert(cur.first/3);
            }
        }
        if(!s.count(cur.first-1)) {
            q.push(make_pair(cur.first-1, cur.second+1));
            s.insert(cur.first-1);
        }
    }
}