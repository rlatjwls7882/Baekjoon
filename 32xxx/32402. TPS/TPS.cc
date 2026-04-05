#include<bits/stdc++.h>
using namespace std;

int dx[] = {0, 1, 0, -1};
int dy[] = {1, 0, -1, 0};

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;

    int x=0, y=0, dir=0;
    while(n--) {
        string s; cin >> s;
        if(s=="W") {
            x+=dx[dir];
            y+=dy[dir];
        } else if(s=="D") {
            x+=dx[(dir+1)%4];
            y+=dy[(dir+1)%4];
        } else if(s=="S") {
            x+=dx[(dir+2)%4];
            y+=dy[(dir+2)%4];
        } else if(s=="A") {
            x+=dx[(dir+3)%4];
            y+=dy[(dir+3)%4];
        } else if(s=="MR") {
            dir = (dir+1)%4;
        } else {
            dir = (dir+3)%4;
        }
        cout << x << ' ' << y << ' ' << x-dx[dir] << ' ' << y-dy[dir] << '\n';
    }
}