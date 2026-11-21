#include<bits/stdc++.h>
using namespace std;

int vis[78][78][78], a[6];

bool cross(int a1, int a2, int b, int c) {
    return a2!=b && a2!=c && (a1<b && a2>b && !(a1<c && a2>c) || a2<b && a1>b && !(a2<c && a1>c) || a1<c && a2>c && !(a1<b && a2>b) || a2<c && a1>c && !(a2<b && a1>b));
}

int main() {
    cin.tie(0)->sync_with_stdio(0);

    vector<int> pos;
    for(int i=0;i<6;i++) {
        cin >> a[i];
        for(int j=-6;j<=6;j++) pos.push_back(a[i]+j);
    }
    sort(pos.begin(), pos.end());
    pos.erase(unique(pos.begin(), pos.end()), pos.end());
    for(int i=0;i<6;i++) a[i] = lower_bound(pos.begin(), pos.end(), a[i])-pos.begin();

    memset(vis, -1, sizeof vis);
    vis[a[0]][a[1]][a[2]]=0;
    queue<tuple<int, int, int>> q; q.push({a[0], a[1], a[2]});
    while(!q.empty()) {
        auto [x, y, z] = q.front(); q.pop();

        for(int i=0;i<pos.size();i++) {
            if(cross(x, i, y, z) && vis[i][y][z]==-1) {
                q.push({i, y, z});
                vis[i][y][z] = vis[x][y][z]+1;
            }
            if(cross(y, i, x, z) && vis[x][i][z]==-1) {
                q.push({x, i, z});
                vis[x][i][z] = vis[x][y][z]+1;
            }
            if(cross(z, i, x, y) && vis[x][y][i]==-1) {
                q.push({x, y, i});
                vis[x][y][i] = vis[x][y][z]+1;
            }
        }
    }
    cout << vis[a[3]][a[4]][a[5]];
}