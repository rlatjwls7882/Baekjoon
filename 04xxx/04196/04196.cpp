#include<bits/stdc++.h>

#define MAX 100001

using namespace std;

int N, idx=1;
int parent[MAX];
bool visited[MAX];
int degree[MAX];
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

    if(parent[cur]==remember) {
        SCCs.push_back(vector<int>());
        while(true) {
            int top = stk.top(); stk.pop();
            SCCs.back().push_back(top);
            visited[top]=true;
            parent[top]=remember;
            if(top==cur) {
                break;
            }
        }
    }
    return remember;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;

    while(t-->0) {
        int M; cin >> N >> M;

        idx=1;
        connect = vector<vector<int>>(N+1);
        fill(parent, parent+MAX, 0);
        fill(degree, degree+MAX, 0);
        fill(visited, visited+MAX, false);
        SCCs = vector<vector<int>>();
        stk = {};

        while(M-->0) {
            int x, y; cin >> x >> y;
            connect[x].push_back(y);
        }

        for(int i=1;i<=N;i++) {
            if(!visited[i]) {
                dfs(i);
            }
        }

        for(int i=1;i<=N;i++) {
            for(int next:connect[i]) {
                if(parent[i]!=parent[next]) {
                    degree[parent[next]]++;
                }
            }
        }

        int cnt=0;
        for(int i=0;i<SCCs.size();i++) {
            if(degree[parent[SCCs[i][0]]]==0) {
                cnt++;
            }
        }
        cout << cnt << endl;
    }
}