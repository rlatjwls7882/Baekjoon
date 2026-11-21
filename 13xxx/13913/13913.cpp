#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, K; cin >> N >> K;

    int visited[150000]; fill(visited, visited+150000, -1);
    queue<pair<int, int>> q; q.push(make_pair(N, 0));
    visited[N]=-2;
    while(!q.empty()) {
        pair<int, int> cur = q.front(); q.pop();
        if(cur.first==K) {
            cout << cur.second << '\n';
            break;
        }
        if(cur.first-1>=0 && visited[cur.first-1]==-1) {
            visited[cur.first-1]=cur.first;
            q.push(make_pair(cur.first-1, cur.second+1));
        }
        if(cur.first+1<150000 && visited[cur.first+1]==-1) {
            visited[cur.first+1]=cur.first;
            q.push(make_pair(cur.first+1, cur.second+1));
        }
        if(cur.first*2<150000 && visited[cur.first*2]==-1) {
            visited[cur.first*2]=cur.first;
            q.push(make_pair(cur.first*2, cur.second+1));
        }
    }

    vector<int> res;
    for(int i=K;i!=-2;i=visited[i]) {
        res.push_back(i);
    }
    for(int i=res.size()-1;i>=0;i--) {
        cout << res[i] << ' ';
    }
}