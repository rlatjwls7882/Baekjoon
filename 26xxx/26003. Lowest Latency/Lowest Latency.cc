#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef long double ld;
const ll border = 1e7;

struct element {
    ll x, y, z;
};

int dx[] = {1, 1, 1, 1, 0, 0, 0};
int dy[] = {1, 1, 0, 0, 1, 1, 0};
int dz[] = {1, 0, 1, 0, 1, 0, 1};

vector<vector<vector<vector<element>>>> board(101, vector<vector<vector<element>>>(101, vector<vector<element>>(101)));

ld minDist = 1e16;

void chkDist(element a, element b) {
    minDist = min(minDist, sqrtl((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y)+(a.z-b.z)*(a.z-b.z)));
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(n--) {
        ll x, y, z; cin >> x >> y >> z;
        board[x/border][y/border][z/border].push_back({x, y, z});
    }

    for(int i=0;i<100;i++) {
        for(int j=0;j<100;j++) {
            for(int k=0;k<100;k++) {
                for(int l=0;l<board[i][j][k].size();l++) for(int m=l+1;m<board[i][j][k].size();m++) chkDist(board[i][j][k][l], board[i][j][k][m]);
                for(int cnt=0;cnt<7;cnt++) {
                    int nx = i+dx[cnt];
                    int ny = j+dy[cnt];
                    int nz = k+dz[cnt];
                    for(int l=0;l<board[i][j][k].size();l++) for(int m=0;m<board[nx][ny][nz].size();m++) chkDist(board[i][j][k][l], board[nx][ny][nz][m]);
                }
            }
        }
    }
    cout << fixed << setprecision(6) << minDist;
}