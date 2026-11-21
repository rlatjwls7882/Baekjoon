#include<bits/stdc++.h>
#define INF 100000
#define MAX 801

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    vector<vector<int>> c = vector<vector<int>>(MAX, vector<int>(MAX, 0));
    vector<vector<int>> f = vector<vector<int>>(MAX, vector<int>(MAX, 0));
    vector<vector<int>> connect = vector<vector<int>>(MAX);

    int N, P; cin >> N >> P;
    for(int i=1;i<=N;i++) {
        int a=i*2-1, b=i*2;
        c[a][b]=1;
        connect[a].push_back(b);
        connect[b].push_back(a);
    }

    while(P-->0) {
        int s, e; cin >> s >> e;
        int s1=s*2-1, s2=s*2; // 홀: 도착부분, 짝: 출발부분
        int e1=e*2-1, e2=e*2;
        c[s2][e1]=c[e2][s1]=1;
        connect[s2].push_back(e1);
        connect[e2].push_back(s1);
        connect[e1].push_back(s2); // 역간선
        connect[s1].push_back(e2); // 역간선
    }

    int total=0, S=2, E=3;
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