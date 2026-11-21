#include<bits/stdc++.h>
using namespace std;

#define x first
#define y second

typedef pair<int, int> pii;

int a[50][50], res[3];
int dx[] = {0, 1, 0, -1};
int dy[] = {-1, 0, 1, 0};
int bdx[] = {-1, 1, 0, 0};
int bdy[] = {0, 0, -1, 1};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n, m; cin >> n >> m;
    for(int i=0;i<n;i++) for(int j=0;j<n;j++) cin >> a[i][j];

    while(m--) {
        int d, s; cin >> d >> s;
        int cx=n/2, cy=n/2, dir=0, dist=0;
        for(int i=1;i<=s;i++) a[cx+bdx[d-1]*i][cy+bdy[d-1]*i]=0;

        vector<pii> last;
        for(int t=0;0<=cx && cx<n && 0<=cy && cy<n;t++) {
            if(t%2==0) dist++;
            for(int i=0;i<dist;i++) {
                cx+=dx[dir];
                cy+=dy[dir];
                if(cx<0 || cx>=n || cy<0 || cy>=n || !a[cx][cy]) continue;
                if(last.empty() || last.back().x!=a[cx][cy]) last.push_back({a[cx][cy], 1});
                else last.back().y++;
                a[cx][cy]=0;
            }
            dir = (dir+1)%4;
        }

        while(true) {
            vector<pii> cur;
            for(auto e:last) {
                if(e.y>=4) {
                    res[e.x-1]+=e.y;
                    continue;
                }
                if(cur.empty() || cur.back().x!=e.x) cur.push_back(e);
                else cur.back().y+=e.y;
            }
            if(last==cur) break;
            last=cur;
        }

        vector<int> ins;
        for(auto e:last) {
            ins.push_back(e.y);
            ins.push_back(e.x);
        }

        int idx=0;
        cx=n/2, cy=n/2, dir=0, dist=0;
        for(int t=0;0<=cx && cx<n && 0<=cy && cy<n && idx<ins.size();t++) {
            if(t%2==0) dist++;
            for(int i=0;i<dist;i++) {
                cx+=dx[dir];
                cy+=dy[dir];
                if(cx<0 || cx>=n || cy<0 || cy>=n || idx>=ins.size()) continue;
                a[cx][cy]=ins[idx++];
            }
            dir = (dir+1)%4;
        }
    }
    cout << res[0] + res[1]*2 + res[2]*3;
}