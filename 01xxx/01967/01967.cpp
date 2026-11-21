#include<bits/stdc++.h>
#define MAX 10001

using namespace std;

int deepestCost=0, deepestIdx=0;
bool visited[MAX] = {false, };
vector<vector<pair<int, int>>> child = vector<vector<pair<int, int>>>(MAX);

void dfs(int cur, int cost) {
    if(cost>deepestCost) {
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
    int N; cin >> N;

    for(int i=0;i<N-1;i++) {
        int pa, chi, co; cin >> pa >> chi >> co;
        child[pa].push_back(make_pair(chi, co));
        child[chi].push_back(make_pair(pa, co));
    }

    dfs(1, 0);
    fill(visited, visited+N+1, false);
    deepestCost=0;

    dfs(deepestIdx, 0);
    cout << deepestCost;
}