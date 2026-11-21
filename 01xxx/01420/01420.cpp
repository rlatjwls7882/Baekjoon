#include<bits/stdc++.h>
using namespace std;

const int MAX = 20000;
const int INF = 0x3f3f3f3f;

int moveX[2] = {1, 0};
int moveY[2] = {0, 1};
short prv[MAX];
map<int, map<int, int>> c;

string s[100];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, M; cin >> N >> M;
    for(int i=0;i<N;i++) cin >> s[i];
    for(int i=0;i<N*M*2;i+=2) {
        c[i][i+1]=1; // 짝수: 들어오는 곳, 홀수: 나가는 곳
    }

    int S, E;
    for(int i=0;i<N;i++) {
        for(int j=0;j<M;j++) {
            if(s[i][j]!='#') {
                int cur = (i*M+j)*2;
                if(s[i][j]=='K') S = cur+1;
                else if(s[i][j]=='H') E = cur;
                for(int k=0;k<2;k++) {
                    int nx = i+moveX[k];
                    int ny = j+moveY[k];
                    if(nx<0 || nx>=N || ny<0 || ny>=M || s[nx][ny]=='#') continue;
                    int next = (nx*M+ny)*2;
                    c[cur+1][next]++;
                    c[next+1][cur]++;
                }
            }
        }
    }
    if(c[S][E]) {
        cout << -1;
        return 0;
    }

    int flow=0;
    while(true) {
        memset(prv, -1, sizeof prv);
        queue<int> q; q.push(S);
        while(!q.empty() && prv[E]==-1) {
            int cur = q.front(); q.pop();
            for(auto next:c[cur]) {
                if(next.second>0 && prv[next.first]==-1) {
                    prv[next.first]=cur;
                    q.push(next.first);
                    if(next.second==E) break;
                }
            }
        }
        if(prv[E]==-1) break;

        for(int i=E;i!=S;i=prv[i]) {
            c[prv[i]][i]--;
            c[i][prv[i]]++;
        }
        flow++;
    }
    cout << flow;
}