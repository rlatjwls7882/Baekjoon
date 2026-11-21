#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;

    bool odd[500001] = {false, }, even[500001] = {false, };
    queue<pair<int, int>> q; q.push({N, 0});
    even[N]=true;
    while(!q.empty()) {
        pair<int, int> cur = q.front(); q.pop();
        if(K+cur.second*(cur.second+1)/2>500000) {
            cout << -1;
            return 0;
        }

        if(cur.second%2==0) {
            if(even[K+cur.second*(cur.second+1)/2]) {
                cout << cur.second;
                return 0;
            }
            if(cur.first+1<=500000 && !odd[cur.first+1]) {
                q.push({cur.first+1, cur.second+1});
                odd[cur.first+1]=true;
            }
            if(cur.first-1>=0 && !odd[cur.first-1]) {
                q.push({cur.first-1, cur.second+1});
                odd[cur.first-1]=true;
            }
            if(cur.first*2<=500000 && !odd[cur.first*2]) {
                q.push({cur.first*2, cur.second+1});
                odd[cur.first*2]=true;
            }
        } else {
            if(odd[K+cur.second*(cur.second+1)/2]) {
                cout << cur.second;
                return 0;
            }
            if(cur.first+1<=500000 && !even[cur.first+1]) {
                q.push({cur.first+1, cur.second+1});
                even[cur.first+1]=true;
            }
            if(cur.first-1>=0 && !even[cur.first-1]) {
                q.push({cur.first-1, cur.second+1});
                even[cur.first-1]=true;
            }
            if(cur.first*2<=500000 && !even[cur.first*2]) {
                q.push({cur.first*2, cur.second+1});
                even[cur.first*2]=true;
            }
        }
    }
}