#include<bits/stdc++.h>
using namespace std;

int n, k;
int board[100][100];

bool chk(int r, int c) {
    int cnt = board[r][c];
    for(int i=1;i<200;i++) {
        if(c+i<n) cnt += board[r][c+i];
        if(c-i>=0) cnt += board[r][c-i];
        if(r+i<n) cnt += board[r+i][c];
        if(r+i<n && c+i<n) cnt += board[r+i][c+i];
        if(r+i<n && c-i>=0) cnt += board[r+i][c-i];
        if(r-i>=0) cnt += board[r-i][c];
        if(r-i>=0 && c+i<n) cnt += board[r-i][c+i];
        if(r-i>=0 && c-i>=0) cnt += board[r-i][c-i];
    }
    return cnt == k;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> k;
    
    for(int i=0;i<k;i++) {
        int r, c; cin >> r >> c;
        board[r-1][c-1]++;
    }

    int cnt=0;
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
            if(chk(i, j)) cnt++;
        }
    }
    cout << cnt;
}