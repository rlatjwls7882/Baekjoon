#include<bits/stdc++.h>
#define MAX 5001

using namespace std;

int D, idx=1;
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
            visited[top]=true;
            parent[top]=remember;
            SCCs.back().push_back(top);
            if(top==cur) {
                break;
            }
        }
    }
    return remember;
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int L; cin >> D >> L;

    connect = vector<vector<int>>(D+1);
    while(L-->0) {
        int a, b; cin >> a >> b;
        connect[a].push_back(b);
    }

    for(int i=1;i<=D;i++) {
        if(!visited[i]) {
            dfs(i);
        }
    }

    int maxSize=1;
    for(auto SCC:SCCs) {
        maxSize = max(maxSize, (int)SCC.size());
    }
    cout << maxSize;
}