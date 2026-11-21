#include<bits/stdc++.h>
using namespace std;

int N;
int connect[10][10];
int minCost = 100000000;
bool visited[10] = {false, };
void dfs(int cur, int depth, int cost) {
    if(depth==N) {
        if(connect[cur][0]) minCost = min(minCost, cost+connect[cur][0]);
        return;
    }
    for(int next=0;next<N;next++) {
        if(!visited[next] && connect[cur][next]) {
            visited[next]=true;
            dfs(next, depth+1, cost+connect[cur][next]);
            visited[next]=false;
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N;
    for(int i=0;i<N;i++) {
        for(int j=0;j<N;j++) {
            cin >> connect[i][j];
        }
    }
    visited[0]=true;
    dfs(0, 1, 0);
    cout << minCost;
}