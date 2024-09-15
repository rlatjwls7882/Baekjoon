#include<bits/stdc++.h>
#define MAX 201
using namespace std;

bool chk[MAX][MAX] = {false, };

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;
    while(m-->0) {
        int a, b; cin >> a >> b;
        chk[a][b]=true;
        chk[b][a]=true;
    }
    
    int cnt=0;
    for(int i=1;i<=n;i++) {
        for(int j=i+1;j<=n;j++) {
            if(chk[i][j]) continue;
            for(int k=j+1;k<=n;k++) {
                if(chk[i][k] || chk[j][k]) continue;
                cnt++;
            }
        }
    }
    cout << cnt;
}