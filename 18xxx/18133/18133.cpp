#include<bits/stdc++.h>
using namespace std;

const int MAX = 100000;
vector<vector<int>> conn(MAX), SCCs;
bool visited[MAX];
int idx=1, parent[MAX];
stack<int> stk;

int dfs(int cur) {
    int remember = parent[cur] = idx++;
    stk.push(cur);
    for(int next:conn[cur]) {
        if(!parent[next]) remember = min(remember, dfs(next));
        else if(!visited[next]) remember = min(remember, parent[next]);
    }
    if(remember == parent[cur]) {
        SCCs.push_back(vector<int>());
        while(true) {
            int top = stk.top(); stk.pop();
            parent[top] = remember;
            visited[top] = true;
            SCCs.back().push_back(top);
            if(top==cur) break;
        }
    }
    return remember;
}

void bfs(int i) {
    queue<int> q;
    for(int val:SCCs[i]) {
        q.push(val);
        visited[val]=true;
    }

    while(!q.empty()) {
        int cur = q.front(); q.pop();
        for(int next:conn[cur]) {
            if(!visited[next]) {
                visited[next]=true;
                q.push(next);
            }
        }
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    while(M-->0) {
        int x, y; cin >> x >> y;
        conn[x-1].push_back(y-1);
    }

    for(int i=0;i<N;i++) {
        if(!visited[i]) dfs(i);
    }

    int cnt=0;
    memset(visited, false, sizeof(visited));
    for(int i=SCCs.size()-1;i>=0;i--) {
        if(!visited[SCCs[i][0]]) {
            bfs(i);
            cnt++;
        }
    }
    cout << cnt;
}