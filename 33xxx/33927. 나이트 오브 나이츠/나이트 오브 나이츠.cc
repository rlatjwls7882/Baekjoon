#include<bits/stdc++.h>
#pragma GCC optimize("O3,unroll-loops")
#pragma GCC target("fma")
using namespace std;

typedef long long ll;
typedef long double ld;

const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;
const ld PI = acos(-1);

bool vis[4][4];
int n, res, a[4][4];
int dx[] = {1, 1, 2, 2, -1, -1, -2, -2};
int dy[] = {2, -2, 1, -1, 2, -2, 1, -1};

void back(int start=0, int score=0) {
    res = max(res, score);
    for(int i=start;i<n*n;i++) {
        int x=i/n;
        int y=i%n;

        bool chk=true;
        for(int j=0;j<8;j++) {
            int nx=x+dx[j];
            int ny=y+dy[j];
            if(nx<0 || nx>=n || ny<0 || ny>=n) continue;
            if(vis[nx][ny]) {
                chk=false;
                break;
            }
        }
        if(chk) {
            vis[x][y]=true;
            back(i+1, score+a[x][y]);
            vis[x][y]=false;
        }
    }
}

int main() {
    cin.tie(0)->sync_with_stdio(0);
    cin >> n;
    for(int i=0;i<n;i++) for(int j=0;j<n;j++) cin >> a[i][j];
    back();
    cout << res;
}