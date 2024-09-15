#include<bits/stdc++.h>
#define MAX 100001

using namespace std;

int deepestCost=0, deepestIdx=0;
bool visited[MAX] = {false, };
vector<vector<pair<int, int>>> child = vector<vector<pair<int, int>>>(MAX);

void dfs(int cur, int cost) {
    if(deepestCost<cost) {
        deepestCost=cost;
        deepestIdx=cur;
    }
    visited[cur]=true;

    for(pair<int, int> next:child[cur]) {
        if(!visited[next.first]) {
            dfs(next.first, cost+next.second);
        }
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int V; cin >> V;
    for(int i=1;i<=V;i++) {
        int cur; cin >> cur;
        while(true) {
            int next; cin >> next;
            if(next==-1) {
                break;
            }
            int cost; cin >> cost;
            child[cur].push_back(make_pair(next, cost));
        }
    }

    dfs(1, 0);

    fill(visited, visited+V+1, false);
    deepestCost=0;
    
    dfs(deepestIdx, 0);
    cout << deepestCost;
}