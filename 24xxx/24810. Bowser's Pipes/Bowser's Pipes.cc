#include<bits/stdc++.h>
using namespace std;

int visited[100000];
vector<set<int>> conn(100000);
map<int, pair<int, int>> closestRoom;

void dfs(int root, int cur, int depth) {
    visited[cur]=root;
    if(conn[cur].empty()) {
        if(closestRoom[root].second>depth || closestRoom[root].second==depth && closestRoom[root].first>cur) {
            closestRoom[root] = {cur, depth};
        }
        return;
    }
    for(int next:conn[cur]) {
        if(!visited[next]) {
            dfs(root, next, depth+1);
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    vector<int> coinRooms;
    for(int i=0;i<n;i++) {
        int F; cin >> F;
        if(F==-1) coinRooms.push_back(i);
        else conn[F].insert(i);
    }

    for(int coinRoomIdx:coinRooms) {
        closestRoom[coinRoomIdx]={-1, 100001};
        dfs(coinRoomIdx, coinRoomIdx, 0);
    }

    int A; cin >> A;
    while(A-->0) { 
        int D; cin >> D;
        cout << closestRoom[visited[D]].first << '\n';
    }
}