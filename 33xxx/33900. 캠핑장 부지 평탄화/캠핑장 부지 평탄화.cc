#include<bits/stdc++.h>
using namespace std;

int n, m, r, c;
int board[1000][1000], plan[10][10];

bool chk(int a, int b) {
    set<int> vals;
    for(int i=0;i<r;i++) for(int j=0;j<c;j++) vals.insert(board[a+i][b+j]-plan[i][j]);
    return vals.size()==1;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m >> r >> c;
    for(int i=0;i<n;i++) for(int j=0;j<m;j++) cin >> board[i][j];
    for(int i=0;i<r;i++) for(int j=0;j<c;j++) cin >> plan[i][j];

    int cnt=0;
    for(int i=0;i<n-r+1;i++) for(int j=0;j<m-c+1;j++) cnt += chk(i, j);
    cout << cnt;
}