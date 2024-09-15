#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, m; cin >> n >> m;
    string s[n];
    for(int i=0;i<n;i++) {
        cin >> s[i];
    }

    int preSum[n+1][m+1];
    memset(preSum, 0, sizeof(preSum));

    int maxSize=0;
    for(int i=1;i<=n;i++) {
        for(int j=1;j<=m;j++) {
            if(s[i-1][j-1]=='0') {
                preSum[i][j] = preSum[i-1][j]+1;
                int curLen = preSum[i][j];
                for(int k=j-1;k>0;k--) {
                    curLen = min(curLen, preSum[i][k]);
                    if(curLen==0) break;
                    maxSize = max(maxSize, curLen*(j-k+1));
                }
            }
        }
    }
    cout << maxSize;
}