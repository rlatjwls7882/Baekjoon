#include<bits/stdc++.h>
#define MAX 101

using namespace std;

int parent[MAX] = {0, };
vector<vector<int>> child = vector<vector<int>>(MAX);
int depth[MAX] = {0, };

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    int a, b; cin >> a >> b;

    int m; cin >> m;
    while(m-->0) {
        int x, y; cin >> x >> y;
        parent[y]=x;
        child[x].push_back(y);
        depth[y]=depth[x]+1;

        queue<int> q; q.push(y);
        while(!q.empty()) {
            int cur=q.front(); q.pop();
            for(int next:child[cur]) {
                q.push(next);
                depth[next] = depth[cur]+1;
            }
        }
    }

    int cnt=0;
    while(true) {
        if(depth[a]>depth[b]) {
            cnt++;
            a=parent[a];
        } else {
            cnt++;
            b=parent[b];
        }
        if(a==b) break;
        if(parent[a]==0 && parent[b]==0) {
            cnt=-1;
            break;
        }
    }
    cout << cnt;
}