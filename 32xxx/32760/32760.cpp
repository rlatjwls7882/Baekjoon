#include<bits/stdc++.h>
using namespace std;

int visitCnt[100001];
vector<vector<int>> conn(100001);

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, M; cin >> N >> M;
    while(M-->0) {
        int u, v; cin >> u >> v;
        if(u>v) swap(u, v);
        conn[u].push_back(v);
    }

    for(int i=1;i<=N;i++) {
        for(int next:conn[i]) {
            visitCnt[next]++;
        }
    }

    vector<char> res;
    for(int i=2;i<=N;i++) {
        if(visitCnt[i]==0) res.push_back('N');
        else if(visitCnt[i]==i-1) res.push_back('E');
        else {
            cout << -1;
            return 0;
        }
    }
    for(char e:res) cout << e;
}