#include <bits/stdc++.h>
using namespace std;

int w[10000];
bool visited[10000] = {false, };
int maxW[10000][2] = {0, }; // includeCur, excludeCur
vector<vector<int>> conn(10000);
set<int> res;

void dfs(int cur) {
    visited[cur]=true;
    maxW[cur][0] = w[cur];
    for(int next:conn[cur]) {
        if(!visited[next]) {
            dfs(next);

            if(conn[next].size()==1) {
                maxW[cur][1] += maxW[next][0];
            } else {
                maxW[cur][0] += maxW[next][1];
                maxW[cur][1] += max(maxW[next][0], maxW[next][1]);
            }
        }
    }
}

void findNode(int cur, int inOrEx) {
    visited[cur]=true;
    if(inOrEx==0) res.insert(cur+1);
    for(int next:conn[cur]) {
        if(!visited[next]) {
            if(inOrEx==0 || maxW[next][0]<=maxW[next][1]) findNode(next, 1);
            else findNode(next, 0);
        }
    }
}

int main(){
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) {
        cin >> w[i];
    }

    for(int i=0;i<n-1;i++) {
        int u, v; cin >> u >> v;
        conn[u-1].push_back(v-1);
        conn[v-1].push_back(u-1);
    }
    dfs(0);

    fill(visited, visited+n, false);
    if(maxW[0][0]>maxW[0][1]) findNode(0, 0);
    else findNode(0, 1);

    cout << max(maxW[0][0], maxW[0][1]) << '\n';
    for(int node:res) cout << node << ' ';
}