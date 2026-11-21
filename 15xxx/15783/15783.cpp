#include<bits/stdc++.h>
using namespace std;

const int MAX = 100000;
vector<vector<int>> conn(MAX), SCCs;
bool visited[MAX];
int idx, parent[MAX];
stack<int> stk;

int dfs(int cur) {
    int remember = parent[cur] = idx++;
    stk.push(cur);

    for(int next:conn[cur]) {
        if(parent[next]==0) remember = min(remember, dfs(next));
        else if(!visited[next]) remember = min(remember, parent[next]);
    }

    if(parent[cur] == remember) {
        SCCs.push_back(vector<int>());
        while(true) {
            int top = stk.top(); stk.pop();
            SCCs.back().push_back(top);
            visited[top]=true;
            parent[top]=remember;
            if(top==cur) break;
        }
    }
    return remember;
}

void bfs(int i) {
    queue<int> q;
    for(int j=0;j<SCCs[i].size();j++) {
        visited[SCCs[i][j]]=true;
        q.push(SCCs[i][j]);
    }
    while(!q.empty()) {
        int cur = q.front(); q.pop();
        for(int next:conn[cur]) {
            if(!visited[next]) {
                q.push(next);
                visited[next]=true;
            }
        }
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N, M; cin >> N >> M;
    for(int i=0;i<M;i++) {
        int A, B; cin >> A >> B;
        conn[A].push_back(B);
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