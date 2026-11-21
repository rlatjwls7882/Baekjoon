#include<bits/stdc++.h>
using namespace std;

int n, s;
bool vis[302*302];
vector<vector<int>> conn(302*302);
set<pair<int, int>> wall;

int cnt, res1=INT_MAX, res2;

int getPos(int i, int j) {
    return i*(n+1)+j;
}

tuple<int, int, int, int> getPoint(int i, int j) {
    int a = (i-1)*n+j;
    int b = a+1;
    int c = a+n;
    int d = c+1;
    return {a, b, c, d};
}

int dfs(int cur) {
    vis[cur]=true;
    int curRet=1;
    for(int next:conn[cur]) {
        if(!vis[next]) {
            int ret = dfs(next);
            curRet += ret;
            if(ret==s) {
                cnt++;
                auto [a, b, c, d] = getPoint(cur/(n+1), cur%(n+1));
                int curRes1, curRes2;
                if(cur+1==next) {
                    curRes1=b;
                    curRes2=d;
                } else if(cur-1==next) {
                    curRes1=a;
                    curRes2=c;
                } else if(cur+n+1==next) {
                    curRes1=c;
                    curRes2=d;
                } else {
                    curRes1=a;
                    curRes2=b;
                }
                if(curRes1<res1 || curRes1==res1 && curRes2<res2) {
                    res1=curRes1;
                    res2=curRes2;
                }
            }
        }
    }
    return curRet;
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    cin >> n >> s;
    for(int i=0;i<n*n-1;i++) {
        int u, v; cin >> u >> v;
        if(u>v) swap(u, v);
        wall.insert({u, v});
    }

    for(int i=1;i<n;i++) {
        for(int j=1;j<n;j++) {
            auto [a, b, c, d] = getPoint(i, j);
            if(!wall.count({a, b})) {
                conn[getPos(i, j)].push_back(getPos(i-1, j));
                conn[getPos(i-1, j)].push_back(getPos(i, j));
            }
            if(!wall.count({b, d})) {
                conn[getPos(i, j)].push_back(getPos(i, j+1));
                conn[getPos(i, j+1)].push_back(getPos(i, j));
            }
            if(!wall.count({a, c})) {
                conn[getPos(i, j)].push_back(getPos(i, j-1));
                conn[getPos(i, j-1)].push_back(getPos(i, j));
            }
            if(!wall.count({c, d})) {
                conn[getPos(i, j)].push_back(getPos(i+1, j));
                conn[getPos(i+1, j)].push_back(getPos(i, j));
            }
        }
    }
    for(int i=0;i<n;i++) {
        dfs(getPos(i, 0));
        dfs(getPos(i, n));
        dfs(getPos(0, i));
        dfs(getPos(n, i));
    }
    if(!cnt) cout << "0\n0 0";
    else cout << cnt << '\n' << res1 << ' ' << res2;
}