#include<bits/stdc++.h>
using namespace std;

const int MAX = 402;
const int S = MAX-2, E = MAX-1;
const int INF = 0x3f3f3f3f;

int c[MAX][MAX], f[MAX][MAX], prv[MAX], level[MAX], last[MAX];
vector<vector<int>> conn(MAX);

bool bfs() {
    memset(level, -1, sizeof level);
    queue<int> q; q.push(S);
    level[S]=0;
    while(!q.empty()) {
        int cur = q.front(); q.pop();
        for(int next:conn[cur]) {
            if(c[cur][next]-f[cur][next]>0 && level[next]==-1) {
                level[next]=level[cur]+1;
                q.push(next);
            }
        }
    }
    return level[E]!=-1;
}

bool dfs(int cur) {
    if(cur==E) return 1;
    for(int &i=last[cur];i<conn[cur].size();i++) {
        int next = conn[cur][i];
        if(level[next]==level[cur]+1 && c[cur][next]-f[cur][next]>0) {
            if(dfs(next)) {
                f[cur][next]++;
                f[next][cur]--;
                return 1;
            }
        }
    }
    return 0;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, F, D; cin >> N >> F >> D;
    for(int i=0;i<F;i++) {
        conn[S].push_back(i);
        conn[i].push_back(S);
        c[S][i]=1;
    }
    for(int i=300;i<300+D;i++) {
        conn[i].push_back(E);
        conn[E].push_back(i);
        c[i][E]=1;
    }
    for(int i=0;i<N;i++) {
        int cowStart = i*2+100, cowEnd = i*2+101;
        conn[cowStart].push_back(cowEnd);
        conn[cowEnd].push_back(cowStart);
        c[cowStart][cowEnd]=1;

        int Fi, Di; cin >> Fi >> Di;
        while(Fi--) {
            int dish; cin >> dish;
            dish--;
            conn[dish].push_back(cowStart);
            conn[cowStart].push_back(dish);
            c[dish][cowStart]=1;
        }
        while(Di--) {
            int drink; cin >> drink;
            drink += 299;
            conn[cowEnd].push_back(drink);
            conn[drink].push_back(cowEnd);
            c[cowEnd][drink]=1;
        }
    }

    int flow=0;
    while(bfs()) {
        memset(last, 0, sizeof last);
        while(true) {
            if(!dfs(S)) break;
            flow++;
        }
    }
    cout << flow;
}