#include<bits/stdc++.h>
#define MAX 200001

using namespace std;

int N, idx=1;
int parent[MAX] = {0, };
bool visited[MAX] = {false, };
vector<vector<int>> connect;
vector<vector<int>> SCCs;
stack<int> stk;

int dfs(int cur) {
    stk.push(cur);
    int remember=idx;
    parent[cur]=idx++;

    for(int next:connect[cur]) {
        if(parent[next]==0) {
            remember = min(remember, dfs(next));
        } else if(!visited[next]) {
            remember = min(remember, parent[next]);
        }
    }

    if(remember==parent[cur]) {
        SCCs.push_back(vector<int>());
        while(true) {
            int top = stk.top(); stk.pop();
            parent[top]=remember;
            visited[top]=true;
            SCCs.back().push_back(top);
            if(cur==top) {
                break;
            }
        }
    }
    return remember;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int M; cin >> N >> M;

    connect = vector<vector<int>>(N+1);
    while(M-->0) {
        int v, w; cin >> v >> w;
        connect[v].push_back(w);
    }

    for(int i=1;i<=N;i++) {
        if(!visited[i]) {
            dfs(i);
        }
    }

    if(SCCs.size()==1) {
        cout << "Yes";
    } else {
        cout << "No";
    }
}