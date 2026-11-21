#include <bits/stdc++.h>
using namespace std;

int start, total=0, cnt=0, maxCnt=0;
int depth[1000000] = {0, };
bool edge[1000000] = {false, };
vector<vector<int>> conn(1000000);

void dfs(int cur) {
    for(int next:conn[cur]) {
        if(!depth[next]) {
            depth[next] = depth[cur]+1;
            dfs(next);
        }
    }
    if(edge[cur] && depth[cur]%2==1) cnt++;
}

void findMax(int cur) {
    int except1=0, except2=0;
    if(edge[cur]) {
        if(depth[cur]%2==1) except1++;
        else except2++;
    }
    for(int next:conn[cur]) {
        if(depth[next]>depth[cur]) {
            findMax(next);
        }
        if(edge[next]) {
            if(depth[next]%2==1) except1++;
            else except2++;
        }
    }
    if((depth[cur]-depth[start])%2==0) maxCnt = max(maxCnt, cnt-except1);
    else maxCnt = max(maxCnt, total-cnt-except2);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    if(N==1) {
        cout << 1;
        return 0;
    }
    for(int i=0;i<N-1;i++) {
        int u, v; cin >> u >> v;
        conn[u-1].push_back(v-1);
        conn[v-1].push_back(u-1);
    }

    for(int i=0;i<N;i++) {
        if(conn[i].size()==1) {
            start=i;
            total++;
            edge[i]=true;
        }
    }

    depth[start]=1;
    dfs(start);
    findMax(start);
    cout << maxCnt;
}