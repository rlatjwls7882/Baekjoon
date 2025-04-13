#include<bits/stdc++.h>
using namespace std;

char arr[6][6];
int dx[] = {1, -1, 0, 0};
int dy[] = {0, 0, 1, -1};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            cin >> arr[i][j];
        }
    }

    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            if(arr[i][j]=='T') {
                for(int k=0;k<4;k++) {
                    int x=i, y=j;
                    while(true) {
                        int nx = x+dx[k];
                        int ny = y+dy[k];
                        if(nx<0 || nx>=n || ny<0 || ny>=n || arr[nx][ny]=='O') break;
                        if(arr[nx][ny]=='S') {
                            if(arr[x][y]=='X') {
                                arr[x][y]='O';
                                break;
                            } else {
                                cout << "NO";
                                return 0;
                            }
                        }
                        x = nx, y = ny;
                    }
                }
            }
        }
    }

    int cnt=0, blank=0;
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            if(arr[i][j]=='O') cnt++;
            else if(arr[i][j]=='X') blank++;
        }
    }
    cout << (cnt<=3 && cnt+blank>=3 ? "YES" : "NO");
}