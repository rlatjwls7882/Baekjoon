#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    vector<vector<int>> connect(N+1);
    while(M-->0) {
        int a, b; cin >> a >> b;
        connect[b].push_back(a);
    }

    int maxCnt=0;
    vector<int> list;
    for(int i=1;i<=N;i++) {
        bool visited[N+1] = {false, };
        queue<int> q; q.push(i);
        visited[i]=true;
        int cnt=1;
        while(!q.empty()) {
            int cur = q.front(); q.pop();
            for(int next:connect[cur]) {
                if(!visited[next]) {
                    visited[next]=true;
                    q.push(next);
                    cnt++;
                }
            }
        }
        if(maxCnt<cnt) {
            list.clear();
            maxCnt=cnt;
        }
        if(maxCnt==cnt) {
            list.push_back(i);
        }
    }

    for(int e:list) {
        cout << e << ' ';
    }
}