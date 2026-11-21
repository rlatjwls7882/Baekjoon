#include<bits/stdc++.h>
using namespace std;

int n, m, k;
int a[2501][2501], preSumRow[2501][2501], preSumCol[2501][2501];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m >> k;
    for(int i=1;i<=n;i++) {
        for(int j=1;j<=m;j++) {
            cin >> a[i][j];
            preSumCol[i][j] += preSumCol[i][j-1]+a[i][j];
        }
    }
    for(int j=1;j<=m;j++) for(int i=1;i<=n;i++) preSumRow[i][j] += preSumRow[i-1][j]+a[i][j];

    int cnt=0;
    for(int i=k+1;i<=n-k;i++) {
        for(int j=k+1;j<=m-k;j++) {
            if(preSumRow[i+k][j]-preSumRow[i-k-1][j]==k*2+1 && preSumCol[i][j+k]-preSumCol[i][j-k-1]==k*2+1) cnt++;
        }
    }
    cout << cnt;
}