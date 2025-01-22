#include<bits/stdc++.h>
using namespace std;

const int MAX = 101101;
const int S = 0, E = MAX-1;
const int INF = 0x3f3f3f3f;

map<int, map<int, int>> c;
int nodeNum[1001], connNode[1001], prv[MAX];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int M, N; cin >> M >> N;
    for(int i=1;i<=M;i++) {
        cin >> c[S][i];
        nodeNum[i]=i;
    }

    int newNodeNum=M+N+1;
    for(int i=1;i<=N;i++) {
        int cnt; cin >> cnt;
        for(int j=0;j<cnt;j++) {
            cin >> connNode[j];
            c[nodeNum[connNode[j]]][i+M]=INF;
        }
        int curC; cin >> curC;
        c[i+M][E]=curC;

        if(cnt>1) {
            for(int j=0;j<cnt;j++) {
                for(int k=0;k<cnt;k++) {
                    c[nodeNum[connNode[j]]][newNodeNum+k]=INF;
                }
                nodeNum[connNode[j]]=newNodeNum+j;
            }
            newNodeNum+=cnt;
        }
    }

    int total_flow=0;
    while(true) {
        memset(prv, -1, sizeof prv);
        queue<int> q; q.push(S);
        while(!q.empty() && prv[E]==-1) {
            int cur = q.front(); q.pop();
            for(auto next:c[cur]) {
                if(next.second>0 && prv[next.first]==-1) {
                    prv[next.first]=cur;
                    q.push(next.first);
                    if(next.first==E) break;
                }
            }
        }
        if(prv[E]==-1) break;

        int flow = INF;
        for(int i=E;i!=S;i=prv[i]) {
            flow = min(flow, c[prv[i]][i]);
        }
        for(int i=E;i!=S;i=prv[i]) {
            c[prv[i]][i] -= flow;
            c[i][prv[i]] += flow;
        }
        total_flow += flow;
    }
    cout << total_flow;
}