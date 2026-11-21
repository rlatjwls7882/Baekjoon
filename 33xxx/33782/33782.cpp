#include<bits/stdc++.h>
using namespace std;

int w, h, n, m;
string motherboard[400], processor[100];

bool match(int r, int c) {
    for(int i=0;i<m;i++) {
        for(int j=0;j<n;j++) {
            if(processor[i][j]!='*' && motherboard[r+i][c+j]!=processor[i][j]) return false;
        }
    }
    return true;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> w >> h;
    for(int i=0;i<h;i++) cin >> motherboard[i];
    cin >> n >> m;
    for(int i=0;i<m;i++) cin >> processor[i];

    int cnt=0;
    for(int i=0;i<h-m+1;i++) {
        for(int j=0;j<w-n+1;j++) {
            cnt += match(i, j);
        }
    }
    cout << cnt;
}