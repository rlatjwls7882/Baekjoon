#include<bits/stdc++.h>
using namespace std;

int cur[101][101];

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    while(n--) {
        int x, y; cin >> x >> y;
        for(int i=x;i<x+10;i++) for(int j=y;j<y+10;j++) cur[i][j]=1;
    }
    for(int i=1;i<100;i++) for(int j=1;j<100;j++) cur[i][j] += cur[i-1][j]+cur[i][j-1]-cur[i-1][j-1];

    int maxSize=0;
    for(int i=1;i<100;i++) {
        for(int j=1;j<100;j++) {
            for(int k=i;k<100;k++) {
                for(int l=j;l<100;l++) {
                    if(cur[k][l]-cur[i-1][l]-cur[k][j-1]+cur[i-1][j-1]==(k-i+1)*(l-j+1)) maxSize = max(maxSize, (k-i+1)*(l-j+1));
                }
            }
        }
    }
    cout << maxSize;
}