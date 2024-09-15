#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int T; cin >> T;
    while(T-->0) {
        int N, M, K; cin >> N >> M >> K;

        vector<vector<int>> connect = vector<vector<int>>(N+1);
        while(M-->0) {
            int a, b; cin >> a >> b;
            connect[a].push_back(b);
            connect[b].push_back(a);
        }

        int cnt=0;
        bool visited[N+1] = {false, };
        while(K-->0) {
            int cur; cin >> cur;
            if(!visited[cur]) {
                visited[cur]=true;
                cnt++;
            }
            for(int next:connect[cur]) {
                if(!visited[next]) {
                    cnt++;
                    visited[next]=true;
                }
            }
        }
        cout << cnt << '\n';
    }
}