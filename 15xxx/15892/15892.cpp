#include<bits/stdc++.h>
#define INF 1000000
#define MAX 301

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    vector<vector<int>> c = vector<vector<int>>(MAX, vector<int>(MAX, 0));
    vector<vector<int>> f = vector<vector<int>>(MAX, vector<int>(MAX, 0));
    vector<vector<int>> connect = vector<vector<int>>(MAX);

    int n, m; cin >> n >> m;
    while(m-->0) {
        int x, y, z; cin >> x >> y >> z;
        c[x][y]=c[y][x]+=z;
        connect[x].push_back(y);
        connect[y].push_back(x);
    }

    int total=0, start=1, end=n;
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
    cout << total;
}