#include<bits/stdc++.h>
using namespace std;

int moveX[4] = {0, 1, 0, -1};
int moveY[4] = {1, 0, -1, 0};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int t; cin >> t;
    while(t-->0) {
        int minX=0, minY=0, maxX=0, maxY=0;
        int curX=0, curY=0;
        int move=0;
        string s; cin >> s;
        for(int i=0;i<s.length();i++) {
            if(s[i]=='R') move = (move+1)%4;
            else if(s[i]=='L') move = (move+3)%4;
            else {
                if(s[i]=='F') {
                    curX += moveX[move];
                    curY += moveY[move];
                } else {
                    curX += moveX[(move+2)%4];
                    curY += moveY[(move+2)%4];
                }
                minX = min(minX, curX);
                maxX = max(maxX, curX);
                minY = min(minY, curY);
                maxY = max(maxY, curY);
            }
        }
        cout << (maxX-minX)*(maxY-minY) << '\n';
    }
}