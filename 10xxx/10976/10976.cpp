#include<bits/stdc++.h>
#define INF 100000
#define MAX 201

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);

    int T; cin >> T;
    while(T-->0) {
        vector<vector<int>> c = vector<vector<int>>(MAX, vector<int>(MAX, 0));
        vector<vector<int>> f = vector<vector<int>>(MAX, vector<int>(MAX, 0));
        vector<vector<int>> connect = vector<vector<int>>(MAX);

        int N, M; cin >> N >> M;
        while(M-->0) {
            int x, y; cin >> x >> y;
            if(x>y) {
                int tmp=x;
                x=y;
                y=tmp;
            }
            c[x][y]=1;
            connect[x].push_back(y);
            connect[y].push_back(x);
        }

        int total=0, start=1, end=N;
        while(true) {
            int prev[MAX]; fill(prev, prev+MAX, -1);
            queue<int> q; q.push(start);
            while(!q.empty() && prev[end]==-1) {
                int cur = q.front(); q.pop();
                for(int next:connect[cur]) {
                    if(c[cur][next]-f[cur][next]>0 && prev[next]==-1) {
                        prev[next]=cur;
                        q.push(next);
                        if(next==end) break;
                    }
                }
            }
            if(prev[end]==-1) break;

            int flow=INF;
            for(int i=end;i!=start;i=prev[i]) {
                flow = min(flow, c[prev[i]][i]-f[prev[i]][i]);
            }
            for(int i=end;i!=start;i=prev[i]) {
                f[prev[i]][i]+=flow;
                f[i][prev[i]]-=flow;
            }
            total+=flow;
        }
        cout << total << '\n';
    }
}