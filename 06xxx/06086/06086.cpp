#include<bits/stdc++.h>
#define INF 1000000000
#define MAX 53

using namespace std;

int toInt(char a) {
    if(a<='Z') return a-'A';
    return a-'a'+26;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int c[MAX][MAX] = {0, };
    int f[MAX][MAX] = {0, };
    vector<vector<int>> connect = vector<vector<int>>(MAX);

    int N; cin >> N;
    while(N-->0) {
        char A, B; int F; cin >> A >> B >> F;
        int a = toInt(A);
        int b = toInt(B);

        c[a][b]=c[b][a] += F;
        connect[a].push_back(b);
        connect[b].push_back(a);
    }

    int total=0, start=toInt('A'), end=toInt('Z');
    while(true) {
        int prev[MAX]; memset(prev, -1, sizeof(prev));
        queue<int> q; q.push(start);

        while(!q.empty() && prev[end]==-1) {
            int cur = q.front(); q.pop();
            for(int next:connect[cur]) {
                if(c[cur][next]-f[cur][next]>0 && prev[next]==-1) {
                    q.push(next);
                    prev[next]=cur;
                    if(next == end) break;
                }
            }
        }
        if(prev[end]==-1) break;

        int flow = INF;
        for(int i=end;i!=start;i=prev[i]) {
            flow = min(flow, c[prev[i]][i]-f[prev[i]][i]);
        }
        for(int i=end;i!=start;i=prev[i]) {
            f[prev[i]][i] += flow;
            f[i][prev[i]] -= flow;
        }
        total += flow;
    }
    cout << total;
}