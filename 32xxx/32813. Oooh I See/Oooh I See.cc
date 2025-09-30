#include<bits/stdc++.h>
using namespace std;

string board[50];
int dx[] = {1, 1, 1, 0, 0, -1, -1, -1};
int dy[] = {-1, 0, 1, -1, 1, -1, 0, 1};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int r, c; cin >> r >> c;
    for(int i=0;i<r;i++) cin >> board[i];

    int total=0, res_r, res_c;
    for(int i=1;i<r-1;i++) {
        for(int j=1;j<c-1;j++) {
            if(board[i][j]=='0') {
                int cnt=0;
                for(int k=0;k<8;k++) {
                    int nx = i+dx[k];
                    int ny = j+dy[k];
                    if(nx<0 || nx>=r || ny<0 || ny>=c || board[nx][ny]=='0') continue;
                    cnt++;
                }
                if(cnt==8) {
                    total++;
                    res_r=i+1;
                    res_c=j+1;
                }
            }
        }
    }
    
    if(!total) cout << "Oh no!";
    else if(total==1) cout << res_r << ' ' << res_c;
    else cout << "Oh no! " << total << " locations";
}