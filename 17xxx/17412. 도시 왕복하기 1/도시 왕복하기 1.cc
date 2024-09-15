#include<bits/stdc++.h>
#define INF 100000
#define MAX 401

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int c[MAX][MAX] = {0, };
    int f[MAX][MAX] = {0, };
    vector<vector<int>> connect = vector<vector<int>>(MAX);

    int N, P; cin >> N >> P;
    while(P-->0) {
        int s, e; cin >> s >> e;
        c[s][e]+=1;
        connect[s].push_back(e);
        connect[e].push_back(s);
    }

    int total=0, S=1, E=2;
    while(true) {
        queue<int> q; q.push(S);
        int prev[MAX]; fill(prev, prev+MAX, -1);
        while(!q.empty() && prev[E]==-1) {
            int cur = q.front(); q.pop();
            for(int next:connect[cur]) {
                if(c[cur][next]-f[cur][next]>0 && prev[next]==-1) {
                    prev[next]=cur;
                    q.push(next);
                    if(next==E) break;
                }
            }
        }
        if(prev[E]==-1) break;

        int flow=INF;
        for(int i=E;i!=S;i=prev[i]) {
            flow = min(flow, c[prev[i]][i]-f[prev[i]][i]);
        }

        for(int i=E;i!=S;i=prev[i]) {
            f[prev[i]][i]+=flow;
            f[i][prev[i]]-=flow;
        }
        total+=flow;
    }
    cout << total;
}