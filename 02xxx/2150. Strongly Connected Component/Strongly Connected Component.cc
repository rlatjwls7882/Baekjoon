#include<bits/stdc++.h>

using namespace std;

int V, E;
int idx=1;
int parent[10001] = {0, };
bool visited[10001] = {false, };
vector<vector<int>> connected;
vector<vector<int>> SCCs;
stack<int> stk;

int dfs(int cur) {
    stk.push(cur);
    int remember = idx;
    parent[cur]=idx++;

    for(int next:connected[cur]) {
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
            SCCs.back().push_back(top);
            parent[top]=remember;
            visited[top]=true;
            if(top==cur) {
                break;
            }
        }
    }
    return remember;
}

int main(void) {
    ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
    cin >> V >> E;
    connected = vector<vector<int>>(V+1);

    while(E-->0) {
        int S, E; cin >> S >> E;
        connected[S].push_back(E);
    }

    // dfs
    for(int i=1;i<=V;i++) {
        if(!visited[i]) {
            dfs(i);
        }
    }

    // sort
    for(int i=0;i<SCCs.size();i++) {
        sort(SCCs[i].begin(), SCCs[i].end());
    }
    sort(SCCs.begin(), SCCs.end());

    // print
    cout << SCCs.size() << endl;
    for(int i=0;i<SCCs.size();i++) {
        for(int val:SCCs[i]) {
            cout << val << " ";
        }
        cout << "-1\n";
    }
}