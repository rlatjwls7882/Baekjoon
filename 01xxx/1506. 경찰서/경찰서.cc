#include<bits/stdc++.h>

using namespace std;

int N, idx=1;
int cost[101];
int parent[101] = {0, };
bool visited[101] = {false, };
vector<vector<int>> road;
vector<vector<int>> SCCs;
stack<int> stk;

int dfs(int cur) {
    stk.push(cur);
    int remember=idx;
    parent[cur]=idx++;

    for(int next:road[cur]) {
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
    cin >> N;
    for(int i=1;i<=N;i++) {
        cin >> cost[i];
    }

    string _map[N];
    for(int i=0;i<N;i++) {
        cin >> _map[i];
    }

    road = vector<vector<int>>(N+1);
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            if(_map[i][j]=='1') {
                road[i+1].push_back(j+1);
            }
        }
    }

    for(int i=1;i<=N;i++) {
        if(!visited[i]) {
            dfs(i);
        }
    }

    int total=0;
    for(vector<int> SCC:SCCs) {
        int _min=INT_MAX;
        for(int idx:SCC) {
            _min = min(_min, cost[idx]);
        }
        total += _min;
    }
    cout << total;
}