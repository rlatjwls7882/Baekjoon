#include<bits/stdc++.h>
using namespace std;

string s[10];
bool chk[10][10];

void bubble(int r, int c) {
    for(int i=0;i<10;i++) {
        chk[i][c]=chk[r][i]=true;
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int r, c; cin >> r >> c;
    
    for(int i=0;i<10;i++) cin >> s[i];
    
    for(int i=0;i<10;i++) {
        for(int j=0;j<10;j++) {
            if(s[i][j]=='o') bubble(i, j);
        }
    }
    
    int minDist=20;
    for(int i=0;i<10;i++) {
        for(int j=0;j<10;j++) {
            if(!chk[i][j]) {
                minDist = min(minDist, abs(i+1-r)+abs(j+1-c));
            }
        }
    }
    cout << minDist;
}