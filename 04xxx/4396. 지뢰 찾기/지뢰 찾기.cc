#include<bits/stdc++.h>
using namespace std;

int moveX[8] = {1, 1, 1, 0, 0, -1, -1, -1};
int moveY[8] = {-1, 0, 1, -1, 1, -1, 0, 1};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n; cin >> n;
    string map[n];
    for(int i=0;i<n;i++) {
        cin >> map[i];
    }

    string s[n];
    for(int i=0;i<n;i++) {
        cin >> s[i];
    }

    bool chk=false;
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            if(s[i][j]=='x' && map[i][j]=='*') {
                chk=true;
                i=j=n;
                break;
            }
        }
    }

    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            if(map[i][j]=='*' && chk) {
                cout << '*';
            } else if(s[i][j]=='x') {
                int cnt=0;
                for(int k=0;k<8;k++) {
                    int nextX = i+moveX[k];
                    int nextY = j+moveY[k];
                    if(nextX<0 || nextX>=n || nextY<0 || nextY>=n || map[nextX][nextY]=='.') continue;
                    cnt++;
                }
                cout << cnt;
            } else {
                cout << '.';
            }
        }
        cout << '\n';
    }
}