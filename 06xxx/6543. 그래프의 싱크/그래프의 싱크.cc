#include<bits/stdc++.h>
#define MAX 5001

using namespace std;

int n, idx;
int parent[MAX];
bool visited[MAX];
vector<vector<int>> connect;
vector<vector<int>> SCCs;
stack<int> stk;

int dfs(int cur) {
    stk.push(cur);
    int remember = idx;
    parent[cur] = idx++;

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
            parent[top] = remember;
            SCCs.back().push_back(top);
            visited[top]=true;
            if(cur==top) {
                break;
            }
        }
    }
    return remember;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        cin >> n;
        if(n==0) {
            break;
        }
        int m; cin >> m;

        idx=1;
        fill(parent, parent+MAX, 0);
        fill(visited, visited+MAX, false);
        connect = vector<vector<int>>(n+1);
        SCCs = vector<vector<int>>();
        stk = {};

        while(m-->0) {
            int v, w; cin >> v >> w;
            connect[v].push_back(w);
        }

        for(int i=1;i<=n;i++) {
            if(!visited[i]) {
                dfs(i);
            }
        }

        int outDegree[n+1] = {0, };
        for(int cur=1;cur<=n;cur++) {
            for(int next:connect[cur]) {
                if(parent[cur]!=parent[next]) {
                    outDegree[parent[cur]]++;
                    break;
                }
            }
        }

        set<int> s;
        for(auto SCC:SCCs) {
            if(outDegree[parent[SCC[0]]]==0) {
                for(int val:SCC) {
                    s.insert(val);
                }
            }
        }

        for(int val:s) {
            cout << val << " ";
        }
        cout << endl;
    }
}